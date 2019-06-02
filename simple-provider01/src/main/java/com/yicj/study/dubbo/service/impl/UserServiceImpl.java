package com.yicj.study.dubbo.service.impl;

import org.springframework.stereotype.Service;
import com.yicj.study.dubbo.entity.User;
import com.yicj.study.dubbo.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Override
	public User queryUserById(Integer id) {
		User user = new User() ; 
		user.setId(id);
		user.setName("yicj");
		user.setDept("java");
		return user;
	}

}
