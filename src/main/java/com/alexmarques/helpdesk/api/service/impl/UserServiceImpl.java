package com.alexmarques.helpdesk.api.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.alexmarques.helpdesk.api.entity.User;
import com.alexmarques.helpdesk.api.repository.UserRepository;
import com.alexmarques.helpdesk.api.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public User findByEmail(String email) {
		// TODO Auto-generated method stub
		return this.userRepository.findByEmail(email);
	}

	@Override
	public User createOrUpdate(User user) {
		// TODO Auto-generated method stub
		return this.userRepository.save(user);
	}

	@Override
	public User findById(String id) {
		// TODO Auto-generated method stub
		return this.userRepository.findOne(id);
	}

	@Override
	public void delete(String id) {
		//TODO Auto-generated method stub
		this.userRepository.delete(id);
		
	}

	@Override
	public Page<User> findAll(int page, int count) {
		Pageable pages = new PageRequest(page, count);
		
		return this.userRepository.findAll(pages);
	}

}
