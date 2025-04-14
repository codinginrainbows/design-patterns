package negocio;

public class SemMoeda implements Estado {
    private MaquinaDeGoma maquina;

    public SemMoeda(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida");
        maquina.setEstado(maquina.getEstadoRecebeuMoeda());
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Nao há moeda para ejetar");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca acionada, mas nao há moeda");
    }

    @Override
    public void entregarGoma() {
        System.out.println("Insira uma moeda primeiro");
    }

    @Override
    public String toString() {
        return "Aguardando moeda";
    }
}
