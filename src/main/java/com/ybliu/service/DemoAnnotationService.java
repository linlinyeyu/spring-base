package com.ybliu.service;

import com.ybliu.mapper.Action;
import org.springframework.stereotype.Service;

/**
 * Created by linlinyeyu on 2016/8/30.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截的add操作")
    public void add(){}
}
