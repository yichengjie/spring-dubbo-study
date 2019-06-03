package com.yicj.study.dubbo;

import java.io.IOException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.yicj.study.dubbo.config.ProviderConfiguration;

public class ApplicationProvider {
	
	public static void main(String[] args) throws IOException {
		AnnotationConfigApplicationContext context = 
			new AnnotationConfigApplicationContext(ProviderConfiguration.class);
	    context.start();
	    System.out.println("启动......");
	    System.in.read() ;
	}
	
	
}
