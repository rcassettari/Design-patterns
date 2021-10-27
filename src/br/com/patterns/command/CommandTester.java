package br.com.patterns.command;

public class CommandTester {

    public static void main(String[] args) {
        var magico = new Magico();
        var goblin = new Goblin();

        goblin.printStatus();

        magico.lancaMagia(goblin::mudaTamanho);
        goblin.printStatus();

        magico.lancaMagia(goblin::mudaVisibilidade);
        goblin.printStatus();

        magico.desfazUltimaMagia();
        goblin.printStatus();

        magico.desfazUltimaMagia();
        goblin.printStatus();

        magico.refazUltimaMagia();
        goblin.printStatus();

        magico.refazUltimaMagia();
        goblin.printStatus();
    }
}