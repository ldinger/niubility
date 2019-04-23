package com.rxt.springstudy.aop;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;

public class FuckFactoryBean implements FactoryBean<FuckService>  {



    @Override
    public FuckService getObject() throws Exception {
        System.out.println("FuckFactoryBean.getObject");
        FuckService fuckService = new FuckService();
        fuckService.setName("fuckService");
        return fuckService;
    }

    @Override
    public Class<?> getObjectType() {
        return FuckService.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }



}
