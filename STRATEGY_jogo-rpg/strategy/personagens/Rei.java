package strategy.personagens;

import strategy.armas.Espada;

public class Rei extends Personagem {
    public Rei() {
        armaBehavior = new Espada();
    }
}
