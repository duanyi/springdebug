package com.bean.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author: 【Jackson】（【duanyi】 【chendy@tuya.com）
 * @Date:Created in 5:58 下午 2020/12/9
 */

@Component
public class B {

	public B(){
		System.out.println("B");
	}

	@Autowired
	private A a;
}
