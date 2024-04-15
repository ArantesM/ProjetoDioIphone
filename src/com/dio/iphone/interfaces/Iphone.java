package com.dio.iphone.interfaces;

import com.dio.iphone.Device;

public class Iphone extends Device implements MusicPlayer, Phone, Browser {

    public Iphone(String model, int batteryLevel){
        super(model, batteryLevel);
    }

    @Override
    public void playMusic(String song){
        System.out.println("Tocando a musica: "+ song);
    }
    @Override
    public void selectMusic(String nextMusic){
        System.out.println("Selecione a Musica"+ nextMusic);
    }
    @Override
    public void pause(String pause){
        System.out.println("Musica pausada: "+ pause);
    }

    @Override
    public void makeCall(String number){
        System.out.println("Making call to: "+ number);
    }

    @Override
    public void accessWebsite(String url){
        System.out.println("Accessing website: "+ url);
    }
}
