package com.nskl.nskl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling//开启定时任务支持
public class NsklApplication
{

    public static void main(String[] args)
    {
        SpringApplication.run(NsklApplication.class, args);
    }

}
