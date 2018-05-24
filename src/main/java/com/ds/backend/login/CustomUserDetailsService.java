package com.ds.backend.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CustomUserDetailsService implements UserDetailsService{

	@Autowired
    UserRepository userRepository;
	
	
	@Override
	@Transactional

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findByName(username);
                
		return CustomUserDetails.create(user);
	}
	
	@Transactional

	public UserDetails loadUserById(int username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		User user = userRepository.findById(username);
                
		return CustomUserDetails.create(user);
	}

}
