package com.rukiye.aop.decorator;


import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

@Decorator
public class EvDecorator implements IEv{

    private @Inject @Delegate
    IEv iEv;

    @Override
    public String boyama(String data) {
        System.out.println("Decorator Buradaydı !!!");
        String dataInformation=iEv.boyama(data);
        if (dataInformation.equals("kodluyoruz")){
            dataInformation=dataInformation.toUpperCase();
        }
        return dataInformation;
    }
}
