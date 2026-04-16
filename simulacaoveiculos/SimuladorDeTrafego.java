/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacaoveiculos;


public class SimuladorDeTrafego {
    private Veiculo[] pista;
    private int quantidade = 0;
 
    public SimuladorDeTrafego(int capacidade) {
        pista = new Veiculo[capacidade];
}
    
    public void adicionarVeiculo(Veiculo v) {
        if (quantidade < pista.length) {
            pista[quantidade++] = v;
            System.out.println(v.getMarca() + " Modelo: " + v.getModelo() + " entrou na pista");
        } else {
            System.out.println("A pista está cheia! Não foi possível adicionar o veículo");
        }
    }
 
    public void simuladorDeAceleracao() {
        System.out.println("=== Simulando aceleração ===");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(pista[i].getModelo() + ": ");
            pista[i].acelerar();
            System.out.println("  para " + pista[i]);
        }
    }
 
    public void exibirStatus() {
        System.out.println("=== Status da Pista ===");
        for (int i = 0; i < quantidade; i++) {
            pista[i].exibirStatus();
            System.out.println(" Consumo: " + pista[i].calcularConsumo() + "km/L");
            System.out.println(" ");
        }
    }
}
 