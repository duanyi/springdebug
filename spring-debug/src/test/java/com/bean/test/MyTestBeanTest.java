package com.bean.test;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
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
		BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
		MyTestBean bean = (MyTestBean) bf.getBean("myTestBean");
		assertThat(bean.getStr()).isEqualTo("123");
	}
}