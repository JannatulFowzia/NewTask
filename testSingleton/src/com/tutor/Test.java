package com.tutor;


import org.springframework.context.ApplicationContext;
import org.springframework.context.Lifecycle;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test {
public static void main(String args[]) {
	ApplicationContext con = new ClassPathXmlApplicationContext("MyBean.xml");
	NewBean d = con.getBean(NewBean.class);
	
//	d.setData("MyNAme");
//	d.getData();
//	
//	Hello d1 = con.getBean(Hello.class);
//	d1.getData();
	d.spellCheck();
	
	InnerDependency data= (InnerDependency) con.getBean("addresslist");
	data.getAddressList();
	//AbstractApplicationContext context = new ClassPathXmlApplicationContext("MyBean.xml");
	/*LifeCycle lc = con.getBean(LifeCycle.class);
	lc.getMessage();
	((AbstractApplicationContext) con).registerShutdownHook();*/
}
}
