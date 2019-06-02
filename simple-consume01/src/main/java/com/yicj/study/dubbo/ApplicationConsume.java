package com.yicj.study.dubbo;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.yicj.study.api.entity.User;
import com.yicj.study.api.service.IUserService; 

public class ApplicationConsume {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"http://10.20.160.198/wiki/display/dubbo/consumer.xml"});
        context.start();
        test1(context);
	}
	
	
	public static void test1(ClassPathXmlApplicationContext context) {
		 IUserService userService = (IUserService)context.getBean("userService") ;
	     List<User> list = userService.list();
	     list.forEach(System.out::println);
	}
	
	
	public static void test2(ClassPathXmlApplicationContext context) {
		//UserService userService = (UserService)context.getBean("userService"); // 获取远程服务代理
		//User user = userService.queryUserById(1001) ;
	}
	
}
