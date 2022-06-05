package br.com.femass.commands;

import br.com.femass.televisions.GenericTelevision;

public class TurnDownVolume extends Command {
    private GenericTelevision television;

    public TurnDownVolume(GenericTelevision television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnDownVolume();
    }
}
