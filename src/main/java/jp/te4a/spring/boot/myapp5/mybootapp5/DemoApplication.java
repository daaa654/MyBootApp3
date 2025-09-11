package jp.te4a.spring.boot.myapp5.mybootapp5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.println("Test");
		SpringApplication.run(DemoApplication.class, args);
	}

}
