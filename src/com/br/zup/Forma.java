package com.br.zup;

public abstract class Forma {
    private int numeroDeLados;
    private int tamanhoDosLados;

    public Forma(int numeroDeLados, int tamanhoDosLados) {
        this.numeroDeLados = numeroDeLados;
        this.tamanhoDosLados = tamanhoDosLados;
    }

    public Forma(){

    }

    public int calcularArea(){
        return tamanhoDosLados * numeroDeLados;
    }
}
