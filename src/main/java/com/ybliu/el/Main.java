package com.ybliu.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.AutoPopulatingList;

/**
 * Created by linlinyeyu on 2016/9/25.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig resourceService = context.getBean(ElConfig.class);

        resourceService.outputResource();

        context.close();
    }
}
