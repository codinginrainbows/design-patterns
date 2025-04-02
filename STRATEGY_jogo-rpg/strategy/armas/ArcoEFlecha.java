package strategy.armas;

public class ArcoEFlecha implements ArmaBehavior {
    @Override
    public void usarArma() {
        System.out.println("Batalhando com o ARCO E FLECHA!");
    }
}