 package com.example.BeanFactoryAndAppContextDemo;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.example.SpringDemoNoNewKeyWord.Cars;

@SpringBootApplication
public class BeanFactoryAndAppContextDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(BeanFactoryAndAppContextDemoApplication.class, args);
		
//		ApplicationContext context  =  new ClassPathXmlApplicationContext("ApplicationContext.xml"); // a appn context container will be created with config metadata from xml
//		Cars cars =  context.getBean(Cars.class);
//		System.out.println(cars.getEngineData());
		
		BeanFactory factory = new ClassPathXmlApplicationContext("ApplicationContext.xml"); // a bean factory container will be created with config metadata from xml ,xml based config is suppoerted in both appn context and bean factory
		Cars cars2 = factory.getBean(Cars.class);
		System.out.println(cars2.getEngineData());
	}

}
