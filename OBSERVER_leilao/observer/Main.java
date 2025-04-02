package observer;

public class Main {
    public static void main(String[] args) {
        Leiloeiro leiloeiro = new Leiloeiro();

        Participante participante1 = new Participante("Igor");
        Participante participante2 = new Participante("Marcio");
        Participante participante3 = new Participante("Gabriel");

        leiloeiro.registrarObservador(participante1);
        leiloeiro.registrarObservador(participante2);
        leiloeiro.registrarObservador(participante3);

        participante1.fazerLance(leiloeiro, 100);
        participante2.fazerLance(leiloeiro, 1000);
        participante3.fazerLance(leiloeiro, 10); // Aqui NAO DEVE atualizar porque o lance é MENOR
        participante3.fazerLance(leiloeiro, 1000); // Aqui NAO DEVE atualizar porque o lance é IGUAL
        participante1.fazerLance(leiloeiro, 10000);
    }
}
