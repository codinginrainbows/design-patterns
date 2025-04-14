package com.jogos.command;

import com.jogos.command.commands.futebol.ChutarBolaCommand;
import com.jogos.command.commands.futebol.PassarBolaCommand;
import com.jogos.command.commands.luta.ChuteCommand;
import com.jogos.command.commands.luta.SocoCommand;
import com.jogos.command.core.Command;
import com.jogos.command.invoker.Joystick;
import com.jogos.command.receivers.LutaGame;
import com.jogos.command.receivers.FutebolGame;

public class Main {
    public static void main(String[] args) {
        LutaGame jogoLuta = new LutaGame();
        FutebolGame jogoFutebol = new FutebolGame();

        Command chuteCommand = new ChuteCommand(jogoLuta);
        Command socoCommand = new SocoCommand(jogoLuta);
        Command passarBolaCommand = new PassarBolaCommand(jogoFutebol);
        Command chutarBolaCommand = new ChutarBolaCommand(jogoFutebol);

        Joystick joystick = new Joystick();

        System.out.println("Configurando joystick para Luta:");
        joystick.setBotaoA(chuteCommand);
        joystick.setBotaoB(socoCommand);

        joystick.pressionarBotaoA();
        joystick.pressionarBotaoB();

        System.out.println("Configurando joystick para Futebol:");
        joystick.setBotaoA(passarBolaCommand);
        joystick.setBotaoB(chutarBolaCommand);

        joystick.pressionarBotaoA();
        joystick.pressionarBotaoB();
    }
}
