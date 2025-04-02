package strategy.personagens;

import strategy.armas.Arco;

public class Rainha extends Personagem {
    public Rainha() {
        armaBehavior = new Arco();
    }
}
