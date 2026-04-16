/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacaoveiculos;

public class Caminhao extends Veiculo{
    
    public Caminhao(String marca, String modelo, double velocidade, double combustivel, String placa) {
        super(marca, modelo, velocidade, combustivel, placa);
    }
    
    @Override
    public double calcularConsumo(){
        return 4;
    }
    
    @Override
    public void exibirStatus() {
        super.exibirStatus();
        System.out.println("Consumo: " + calcularConsumo() + "km/L");
    }
 
    public void ligar(String modo) {
        System.out.println(getModelo() + " (caminhão) ligado em modo: " + modo);
    }
 
    @Override
    public void acelerar() {
        if (getCombustivel() > 0) {
            setVelocidade(getVelocidade() + 5);
            setCombustivel(getCombustivel() - 3); 
        } else {
            System.out.println(getModelo() + " sem combustível!");
        }
    }
 
    @Override
    public String toString() {
        return "Caminhão: " + getMarca() + " Modelo: " + getModelo() + " Velocidade: " + getVelocidade() + "km/h";
    }
    
}
