package strategy.personagens;

import strategy.armas.ArmaBehavior;

public abstract class Personagem {
    protected ArmaBehavior armaBehavior;

    public void setArmaBehavior(ArmaBehavior armaBehavior) {
        this.armaBehavior = armaBehavior;
    }

    public void batalhar() {
        armaBehavior.usarArma();
    }
}