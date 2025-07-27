package com.rukiye.aop.interceptor;


import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@Interceptor
@InterceptorYolKesici
public class InterceptorYolKesiciAsilIs {


    @AroundInvoke public Object loglama(InvocationContext context) {
        System.out.println("ilk Hali: " + context.getMethod().getName());

        //kullanıcı giriş yapmış mı?
        boolean isLogin = true; //Yol kesici olacak değişkenimiz
        Object isContinue = null; // Eğer yol kesilmezse devam edeceğim.

        if (isLogin) {
            // Önce sisteme giriş yapsın
            System.out.println("!!! Önce sisteme giriş yapsın");
            return null;
        } else {
            try {
                isContinue = context.proceed();//devam etmesini sağlamak
                System.out.println("Sonraki hali "+isContinue);
            }catch (Exception e) {
                e.printStackTrace();
            }
            return isContinue;
        }
    }


}
