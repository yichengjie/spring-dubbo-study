package com.yicj.study.dubbo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;

@Configuration
@EnableDubbo(scanBasePackages = "com.yicj.study.dubbo.service.impl")
@PropertySource({"classpath:dubbo.properties","classpath:/spring/dubbo-provider.properties"})
public class ProviderConfiguration {

}