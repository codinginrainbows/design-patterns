package observer;

public class Participante {
    private String nome;

    public Participante(String nome) {
        this.nome = nome;
    }

    public void atualizar() {
        System.out.println(nome + " recebeu notificação do novo lance!");
    }

    public void fazerLance(Leiloeiro leiloeiro, int valor) {
        leiloeiro.receberLance(valor);
    }
}
