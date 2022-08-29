package br.unifei.imc.inimigo;

public class ZumbiLerdo extends Inimigo{

    public ZumbiLerdo(String nome, double vida, String arma){
        super(nome, vida, arma);
    }

    @Override
    public void atacar() {
        System.out.println("Zumbi Ledro atacando!");
    }

    @Override
    public void tomaDano() {
        this.vida -= 20;
    }
}
