package com.training.complete.aop;

import org.aspectj.lang.annotation.Pointcut;


public class Pointcuts {
    @Pointcut(value = "execution(* com.training.complete.controller.UserController.subscribe(..))")
    public void subscribeEvents() {
    }

    @Pointcut(value = "execution(* com.training.complete.controller.UserController.login(..))")
    public void loginEvents() {
    }

    @Pointcut(value = "execution(* *..*Repository.*(..))")
    public void repositoryErrorEvents() {
    }

    @Pointcut(value = "execution(* *..controller.UserController.*(..))")
    public void userControllerEvents() {
    }


}
