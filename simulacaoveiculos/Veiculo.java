/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.simulacaoveiculos;


public class Veiculo {
    private String marca;
    private String modelo;
    private double velocidade;
    private double combustivel;
    private String placa;
    
    public Veiculo(String marca, String modelo, double velocidade, double combustivel, String placa){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidade=velocidade;
        this.combustivel = combustivel;
        this.placa = placa;
    }
    
    
    public String getMarca(){
        return marca;
    }
    
    public String getModelo(){
        return modelo;
    }
    
    public double getVelocidade(){
        return velocidade;
    }
    
    public double getCombustivel(){
        return combustivel;
    }
    
    public String getPlaca(){
        return placa;
    }
    
    public void setMarca(String marca){
      this.marca = marca;
    }
    
    public void setModelo(String modelo){
      this.modelo = modelo;
    }
    
    public void setVelocidade(double velocidade){
      this.velocidade = velocidade;
    }
    
    public void setCombustivel(double c){ 
        this.combustivel = c; 
    }
    
    public void acelerar() {
        if(combustivel > 0){
            setVelocidade(getVelocidade() + 10);
            combustivel--;
        } else {
            System.out.println("Sem combustível");
        }
}
    
    public void acelerar(int incremento) {
        if (combustivel > 0) {
            setVelocidade(getVelocidade() + incremento);
            combustivel--;
        } else {
            System.out.println("Sem combustível");
        }
    }
    
     public void frear() {
        double novaVelocidade = getVelocidade() - 10;

        if(novaVelocidade < 0){
            novaVelocidade = 0;
    }
   }
    public void frear(int decremento) {
        double novaVelocidade = getVelocidade() - decremento;

        if(novaVelocidade < 0){
            novaVelocidade = 0;
    }
   }
    
    public void exibirStatus(){
        System.out.println("=======================================");
        System.out.println("Veículo: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade: " + velocidade + "km/h");
        System.out.println("Combustível: " + combustivel + "L");
    }
    
    public void ligar(){
        System.out.println("Veículo ligado");
    }
    
    public void interagir(Veiculo outro){
        System.out.println(this.modelo + " buzinou para " + outro.getModelo());
    }
    
    public void interagir(Caminhao c){
    System.out.println("Cuidado com caminhão colisão!");
    }
    
    public void interagir(Moto m){
        System.out.println("Moto passando em alta velocidade");
    }
    
    public void interagir(Carro cr){
        System.out.println("Carro ultrapassando");
    }
    
    public void abastecer(double litros){
        this.combustivel += litros;
        System.out.println("Abastecido: " + litros + "L");
    }
    
    public void abastecer(double litros, String tipoCombustivel){
        this.combustivel += litros;
        System.out.println(modelo + " abastecido com " + litros + "L de " + tipoCombustivel);
    }
    
    public double  calcularConsumo(){
          return 10;
    }
    
        @Override
public boolean equals(Object obj){
    if(this == obj) return true;

    if(!(obj instanceof Veiculo)) return false;

    Veiculo v = (Veiculo) obj;

    return this.placa.equals(v.placa);
}

@Override
public int hashCode(){
    return placa.hashCode();
}
}
