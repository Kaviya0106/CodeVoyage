package com.spring.spring_di;

import org.springframework.beans.BeansException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        try (ClassPathXmlApplicationContext cpx = new ClassPathXmlApplicationContext("configure.xml")) {
			Employee e=(Employee)cpx.getBean("employee");
			System.out.println(e);
			System.out.println(e.getName());
			System.out.println(e.getAge());
			
			Employee e2=(Employee)cpx.getBean("employee");
			System.out.println(e2);
			System.out.println(e2.getName());
			System.out.println(e2.getAge());
		} catch (BeansException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}
