package com.br.zup;

public class Main {

    public static void main(String[] args) {
        Trianculo triangulo = new Trianculo(10, 12);
        System.out.println(triangulo.calcularArea());

        Circulo circulo = new Circulo(12);
        System.out.println(circulo.calcularArea());
        System.out.println(circulo.calcularArea(true));


    }
}
