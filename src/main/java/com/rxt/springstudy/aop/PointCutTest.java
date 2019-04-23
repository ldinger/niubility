package com.rxt.springstudy.aop;


import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class PointCutTest {

    // 拦截使用该注解的bean的所有方法
    @Pointcut("@annotation(com.rxt.springstudy.aop.Fuck)")
    public void  fuckp(){}

    @Before("fuckp()")
    public void registBefore(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Fuck action = method.getAnnotation(Fuck.class);
        System.out.println("注解式拦截：" + action.name());

    }


}
