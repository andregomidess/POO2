package br.unifei.imc;

import br.unifei.imc.inimigo.CavaleiroNegro;
import br.unifei.imc.inimigo.Inimigo;
import br.unifei.imc.inimigo.ZumbiLerdo;

public class main {
    public static void main(String[] args){
        Inimigo zumbi = new ZumbiLerdo("Olmes", 100, "Espada");
        Inimigo cavaleiro = new CavaleiroNegro("Hokama", 200, "machado");

        zumbi.atacar();
        cavaleiro.atacar();

    }

}
