package com.yicj.study.dubbo;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;


@EnableDubbo(scanBasePackages = "com.yicj.study.dubbo.service.impl")
@PropertySource({"classpath:dubbo.properties","classpath:dubbo-provider.properties"})
public class ApplicationProvider {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(ApplicationProvider.class);
	    context.start();
	    System.out.println("启动......");
	    System.in.read() ;
	}
	
	
}
