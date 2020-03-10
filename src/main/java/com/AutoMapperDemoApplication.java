package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.jay.mapper")
public class AutoMapperDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(AutoMapperDemoApplication.class, args);
		System.out.println("********启动项目成功");
	}
}
