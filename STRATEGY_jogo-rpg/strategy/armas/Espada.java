package strategy.armas;

public class Espada implements ArmaBehavior {
    @Override
    public void usarArma() {
        System.out.println("Atacando com espada!");
    }
}
