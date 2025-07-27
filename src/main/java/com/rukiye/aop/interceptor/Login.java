package com.rukiye.aop.interceptor;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
@InterceptorYolKesici
public class Login {

    public  String isLoginMethod(String data){
         return "isLogin: "+data;
    }
}
