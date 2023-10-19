package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import controller.BeanConfig;



@SpringBootApplication
@ComponentScan({ "com.example.demo" })
public class ModEightApplication implements CommandLineRunner {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	ApplicationContext appContext;
	
    public static void main(String[] args) {
        SpringApplication.run(ModEightApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        appContext = new AnnotationConfigApplicationContext(BeanConfig.class);
        
        Employee e = appContext.getBean("employee", Employee.class);
        e.setEmpPosition("Senior Software Developer");
        
        System.out.println(e);
        employeeRepository.save(e);
    }
}