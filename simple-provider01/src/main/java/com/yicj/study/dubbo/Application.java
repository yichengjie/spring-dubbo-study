package com.yicj.study.dubbo;

import java.io.IOException;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Application {
	
	public static void main(String[] args) throws IOException {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "classpath:applicationContext.xml");
		applicationContext.start(); 
		System.err.println("服务已经启动...");
        System.in.read();
	}

}
