package com.rxt.springstudy.shabi;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.core.Ordered;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor,Ordered {
    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
        System.out.println("beanFactory 后置");
        String[] beanStr = configurableListableBeanFactory.getBeanDefinitionNames();
        for (String beanName : beanStr) {
            System.out.println("beanName: " +beanName);
            if ("fuckService".equals(beanName)) {
                BeanDefinition beanDefinition = configurableListableBeanFactory.getBeanDefinition(beanName);

                MutablePropertyValues m = beanDefinition.getPropertyValues();
                System.out.println(m);
                if (m.contains("name")) {
                    m.add("name", "赵四");
                    System.out.println("》》》修改了name属性初始值了");
                }
            }
        }


    }

    @Override
    public int getOrder() {
        return 10;
    }
}
