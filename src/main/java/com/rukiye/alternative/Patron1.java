package com.rukiye.alternative;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Alternative;
import jakarta.inject.Named;


@Alternative
@Named
@ApplicationScoped
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "patron 1" + data;
    }
}
