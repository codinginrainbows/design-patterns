package negocio;

public class GomaVendida implements Estado {
    private MaquinaDeGoma maquina;

    public GomaVendida(MaquinaDeGoma maquina) {
        this.maquina = maquina;
    }

    @Override
    public void inserirMoeda() {
        System.out.println("Moeda inserida - aguarde a entrega da goma");
    }

    @Override
    public void ejetarMoeda() {
        System.out.println("Desculpe, a goma já foi vendida");
    }

    @Override
    public void acionarAlavanca() {
        System.out.println("Aguarde, já estamos entregando uma goma");
    }

    @Override
    public void entregarGoma() {
        maquina.liberarGoma();
        if (maquina.getQuantidadeGomas() > 0) {
            maquina.setEstado(maquina.getEstadoSemMoeda());
        } else {
            System.out.println("Acabaram as gomas!");
            maquina.setEstado(maquina.getEstadoGomasAcabaram());
        }
    }

    @Override
    public String toString() {
        return "Entregando uma goma";
    }
}
