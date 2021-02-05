package test.aws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class AWSApplication {

	public static void main(String[] args) {
		SpringApplication.run(AWSApplication.class, args);
	}

}
