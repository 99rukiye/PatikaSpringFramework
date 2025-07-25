package com.rukiye.iocli_dili;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "ioclicdliCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private PatronInterface patronInterface;

    public Calisan() {
        // patronInterface = new Patron()
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
