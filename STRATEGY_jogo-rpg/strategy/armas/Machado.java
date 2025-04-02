package strategy.armas;

public class Machado implements ArmaBehavior {
    @Override
    public void usarArma() {
        System.out.println("Atacando com machado!");
    }
}