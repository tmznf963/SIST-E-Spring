package com.example;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class TestApp {
	@Autowired
	private ApplicationContext ctx;

	@Test
	public void test() {
		assertNotNull(this.ctx);//null이 아니면 true
	}
	@Test
	public void test1() {
		Student student1 = (Student)this.ctx.getBean("student1");
		//System.out.println(student1);
		Student student2 = this.ctx.getBean("student2",Student.class);
		assertNotSame(student1,student2);
	}

}
