package com.jogos.command.invoker;

import com.jogos.command.core.Command;

public class Joystick {
    private Command botaoA;
    private Command botaoB;

    public void setBotaoA(Command command) {
        this.botaoA = command;
    }

    public void setBotaoB(Command command) {
        this.botaoB = command;
    }

    public void pressionarBotaoA() {
        botaoA.execute();
    }

    public void pressionarBotaoB() {
        botaoB.execute();
    }
}
