package com.yicj.study.dubbo;

import java.io.IOException;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

public class ApplicationProvider {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
				ProviderConfiguration.class);
	    context.start();
	    System.out.println("启动......");
	    System.in.read() ;
	}
	
	@Configuration
	//@ComponentScan("com.yicj.study.dubbo")
	@EnableDubbo(scanBasePackages = "com.yicj.study.dubbo.service.impl")
	@PropertySource("classpath:/spring/dubbo-provider.properties")
	static public class ProviderConfiguration {

	}
}
