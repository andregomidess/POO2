package br.unifei.imc.jogador;

import br.unifei.imc.inimigo.Inimigo;

public class Jogador {

    private String nome;
    private double vida;

    public Jogador(String nome, double vida) {
        this.nome = nome;
        this.vida = vida;
    }

    public void atacar(Inimigo inimigo){
        inimigo.tomaDano();
    }

}
