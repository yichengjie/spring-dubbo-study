package com.yicj.study.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yicj.study.dubbo.entity.User;
import com.yicj.study.dubbo.service.UserService;


public class ApplicationConsume {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
			new ClassPathXmlApplicationContext("classpath:consume.xml");
        context.start();
        test1(context);
	}
	
	public static void test1(ClassPathXmlApplicationContext context) {
		// 获取远程服务代理
		UserService userService = 
				(UserService)context.getBean("userService"); 
		User user = userService.queryUserById(1001) ;
		System.out.println("===============================");
		System.out.println(user);
		System.out.println("===============================");
	}
	
}
