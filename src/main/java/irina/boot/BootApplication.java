package irina.boot;

import irina.boot.service.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class BootApplication {


	public static void main(String[] args) throws IOException {

		ConfigurableApplicationContext context = SpringApplication.run(BootApplication.class, args);

		Test test = context.getBean(Test.class);
		test.startTest();
	}

}
