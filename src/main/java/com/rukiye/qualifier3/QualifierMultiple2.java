package com.rukiye.qualifier3;


import jakarta.inject.Qualifier;

import java.lang.annotation.*;

@Qualifier
@Target({ElementType.TYPE, ElementType.METHOD, ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface QualifierMultiple2 {
    EFazlaSecenekler value();
}
