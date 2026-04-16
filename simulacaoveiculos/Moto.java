/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacaoveiculos;

/**
 *
 * @author rober
 */
public class Moto extends Veiculo{
    private int cilindradas;
    
    public Moto(String marca, String modelo, double velocidade, double combustivel, String placa, int cilindradas) {
        super(marca, modelo, velocidade,combustivel, placa);
        
        this.cilindradas = cilindradas;
    }
    
    public int getCilindradas(){
        return cilindradas;
    }
    
    public void acelerar(){
        if (getCombustivel() > 0) {
            setVelocidade(getVelocidade() + 15);
            setCombustivel(getCombustivel() - 1);
        } else {
            System.out.println(getModelo() + " sem combustível!");
        }
    }
    
    public void acelerar(int incremento) {
        if (getCombustivel() > 0) {
            setVelocidade(getVelocidade() + incremento);
            setCombustivel(getCombustivel() - 1);
        } else {
            System.out.println(getModelo() + " sem combustível!");
        }
    }
    
    public void frear(){
        setVelocidade(Math.max(0, getVelocidade() - 15));
    }
    
    public void frear(int decremento) {
        setVelocidade(Math.max(0, getVelocidade() - decremento));
    }
    
    @Override
    public void exibirStatus(){
        super.exibirStatus();
        System.out.println("Moto: " + getModelo() + " Cilindradas: " + cilindradas);
    }
    
    @Override
    public String toString() {
        return "Moto: " + getMarca() + " Modelo:" + getModelo() + " Velocidade: " + getVelocidade() + "km/h";
    }
    
    public void ligar(String modo){
        System.out.println(getModelo() +" ligada em modo: " + modo);
        
    }
    
    @Override
    public double  calcularConsumo(){
        return 25;
    }

}
