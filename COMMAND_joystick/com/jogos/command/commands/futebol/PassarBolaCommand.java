package com.jogos.command.commands.futebol;

import com.jogos.command.core.Command;
import com.jogos.command.receivers.FutebolGame;

public class PassarBolaCommand implements Command {
    private FutebolGame game;

    public PassarBolaCommand(FutebolGame game) {
        this.game = game;
    }
    
    @Override
    public void execute() {
        game.passarBola();
    }
}
