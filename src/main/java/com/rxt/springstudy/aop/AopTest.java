package com.rxt.springstudy.aop;

import com.rxt.springstudy.ext.ExtConfiguration;
import com.rxt.springstudy.tx.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class AopTest {




    @Test
    public  void test( )  throws Exception{

        AnnotationConfigApplicationContext ioc  = new AnnotationConfigApplicationContext(AopConfiguration.class);

        FuckService fuckService = (FuckService) ioc.getBean("fuckService");
//        Object obj1 =    ioc.getBean("fuck");
//        Object obj2  = ioc.getBean("fb");
//        System.out.println(obj1 +  " , " +   obj2 + " ," );
        fuckService.regist();
        fuckService.fuck();
        System.out.println(fuckService.getName());

        Thread.sleep(2000);
        ioc.close();
    }
}
