package com.rukiye.qualifier;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;

import jakarta.inject.Named;


@QualifierMultiple
@Named
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple 1:" + data;
    }
}
