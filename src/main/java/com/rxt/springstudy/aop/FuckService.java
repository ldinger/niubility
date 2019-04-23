package com.rxt.springstudy.aop;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

public class FuckService   implements  BeanNameAware {


    private String name  ;

    private String beanName;

    @Fuck(name="fuck -拦截")
    public void fuck(){
        System.out.println("FuckService.fuck");

    }
    @Fuck(name="regist -拦截")
    public  void regist(){
        System.out.println("FuckService.regist");
    }

    public void login(){
        System.out.println("FuckService.login");
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void setBeanName(String s) {
        this.beanName  =  s;
    }
}
