package com.ybliu.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by linlinyeyu on 2016/9/24.
 */
@Configuration
@ComponentScan("com.ybliu")
@EnableAspectJAutoProxy
public class AopConfig {
}
