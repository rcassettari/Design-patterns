package br.com.patterns.command;

public enum Visibilidade {

    VISIVEL("visivel"),
    INVISIVEL("invisivel");

    private final String visibilidade;

    private Visibilidade( String visibilidade  )
    {
        this.visibilidade = visibilidade;
    }

    @Override
    public String toString() {
        return visibilidade;
    }
}

