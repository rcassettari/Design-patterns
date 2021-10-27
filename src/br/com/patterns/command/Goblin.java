package br.com.patterns.command;

public class Goblin extends Alvo {

    public Goblin() {
        setTamanho(Tamanho.NORMAL);
        setVisibilidade(Visibilidade.VISIVEL);
    }

    @Override
    public String toString() {
        return "Goblin";
    }
}