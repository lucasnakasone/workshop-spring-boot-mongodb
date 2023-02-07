package com.lucasnakasone.workshopmongo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.lucasnakasone.workshopmongo.domain.User;
import com.lucasnakasone.workshopmongo.repository.UserRepository;

@Configuration
public class Intantiation implements CommandLineRunner{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		User maria = new User(null, "Maria Brown", "maria@brown.com");
		User alex = new User(null, "Alex Brown", "alex@brown.com");
		User bob = new User(null, "Bob Brown", "bob@brown.com");
		
		userRepository.saveAll(Arrays.asList(maria, alex, bob));
		
	}

}
