package com.yicj.study.dubbo.entity;

import java.io.Serializable;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class User implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer id ;
	private String name ;
	private String dept ;
}
