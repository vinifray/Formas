package com.br.zup;

public class Circulo extends Forma {
    public double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public int calcularArea(){
        double resultaddo = raio*raio*3.14;
        return (int) resultaddo;
    }

    public double calcularArea(boolean numeroQuebrado){
        double resultaddo = raio*raio*3.14;
        return resultaddo;
    }

}
