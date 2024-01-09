package com.example.stpring_api;

import com.example.stpring_api.girl.Girl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class StpringApiApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(StpringApiApplication.class, args);

		Girl girl = context.getBean(Girl.class);

		System.out.println("Trước khi IoC destroy girl!!!!!!!!!!!!!");
		((ConfigurableApplicationContext)context).getBeanFactory().destroyBean(girl);
		System.out.println("Sau khi IoC destroy girl!!!!!!!!!!!!!!!");
    }

}
