package br.com.femass;

import br.com.femass.commands.*;
import br.com.femass.televisions.LgTelevision;
import br.com.femass.televisions.SamsungTelevision;
import br.com.femass.utils.IntegrationsConstant;

public class Client {

    public static void configureGoogleHome(GoogleHome googleHome) {
        LgTelevision livingRoom = new LgTelevision();
        SamsungTelevision bedRoom = new SamsungTelevision();

        googleHome.addIntegration(IntegrationsConstant.TURN_ON_THE_LIVING_ROOM_TELEVISION, new TurnTelevisionOnCommand(livingRoom));
        googleHome.addIntegration(IntegrationsConstant.TURN_OFF_THE_LIVING_ROOM_TELEVISION, new TurnTelevisionOffCommand(livingRoom));
        googleHome.addIntegration(IntegrationsConstant.CHANGE_CHANEL_UP_THE_LIVING_ROOM_TELEVISION, new ChangeChanelUpCommand(livingRoom));
        googleHome.addIntegration(IntegrationsConstant.CHANGE_CHANEL_DOWN_THE_LIVING_ROOM_TELEVISION, new ChangeChanelDownCommand(livingRoom));
        googleHome.addIntegration(IntegrationsConstant.TURN_UP_VOLUME_THE_LIVING_ROOM_TELEVISION, new TurnUpVolume(livingRoom));
        googleHome.addIntegration(IntegrationsConstant.TURN_DOWN_VOLUME_THE_LIVING_ROOM_TELEVISION, new TurnDownVolume(livingRoom));

        googleHome.addIntegration(IntegrationsConstant.TURN_ON_THE_BEDROOM_TELEVISION, new TurnTelevisionOnCommand(bedRoom));
        googleHome.addIntegration(IntegrationsConstant.TURN_OFF_THE_BEDROOM_TELEVISION, new TurnTelevisionOffCommand(bedRoom));
        googleHome.addIntegration(IntegrationsConstant.CHANGE_CHANEL_UP_THE_BEDROOM_TELEVISION, new ChangeChanelUpCommand(bedRoom));
        googleHome.addIntegration(IntegrationsConstant.CHANGE_CHANEL_DOWN_THE_BEDROOM_TELEVISION, new ChangeChanelDownCommand(bedRoom));
        googleHome.addIntegration(IntegrationsConstant.TURN_UP_VOLUME_THE_BEDROOM_TELEVISION, new TurnUpVolume(bedRoom));
        googleHome.addIntegration(IntegrationsConstant.TURN_DOWN_VOLUME_THE_BEDROOM_TELEVISION, new TurnDownVolume(bedRoom));
    }

    public static void main(String[] args) {
        GoogleHome googleHome = new GoogleHome();
        configureGoogleHome(googleHome);

      googleHome.sendRequest(IntegrationsConstant.TURN_ON_THE_BEDROOM_TELEVISION);
      googleHome.sendRequest(IntegrationsConstant.TURN_ON_THE_LIVING_ROOM_TELEVISION);
      googleHome.sendRequest(IntegrationsConstant.CHANGE_CHANEL_UP_THE_BEDROOM_TELEVISION);
      googleHome.sendRequest(IntegrationsConstant.CHANGE_CHANEL_DOWN_THE_BEDROOM_TELEVISION);

      googleHome.sendRequest("Please, could you Turn off the Living room light?");
    }
}
