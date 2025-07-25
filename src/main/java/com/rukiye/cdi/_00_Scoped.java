package com.rukiye.cdi;


import jakarta.enterprise.context.*;
import jakarta.inject.Named;

import java.io.Serializable;

//kapsam
//yaşam süresi
@Named
//@ApplicationScoped // bütün uygulama boyunca çalışır bütün kullanıcılar
//@RequestScoped // 1 istek boyunca
//@SessionScoped // 1 kullanıcı için yaşar ancak logout
//@Dependent //bukelemon
//@ConversationScoped // belli istek boyunca yaşar
//@SessionScoped // Bean 1 instanse olmasını sağlamak için
public class _00_Scoped  {

}
