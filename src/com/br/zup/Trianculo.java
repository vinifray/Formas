package com.br.zup;

public class Trianculo extends Forma {
    private int base;
    private int altura;

    public Trianculo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int calcularArea(){
        return base*altura/2;
    }

}
