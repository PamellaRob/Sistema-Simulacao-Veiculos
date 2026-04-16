/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacaoveiculos;


public class Garagem {
    private Veiculo[] veiculos;
    private int quantidade = 0;
    
    public Garagem(int tamanho){
        veiculos = new Veiculo[tamanho];
    }
      
    public void estacionar(Carro c){
        System.out.println("Estacionando carro: " + c.getMarca() + " " + c.getModelo()); 
        adicionarVeiculo(c);
    }
    
    public void estacionar(Moto m) {
        System.out.println("Estacionando moto: " + m.getMarca() + " " + m.getModelo());
        adicionarVeiculo(m);
    }
    
     public void estacionar(Veiculo v) {
        System.out.println("Estacionando veículo: " + v.getMarca() + " " + v.getModelo());
        adicionarVeiculo(v);
    }
    
    public void adicionarVeiculo(Veiculo v) {
        if(quantidade < veiculos.length){
            veiculos[quantidade++] = v;
            System.out.println("Veículo estacionado" + " Vagas restantes: " + (veiculos.length - quantidade));
            System.out.println(" ");
        } else {
            System.out.println("Garagem está cheia! Não é possível estacionar");
        }
    
    }
    
     public void listarVeiculos() {
        
        System.out.println("=== Veículos na Garagem ===");
        if (quantidade == 0) {
            System.out.println("Nenhum veículo estacionado");
            return;
        }
        for (int i = 0; i < quantidade; i++) {
            System.out.println("  [" + (i + 1) + "] " + veiculos[i]);
             System.out.println(" ");
        }
    }
     
     public int getQuantidade(){ 
         return quantidade; 
     }
     
    public int getCapacidade(){ 
        return veiculos.length; 
    }


}
