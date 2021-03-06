package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class TestApp {
	private ApplicationContext ctx;
	
	@Before
	public void init() {
		this.ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
	}
	
	@Test
	public void test() {
		assertNotNull(this.ctx);
	}
	
	@Test
	public void test1() {
		StudentInfo info = (StudentInfo)this.ctx.getBean("studentInfo");
		info.printInfo();
	}

}
