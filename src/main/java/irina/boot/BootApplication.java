package irina.boot;

import irina.boot.service.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

public class BootApplication implements CommandLineRunner {

	public static void main(String[] args)  {
		//SpringApplication.run(BootApplication.class, args);

		//отключаем баннер spring boot, если не хотим видеть его лого в консоли
		SpringApplication app = new SpringApplication(BootApplication.class);
		app.setBannerMode(Banner.Mode.OFF);
		app.run(args);
	}
	@Autowired
	private Test test;
	@Override
	public void run(String... args) throws Exception {
		test.startTest();
	}

}
