package com.wzy.dubbo.consumer;

import com.wzy.dubbo.api.UserApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) {
        //测试常规服务
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        System.out.println("consumer start");
        UserApi demoService = context.getBean(UserApi.class);
        System.out.println("consumer");
        System.out.println(demoService.getName());
    }
}
