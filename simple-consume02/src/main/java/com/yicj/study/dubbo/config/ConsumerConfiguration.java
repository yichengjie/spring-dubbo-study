package com.yicj.study.dubbo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@Configuration
@PropertySource({"classpath:dubbo.properties","classpath:/spring/dubbo-consume.properties"})
//注意这里也需要配置@EnableDubbo,扫描需要dubbo装配的包
@EnableDubbo(scanBasePackages = "com.yicj.study.dubbo.action")
@ComponentScan(value = { "com.yicj.study.dubbo.action" })
public class ConsumerConfiguration {

}