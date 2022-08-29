package br.unifei.imc.inimigo;

public class CavaleiroDePrata extends Inimigo{

    public CavaleiroDePrata(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    public void ataqueForte(){
        System.out.println("Ataque forte!");
    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro de Prata atacando!");
    }

    @Override
    public void tomaDano() {
        this.vida -= 5;
    }
}
