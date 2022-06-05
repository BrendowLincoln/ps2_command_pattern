package br.com.femass.commands;

import br.com.femass.televisions.GenericTelevision;

public class TurnUpVolume extends Command {
    private GenericTelevision television;

    public TurnUpVolume(GenericTelevision television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.turnUpVolume();
    }
}
