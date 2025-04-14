package com.jogos.command.commands.luta;

import com.jogos.command.core.Command;
import com.jogos.command.receivers.LutaGame;

public class ChuteCommand implements Command {
    private LutaGame game;

    public ChuteCommand(LutaGame game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.chute();
    }
}
