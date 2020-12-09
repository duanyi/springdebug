package com.bean.test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * @Author: 【Jackson】（【duanyi】 【chendy@tuya.com）
 * @Date:Created in 8:53 下午 2020/11/26
 */

@ExtendWith(MockitoExtension.class)
class MyTestBeanTest {

	@Test
	public void testSimpleLoad111() {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//		ApplicationContext bf = new ClassPathXmlApplicationContext("classpath:beanFactoryTest.xml");
//		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
//		MyTestBean bean = bf.getBean(MyTestBean.class);
//		assertThat(bean.getStr()).isEqualTo("123");
//		System.out.println(bean.getStr().equalsIgnoreCase("123"));
		System.out.println("1");

	}

}



