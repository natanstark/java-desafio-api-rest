package me.natan.service;

import me.natan.model.User;

public interface UserService {

	User findById(Long id);
	
	User create(User userToCreate);
	
	
}
