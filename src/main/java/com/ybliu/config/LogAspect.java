package com.ybliu.config;

import com.ybliu.mapper.Action;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

/**
 * Created by linlinyeyu on 2016/8/30.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.ybliu.mapper.Action)")
    public void annotionPointCut(){};

    @After("annotionPointCut()")
    public void after(JoinPoint joinPoint) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        java.lang.reflect.Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截"+action.name());
    }

    @Before("execution(*com.ybliu.service.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        java.lang.reflect.Method method = signature.getMethod();
        System.out.println("方法规则式拦截,"+method.getName());
    }
}
