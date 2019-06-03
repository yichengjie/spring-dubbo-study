package com.yicj.study.dubbo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.yicj.study.dubbo.action.AnnotationAction;
import com.yicj.study.dubbo.config.ConsumerConfiguration;
import com.yicj.study.dubbo.entity.User;

public class ApplicationConsume {
	
	public static void main(String[] args) throws Exception {
	    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConsumerConfiguration.class);
	    context.start();
	    final AnnotationAction annotationAction = (AnnotationAction) context.getBean("annotationAction");
	    User user = annotationAction.queryUserById(1001) ;
	    System.out.println("====================================");
	    System.out.println("====================================");
	    System.out.println(user);
	    System.out.println("====================================");
	    System.out.println("====================================");
	}
	
	
}
