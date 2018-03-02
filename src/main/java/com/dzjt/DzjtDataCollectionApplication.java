package com.dzjt;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.dzjt.*.mapper")
public class DzjtDataCollectionApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(DzjtDataCollectionApplication.class, args);
	}
}
