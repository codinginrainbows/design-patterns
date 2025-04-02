package strategy.armas;

public class Arco implements ArmaBehavior {
    @Override
    public void usarArma() {
        System.out.println("Atirando com arco e flecha!");
    }
}
