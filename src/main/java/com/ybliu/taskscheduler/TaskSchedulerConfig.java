package com.ybliu.taskscheduler;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

@Configuration
@ComponentScan("com.ybliu.taskscheduler")
@EnableScheduling
public class TaskSchedulerConfig {
	
}
