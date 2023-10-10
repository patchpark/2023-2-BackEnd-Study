package com.example.GDSC__4th_HW;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@Slf4j
@SpringBootApplication
public class Gdsc4thHwApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext = SpringApplication.run(Gdsc4thHwApplication.class, args);
		A a = applicationContext.getBean("a", A.class);
		D d = applicationContext.getBean("d", D.class);

		a.getB().funcB();
		a.getC().funcC();

		d.getC().funcC();
	}
}
