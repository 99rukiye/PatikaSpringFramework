package com.rukiye.qualifier3;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;


@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
@Named
@ApplicationScoped
public class Patron4 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM UCUNCU:" + data;
    }
}
