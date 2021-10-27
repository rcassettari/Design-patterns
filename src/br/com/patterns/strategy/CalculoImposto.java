package br.com.patterns.strategy;

public class CalculoImposto {

    public double calcular(Imposto imposto) {
        return imposto.calcular();
    }

}