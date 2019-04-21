package sample;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import sample.service.SampleService;

@SpringBootApplication
@EnableJpaRepositories("sample.repository")
@EntityScan("sample.model")
@ComponentScan(basePackages = {"sample.service"})
public class JpaSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaSampleApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(SampleService service) {
		return (args) -> {
			service.Execute();
		};
	}
}
