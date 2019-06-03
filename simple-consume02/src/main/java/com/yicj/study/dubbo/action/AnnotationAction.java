package com.yicj.study.dubbo.action;

import org.springframework.stereotype.Component;

import com.alibaba.dubbo.config.annotation.Reference;
import com.yicj.study.dubbo.entity.User;
import com.yicj.study.dubbo.service.UserService;

@Component("annotationAction")
public class AnnotationAction {
	
	@Reference
    private UserService userService;
    
    public User queryUserById(Integer id) {
        return userService.queryUserById(id) ;
    }
}
