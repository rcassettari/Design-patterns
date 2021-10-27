package br.com.patterns.strategy;

public class StrategyTester {

    public static void main(String[] args) {
        CalculoImposto calculadora = new CalculoImposto();
        Icms icms = new Icms(100.0);
        Ipi ipi = new Ipi(100.0);
        System.out.println(calculadora.calcular(icms));
        System.out.println(calculadora.calcular(ipi));
    }

}
