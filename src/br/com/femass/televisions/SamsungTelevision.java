package br.com.femass.televisions;

public class SamsungTelevision implements GenericTelevision {
    @Override
    public void turnOn() {
        System.out.println("Ligando televisão Samsung");
    }

    @Override
    public void turnOff() {
        System.out.println("Desligando telivisão Samsung");
    }

    @Override
    public void changeChanelUp() {
        System.out.println("Indo para próximo canal");
    }

    @Override
    public void changeChanelDown() {
        System.out.println("Voltando para canal anterior");
    }

    @Override
    public void turnUpVolume() {
        System.out.println("Aumentando o volume mais 5");
    }

    @Override
    public void turnDownVolume() {
        System.out.println("Diminuindo o valume menos 5");
    }
}
