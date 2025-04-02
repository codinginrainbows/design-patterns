package strategy;

import strategy.armas.*;
import strategy.personagens.*;

public class Main {
    public static void main(String[] args) {
        Rei rei = new Rei();
        Rainha rainha = new Rainha();
        Cavaleiro cavaleiro = new Cavaleiro();

        rei.batalhar(); // rei batalhando com a arma default
        rainha.batalhar();
        cavaleiro.batalhar();

        rei.setArmaBehavior(new Faca());
        rei.batalhar(); // rei passa a batalhar com a faca

        rei.setArmaBehavior(new Machado());
        rei.batalhar(); // rei passa a batalhar com o machado
    }
}
