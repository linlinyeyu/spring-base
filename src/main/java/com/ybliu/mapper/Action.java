package com.ybliu.mapper;

import java.lang.annotation.*;

/**
 * Created by linlinyeyu on 2016/8/29.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
