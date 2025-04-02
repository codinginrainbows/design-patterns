package strategy.armas;

public class Faca implements ArmaBehavior {
    @Override
    public void usarArma() {
        System.out.println("Atacando com faca!");
    }
}
