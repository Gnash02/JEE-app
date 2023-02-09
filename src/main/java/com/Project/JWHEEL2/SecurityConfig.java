package com.Project.JWHEEL2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

import com.Project.JWHEEL2.Services.UserDetailsServiceImpl;

@Configuration
public class SecurityConfig {

	@Bean
	public UserDetailsService userDetailsService() {
		return new UserDetailsServiceImpl();
	}
	@Bean 
	public BCryptPasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
	public DaoAuthenticationProvider authenticationProvider() {
	    DaoAuthenticationProvider authProvider = new DaoAuthenticationProvider();
	     
	    authProvider.setUserDetailsService(userDetailsService());
	    authProvider.setPasswordEncoder(passwordEncoder());
	 
	    return authProvider;
	}
	
	@Bean 
	public SecurityFilterChain filerChain (HttpSecurity http) throws Exception{
		http.authenticationProvider(authenticationProvider());
		http.authorizeRequests()
		
		 .requestMatchers("/index","/").permitAll()
		 .requestMatchers("/singup").permitAll()
         .requestMatchers("/js/**", "/css/**", "/img/**","/lib/**","/scss/**","/vendor/**").permitAll()
         .requestMatchers("/Clients/Delete/**","/Vehicules/DeleteV","/Bookings/Delete/**").hasAuthority("ADMIN")
         .requestMatchers("/rental-request/**").hasAnyAuthority("ADMIN","USER","EDITOR")

         .anyRequest().authenticated()
		.and()
		.formLogin()
        .loginPage("/login")
        .defaultSuccessUrl("/index")
        .permitAll()
		.and()
		.logout()
		.logoutUrl("/logout")
		.logoutSuccessUrl("/index")
		.invalidateHttpSession(true)
		.permitAll();
		
		 return http.build();
}}
