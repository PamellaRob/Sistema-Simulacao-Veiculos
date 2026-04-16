/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.simulacaoveiculos;

/**
 *
 * @author rober
 */
public class SimulacaoVeiculos {

    public static void main(String[] args) {
        System.out.println("=== Parte 1: O Primeiro Motor ===");
        
        Carro c1 = new Carro("Fiat", "Argo", 6, "MJKA9873");
        Carro c2 = new Carro("Toyota", "Corolla", 3, "PAM2706");
        
        c1.abastecer(15);
        c2.abastecer(20);
        
        c1.acelerar();
        c2.acelerar(40);
        
        c1.frear();
        c2.frear(20);
        
        System.out.println(c1);
        System.out.println(c2);
        
        Garagem garagem = new Garagem(3);
        garagem.estacionar(c1);
        garagem.estacionar(c2);
        garagem.listarVeiculos();
 
        
        Moto m1 = new Moto("Shineray", "Phoenix 50", 0, 8, "SPIN2167", 699);
        Moto m2 = new Moto("Honda",  "Biz 125", 0, 5, "DRTG7639", 471);
 
        m1.acelerar();
        m1.acelerar();
        System.out.println(m1);
        
        m2.acelerar(5);
        m2.acelerar(5);
        System.out.println(m2);
 
        c1.exibirStatus();
        m1.exibirStatus();
 
        Garagem garagem2 = new Garagem(5);
        garagem2.estacionar(c1);    
        garagem2.estacionar(m1);
        garagem2.estacionar(m2);
        garagem2.listarVeiculos();
 
        c1.ligar();
        c1.ligar("Esportivo");
        m1.ligar();
        m1.ligar("Econômico");
        
        Caminhao cam1 = new Caminhao("Iveco", "Tector", 0, 40, "FLAM9876");
        cam1.abastecer(20, "Diesel");
 
        System.out.println("Consumo Carro:    " + c1.calcularConsumo() + "km/L");
        System.out.println("Consumo Moto:     " + m1.calcularConsumo() + "km/L");
        System.out.println("Consumo Caminhão: " + cam1.calcularConsumo() + "km/L");
 
        SimuladorDeTrafego simulador = new SimuladorDeTrafego(4);
        simulador.adicionarVeiculo(c1);
        simulador.adicionarVeiculo(c2);
        simulador.adicionarVeiculo(m1);
        simulador.adicionarVeiculo(cam1);
 
        simulador.adicionarVeiculo(m2); 
        
        simulador.simuladorDeAceleracao();
        simulador.exibirStatus();
    }
}
