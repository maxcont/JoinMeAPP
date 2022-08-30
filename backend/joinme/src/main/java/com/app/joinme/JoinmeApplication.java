package com.app.joinme;

import com.app.joinme.model.UserModel;
import com.app.joinme.repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JoinmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(JoinmeApplication.class, args);
	}


	@Bean
	CommandLineRunner runner (UserRepository repository){
		return args -> {
			UserModel user = new UserModel("max", "max@email.it",null,null);
			repository.insert(user);
			System.out.println(repository.findAll());
		};
	}

}
