package br.com.femass.commands;

import br.com.femass.televisions.GenericTelevision;

public class TurnTelevisionOffCommand extends Command {
    private GenericTelevision television;

    public TurnTelevisionOffCommand(GenericTelevision television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOff();
    }
}
