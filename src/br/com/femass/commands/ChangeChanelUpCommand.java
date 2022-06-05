package br.com.femass.commands;

import br.com.femass.televisions.GenericTelevision;

public class ChangeChanelUpCommand extends Command {
    private GenericTelevision television;

    public ChangeChanelUpCommand(GenericTelevision television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.changeChanelUp();
    }
}
