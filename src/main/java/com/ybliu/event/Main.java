package com.ybliu.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by linlinyeyu on 2016/10/5.
 */
public class Main {
    public static void main(String [] args){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher demoPublisher = context.getBean(DemoPublisher.class);
        demoPublisher.publish("hello application event");
        context.close();
    }
}
