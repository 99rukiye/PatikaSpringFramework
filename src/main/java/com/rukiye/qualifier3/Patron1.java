package com.rukiye.qualifier3;

import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;
import jakarta.inject.Named;


@QualifierMultiple2(EFazlaSecenekler.UCUNCU)
@Named("patron1Qualifier3")
@ApplicationScoped
public class Patron1 implements PatronInterface {

    @Override
    public String surum(String data) {
        return "default data: " + data;
    }
}
