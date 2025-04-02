package observer;

public class Leiloeiro {
    private int valorAtual;
    private Participante[] observadores;
    private int numObservadores;

    public Leiloeiro() {
        this.valorAtual = 0;
        this.observadores = new Participante[100];
        this.numObservadores = 0;
    }

    public void registrarObservador(Participante participante) {
        observadores[numObservadores] = participante;
        numObservadores++;
    }

    public void receberLance(int lance) {
        if (lance > valorAtual) {
            valorAtual = lance;

            System.out.println("Novo lance foi registrado: " + valorAtual);
            notificarObservadores();
        }
    }

    private void notificarObservadores() {
        for (int i = 0; i < numObservadores; i++) {
            observadores[i].atualizar();
        }
    }
}
