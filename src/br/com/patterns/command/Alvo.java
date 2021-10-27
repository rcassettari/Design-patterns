package br.com.patterns.command;

public abstract class Alvo {

    private Tamanho tamanho;

    private Visibilidade visibilidade;

    public void printStatus() {
        System.out.println( " {} " + this + ", [tamanho={}]" + getTamanho() + " [visibilidade={}] " + getVisibilidade()  );
    }

    public void mudaTamanho() {
        var tamanhoAntigo = getTamanho() == Tamanho.NORMAL ? Tamanho.PEQUENO : Tamanho.NORMAL;
        setTamanho(tamanhoAntigo);
    }

    public void mudaVisibilidade() {
        var estadoVisibilidade = getVisibilidade() == Visibilidade.INVISIVEL
                ? Visibilidade.VISIVEL : Visibilidade.INVISIVEL;
        setVisibilidade(estadoVisibilidade);
    }

    public Tamanho getTamanho() {
        return tamanho;
    }

    public void setTamanho(Tamanho tamanho) {
        this.tamanho = tamanho;
    }

    public Visibilidade getVisibilidade() {
        return visibilidade;
    }

    public void setVisibilidade(Visibilidade visibilidade) {
        this.visibilidade = visibilidade;
    }
}