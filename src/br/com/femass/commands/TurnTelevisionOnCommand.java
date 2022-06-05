package br.com.femass.commands;

import br.com.femass.televisions.GenericTelevision;

public class TurnTelevisionOnCommand extends Command {
    private GenericTelevision television;

    public TurnTelevisionOnCommand(GenericTelevision television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnOn();
    }
}
