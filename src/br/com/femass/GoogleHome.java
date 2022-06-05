package br.com.femass;

import br.com.femass.commands.Command;

import java.util.HashMap;
import java.util.Map;

public class GoogleHome {
    private Map<String, Command> integrations;

    public GoogleHome() {
        integrations = new HashMap<String, Command>();
    }

    public void addIntegration(String key, Command command) {
        integrations.put(key, command);
    }

    public void sendRequest(String request) {
        Command command = integrations.get(request);
        if (command == null) {
            System.out.println("Desculpa, não consegui entender o que está pedindo!");
            return;
        }
        System.out.println("Comando: " + request);
        command.execute();
        System.out.println();
    }
}