package com.rxt.springstudy.aop;


import com.rxt.springstudy.shabi.MyBeanFactoryPostProcessor;
import com.rxt.springstudy.shabi.TestSmartLifecycle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan("com.rxt.springstudy.aop" )
@EnableAspectJAutoProxy
public class AopConfiguration {

   // @Bean(name ={"fuck" ,"fb"})
    public FuckFactoryBean  fuckFactoryBean(){
        return new FuckFactoryBean();
    }

    @Bean
    public MyBeanFactoryPostProcessor myBeanFactoryPostProcessor(){
        return new MyBeanFactoryPostProcessor();
    }

    @Bean
    public FuckService fuckService(){
        FuckService fuckService = new FuckService();
        fuckService.setName("fuckService");
        return fuckService;
    }

    @Bean
    public TestSmartLifecycle testSmartLifecycle(){
        return new TestSmartLifecycle();
    }

}
