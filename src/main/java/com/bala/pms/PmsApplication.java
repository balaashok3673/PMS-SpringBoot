package com.bala.pms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class PmsApplication {

    @RequestMapping("/")
    public String hello(){
        return "hello world";
    }

	public static void main(String[] args) {
		SpringApplication.run(PmsApplication.class, args);
	}

}
