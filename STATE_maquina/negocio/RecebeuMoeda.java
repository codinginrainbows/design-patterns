package negocio;

public class RecebeuMoeda implements Estado {
    private MaquinaDeGoma maquina;

    public RecebeuMoeda(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Nao é possivel inserir outra moeda");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Moeda devolvida");
        maquina.setEstado(maquina.getEstadoSemMoeda());
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Alavanca acionada....");
        maquina.setEstado(maquina.getEstadoGomaVendida());
    }

    @Override
    public void entregarGoma() {
        System.out.println("Acione a alavanca primeiro");
    }

    @Override
    public String toString() {
        return "Esperando acionamento da alavanca";
    }
}
