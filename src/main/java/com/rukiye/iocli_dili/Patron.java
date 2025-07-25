package com.rukiye.iocli_dili;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@Named
@ApplicationScoped
public class Patron  implements PatronInterface{

    @Override
    public String surum(String data) {
        return "sürüm" + data;
    }
}
