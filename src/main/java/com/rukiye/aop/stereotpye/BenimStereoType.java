package com.rukiye.aop.stereotpye;


import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Stereotype;
import jakarta.inject.Named;
import lombok.*;

import java.lang.annotation.*;

@Stereotype
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented

@Named
@ApplicationScoped


public @interface BenimStereoType {
}
