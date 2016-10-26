package com.ybliu.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by linlinyeyu on 2016/10/6.
 */
public class Main {
    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);

        AwareService awareService = context.getBean(AwareService.class);
        awareService.outputResult();

        context.close();
    }
}
