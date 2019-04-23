package com.rxt.springstudy.ext;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ExtTest {


    @Test
    public  void test( ) {

        AnnotationConfigApplicationContext ioc  = new AnnotationConfigApplicationContext(ExtConfiguration.class);

        ioc.close();

    }
}
