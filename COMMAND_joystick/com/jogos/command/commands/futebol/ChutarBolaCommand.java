package com.jogos.command.commands.futebol;

import com.jogos.command.core.Command;
import com.jogos.command.receivers.FutebolGame;

public class ChutarBolaCommand implements Command {
    private FutebolGame game;

    public ChutarBolaCommand(FutebolGame game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.chutarBola();
    }
}
