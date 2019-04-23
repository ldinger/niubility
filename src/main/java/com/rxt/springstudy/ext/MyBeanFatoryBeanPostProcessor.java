package com.rxt.springstudy.ext;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.Arrays;


@Component
public class MyBeanFatoryBeanPostProcessor  implements BeanFactoryPostProcessor {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("BeanFactoryPostProcessor");
        int count = configurableListableBeanFactory.getBeanDefinitionCount();
        System.out.println("bean-count" + count);
        String beanName  []  = configurableListableBeanFactory.getBeanDefinitionNames();
        System.out.println(Arrays.asList(beanName));


    }
}
