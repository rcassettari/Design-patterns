package br.com.patterns.strategy;

public class Icms implements Imposto {

    private double valor;

    public Icms(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.27;
    }
}

