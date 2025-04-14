package negocio;

public class GomasAcabaram implements Estado {
    private MaquinaDeGoma maquina;

    public GomasAcabaram(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Nao é possivel inserir moeda - gomas acabaram");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nao há moedas para ejetar");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca acionada - mas nao há gomas");
    }

    @Override
    public void entregarGoma() {
        System.out.println("Nao há gomas para entregar");
    }

    @Override
    public String toString() {
        return "Sem gomas disponiveis";
    }
}
