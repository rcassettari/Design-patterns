package br.com.patterns.strategy;

public class Ipi implements Imposto {

    private double valor;

    public Ipi(double valor) {
        this.valor = valor;
    }

    @Override
    public double calcular() {
        return this.valor * 0.30;
    }

}