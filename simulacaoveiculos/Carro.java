/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacaoveiculos;


public class Carro extends Veiculo{
    private int numeroPortas;
    
    public Carro(String marca, String modelo, int portas, String placa){
        super(marca, modelo, 0,0, placa);
        
        this.numeroPortas = portas;
    }
    
    public Carro(String marca, String modelo, double velocidadeInicial, int portas, String placa){
        super(marca, modelo, velocidadeInicial,0 , placa);
        
        this.numeroPortas = portas;
    }
    
    public int getNumeroPortas() { 
        return numeroPortas; 
    }
    
    public void acelerar(){
        if (getCombustivel() > 0) {
            setVelocidade(getVelocidade() + 10);
            setCombustivel(getCombustivel() - 1);
            
        } else {
            System.out.println(getModelo() + " sem combustível");
        }
    }
    
    public void acelerar(int incremento){
        if (getCombustivel() > 0) {
            setVelocidade(getVelocidade() + incremento);
            setCombustivel(getCombustivel() - 1);
        } else {
            System.out.println(getModelo() + " sem combustível");
        }
    }
    
    public void frear(){
        double novaVelocidade = getVelocidade() - 10;

    if(novaVelocidade < 0){
        novaVelocidade = 0;
    }

    setVelocidade(novaVelocidade);
}
    
    public void frear(int decremento){
        double novaVelocidade = getVelocidade() - decremento;

    if(novaVelocidade < 0){
        novaVelocidade = 0;
    }

    setVelocidade(novaVelocidade);
    }
    
    public String toString(){
        return "Carro: " + getMarca() + " Modelo: " + getModelo() + " Velocidade (Atual): " + getVelocidade() + "km/h";
    }
    
    @Override
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Número de portas: " + numeroPortas);
    }
    
    public void ligar(String modo){
        System.out.println(getModelo() + " ligado no modo: " + modo);
    }
    
    @Override
    public double  calcularConsumo(){
        return 12;
    }
}
