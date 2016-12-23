package com.cain.e_xml;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestA {

	@Test
	public void DEMO01(){
		//´ÓspringÈÝÆ÷»ñµÃ
		String xmlPath = "com/cain/e_xml/beans.xml";
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
		CollectData user = (CollectData) applicationContext.getBean("collDataId");
		System.out.println(user);
		
	}

}
