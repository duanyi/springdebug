package com.bean.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author: 【Jackson】（【duanyi】 【chendy@tuya.com）
 * @Date:Created in 5:58 下午 2020/12/9
 */

@Component
public class A {

	public A(){
		System.out.println("A");
	}

	@Autowired
	private B b;
}
