package com.fuadaliyev.aop.config;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCustomAnnotationAspect {
    @Before("@annotation(com.fuadaliyev.aop.config.Loggable)")
    public void myAdvice() {
        System.out.println("Executing myAdvice!!");
    }
}
