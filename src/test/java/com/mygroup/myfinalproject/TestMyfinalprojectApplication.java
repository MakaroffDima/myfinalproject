package com.mygroup.myfinalproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestMyfinalprojectApplication {

	public static void main(String[] args) {
		SpringApplication.from(MyfinalprojectApplication::main).with(TestMyfinalprojectApplication.class).run(args);
	}

}
