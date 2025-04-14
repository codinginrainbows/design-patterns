package apresentacao;

import negocio.MaquinaDeGoma;

public class Main {
    public static void main(String[] args) {
        MaquinaDeGoma maquina = new MaquinaDeGoma(5);

        System.out.println(maquina);

        maquina.inserirMoeda();
        System.out.println(maquina);

        maquina.acionarAlavanca();
        System.out.println(maquina);

        maquina.ejetarMoeda();
        maquina.acionarAlavanca();
        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.ejetarMoeda();
        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        maquina.inserirMoeda();
        maquina.acionarAlavanca();

        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        System.out.println(maquina);

        maquina.recarregar(50);
        System.out.println(maquina);

        maquina.inserirMoeda();
        maquina.acionarAlavanca();
        System.out.println(maquina);
    }
}
