package com.ybliu.event;

import org.springframework.context.ApplicationListener;

/**
 * Created by linlinyeyu on 2016/10/5.
 */
public class DemoListener implements ApplicationListener<DemoEvent> {
    public void onApplicationEvent(DemoEvent event){
        String msg = event.getMsg();
        System.out.println("我(bean-demoListener)接收到了bean-demoPublisher发布的消息:"+msg);
    }
}
