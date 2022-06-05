package br.com.femass.commands;

import br.com.femass.televisions.GenericTelevision;

public class ChangeChanelDownCommand extends Command {
    private GenericTelevision television;

    public ChangeChanelDownCommand(GenericTelevision television) {
        this.television = television;
    }

    @Override
    public void execute() {
        television.changeChanelDown();
    }
}
