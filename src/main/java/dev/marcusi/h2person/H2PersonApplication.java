package dev.marcusi.h2person;

import dev.marcusi.h2person.model.Person;
import dev.marcusi.h2person.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class H2PersonApplication {

	public static void main(String[] args) {
		SpringApplication.run(H2PersonApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PersonRepository repository) {
		return args -> {
			//add some people data
			repository.save(new Person(null, "Marcus","Icaro", 1.77, 77.2, 29));
			repository.save(new Person(null, "Lucas","Minoro", 1.70, 80, 29));
			repository.save(new Person(null, "Cinthia","Masunaga", 1.60, 60, 29));
			repository.save(new Person(null, "Pedro","Masunaga", 1.79, 85, 27));
			repository.save(new Person(null, "Mariza","Moraes", 1.63, 65, 60));
		};
	}
}
