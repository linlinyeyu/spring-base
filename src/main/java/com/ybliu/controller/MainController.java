package com.ybliu.controller;

import com.ybliu.config.JavaConfig;
import com.ybliu.service.UseFunctionService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by linlinyeyu on 2016/8/29.
 */
public class MainController {
    public static void main(String []args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        System.out.println(useFunctionService.SayHello("java config"));
        context.close();
    }
}
