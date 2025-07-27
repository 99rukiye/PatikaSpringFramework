package com.rukiye.aop.decorator;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import lombok.AllArgsConstructor;
import lombok.Value;

@Named(value = "decoratorBean")
@ApplicationScoped
public class DecoratorBean {


    @Inject
    IEv iEv;

    public String beanMethod(String data){
        return iEv.boyama(data);
    }

}
