package br.unifei.imc.inimigo;

public abstract class Inimigo {

    protected String nome;
    protected double vida;
    protected String arma;

    public Inimigo(String nome, double vida, String arma) {
        this.nome = nome;
        this.vida = vida;
        this.arma = arma;
    }

    public abstract void tomaDano();

    public abstract void atacar();

}
