package com.rukiye.qualifier3;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;


@QualifierMultiple2(EFazlaSecenekler.IKINCI)
@Named
@ApplicationScoped
public class Patron3 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM IKINCI:" + data;
    }
}
