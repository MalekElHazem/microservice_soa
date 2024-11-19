package com.project.users.service;

import java.util.List;

import com.project.users.entities.Role;
import com.project.users.entities.User;
import com.project.users.service.register.RegistationRequest;

public interface UserService {
	
	User saveUser(User user);
	User findUserByUsername(String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	List<User> findAllUsers();
	
	
	User registerUser(RegistationRequest request);
	public void sendEmailUser(User u, String code);
	public User validateToken(String code);
}