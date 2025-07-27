package com.rukiye.qualifier3;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;


@QualifierMultiple2(EFazlaSecenekler.BIRINCI)
@Named("patron2_qualifier3")
@ApplicationScoped
public class Patron2 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "QualifierMultiple ENUM BIRINCI:" + data;
    }
}
