package negocio;

public class MaquinaDeGoma {
    private Estado estadoSemMoeda;
    private Estado estadoRecebeuMoeda;
    private Estado estadoGomaVendida;
    private Estado estadoGomasAcabaram;

    private Estado estadoAtual;
    private int quantidadeGomas;

    public MaquinaDeGoma(int quantidadeGomas) {
        this.estadoSemMoeda = new SemMoeda(this);
        this.estadoRecebeuMoeda = new RecebeuMoeda(this);
        this.estadoGomaVendida = new GomaVendida(this);
        this.estadoGomasAcabaram = new GomasAcabaram(this);

        this.quantidadeGomas = quantidadeGomas;

        if (quantidadeGomas > 0) {
            this.estadoAtual = estadoSemMoeda;
        } else {
            this.estadoAtual = estadoGomasAcabaram;
        }
    }

    public void inserirMoeda() {
        estadoAtual.inserirMoeda();
    }

    public void ejetarMoeda() {
        estadoAtual.ejetarMoeda();
    }

    public void acionarAlavanca() {
        estadoAtual.acionarAlavanca();
        estadoAtual.entregarGoma();
    }

    public void liberarGoma() {
        System.out.println("Uma goma esta saindo....");
        if (quantidadeGomas > 0) {
            quantidadeGomas--;
        }
    }

    public void recarregar(int quantidade) {
        this.quantidadeGomas += quantidade;
        System.out
                .println("Maquina recarregada com " + quantidade + " gomas. O TOTAL agora é: " + this.quantidadeGomas);
        if (estadoAtual == estadoGomasAcabaram) {
            setEstado(estadoSemMoeda);
        }
    }

    public int getQuantidadeGomas() {
        return quantidadeGomas;
    }

    public void setEstado(Estado estado) {
        this.estadoAtual = estado;
    }

    public Estado getEstadoSemMoeda() {
        return estadoSemMoeda;
    }

    public Estado getEstadoRecebeuMoeda() {
        return estadoRecebeuMoeda;
    }

    public Estado getEstadoGomaVendida() {
        return estadoGomaVendida;
    }

    public Estado getEstadoGomasAcabaram() {
        return estadoGomasAcabaram;
    }

    public Estado getEstadoAtual() {
        return estadoAtual;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\n------------------------------------\n");
        result.append("Disponiveis: ").append(quantidadeGomas).append("\n");
        result.append("Estado: ").append(estadoAtual).append("\n");
        result.append("------------------------------------\n");
        return result.toString();
    }
}