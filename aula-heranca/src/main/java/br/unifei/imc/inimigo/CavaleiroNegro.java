package br.unifei.imc.inimigo;

public class CavaleiroNegro extends Inimigo{

    public CavaleiroNegro(String nome, double vida, String arma) {
        super(nome, vida, arma);
    }

    public void ataqueRapido(){
        System.out.println("Ataque rápido!");
    }

    @Override
    public void tomaDano() {
        this.vida -= 10;
    }

    @Override
    public void atacar() {
        System.out.println("Cavaleiro Negro atacando!");
    }
}
