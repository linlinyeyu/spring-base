package com.ybliu.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by linlinyeyu on 2016/9/25.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
