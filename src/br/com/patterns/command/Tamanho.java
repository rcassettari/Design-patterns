package br.com.patterns.command;

public enum Tamanho {

    PEQUENO("pequeno"),
    NORMAL("normal");

    private final String tamanho;

    private Tamanho( String tamanho  )
    {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return tamanho;
    }
}