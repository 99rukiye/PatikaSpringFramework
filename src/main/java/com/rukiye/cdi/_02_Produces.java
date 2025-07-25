package com.rukiye.cdi;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Named;

import java.util.ArrayList;
import java.util.List;


@Named(value = "producetuto")
@ApplicationScoped
public class _02_Produces {

    @Produces // Üretiyor
    public List<String> getList(){
        List<String> liste = new ArrayList<>();
        liste.add("Html5");
        liste.add("css3");
        liste.add("js");
        liste.add("react");
        liste.add("angular");
        return liste;
    }
}
