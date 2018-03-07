package org.dubbo.provider.learn;

import java.io.IOException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.spring.boot.annotation.EnableDubboConfiguration;

@SpringBootApplication
@EnableDubboConfiguration
public class App {
	public static void main(String[] args) throws IOException {
		SpringApplication.run(App.class, args);
		System.out.println("dubbo provider start");
	}
}
