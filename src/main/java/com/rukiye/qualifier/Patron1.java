package com.rukiye.qualifier;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;

import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;


@Default
@Named("patron1Qualifier")
@ApplicationScoped
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "default data: " + data;
    }
}
