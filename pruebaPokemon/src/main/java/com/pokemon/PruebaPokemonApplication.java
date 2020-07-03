package com.pokemon;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.pokemon.auth.Constantes;

@SpringBootApplication
@EnableWebSecurity
public class PruebaPokemonApplication extends WebSecurityConfigurerAdapter{

	@Autowired
	private PasswordEncoder passwordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaPokemonApplication.class, args);
	}
	
	@Bean
	@Override
	public AuthenticationManager authenticationManagerBean() throws Exception {
	       return super.authenticationManagerBean();
	}
    
    @Bean
	@Override
	public UserDetailsService userDetailsService() {
		UserDetails user = User.builder().username(Constantes.USR1).password(passwordEncoder.encode(Constantes.USR1)).
				roles(Constantes.ADM).build();
		UserDetails user2 = User.builder().username(Constantes.USR2).password(passwordEncoder.encode(Constantes.USR2)).roles(Constantes.ADM).build();
		return new InMemoryUserDetailsManager(user, user2);

	}
    
   
}
