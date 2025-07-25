package com.rukiye.iocsiz_disiz;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named(value = "cdisizCalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;

    public Calisan(){
        patron = new Patron();
    }

    public String getData(String data) {
        return patron.surum(data);
    }
}
