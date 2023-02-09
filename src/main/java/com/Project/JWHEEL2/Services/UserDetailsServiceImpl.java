package com.Project.JWHEEL2.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import com.Project.JWHEEL2.Models.User;
import com.Project.JWHEEL2.Repositories.UserRepository;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.getUserByUsername(username);
		if(user==null) {
			throw new UsernameNotFoundException("Cloud not Find User");
		}
		return new MyUserDetails(user);
	}

}
