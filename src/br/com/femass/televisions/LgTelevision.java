package br.com.femass.televisions;

public class LgTelevision implements GenericTelevision {
    @Override
    public void turnOn() {
        System.out.println("Ligando televisão Lg");
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando telivisão Lg");
    }

    @Override
    public void changeChanelUp() {
        System.out.println("Avançando 5 canais");
    }

    @Override
    public void changeChanelDown() {
        System.out.println("Voltando 5 canais");
    }

    @Override
    public void turnUpVolume() {
        System.out.println("Aumentando o volume mais 10");
    }

    @Override
    public void turnDownVolume() {
        System.out.println("Diminuindo o valume menos 10");
    }
}
