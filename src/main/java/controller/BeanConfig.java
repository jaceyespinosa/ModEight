package controller;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo.Employee;



@Configuration
public class BeanConfig {

    @Bean
    public Employee employee() {
        return new Employee();
    }
}