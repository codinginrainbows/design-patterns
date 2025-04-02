package strategy.personagens;

import strategy.armas.Espada;

public class Cavaleiro extends Personagem {
    public Cavaleiro() {
        armaBehavior = new Espada();
    }
}
