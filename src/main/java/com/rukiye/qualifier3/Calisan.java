package com.rukiye.qualifier3;


import com.rukiye.iocli_dili.PatronInterface;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@Named(value = "qualifier3Cdi")
@ApplicationScoped
public class Calisan {

//    @Inject
//    private PatronInterface patronInterface;

    @Inject
    @QualifierMultiple2(EFazlaSecenekler.IKINCI)
    private PatronInterface patronInterface;


    public Calisan() {
        // patronInterface = new Patron()
    }

    public String getData(String data) {
        return patronInterface.surum(data);
    }
}
