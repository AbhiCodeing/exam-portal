package net.javaguides.springboot.service;

import java.util.Set;

import net.javaguides.springboot.model.User;
import net.javaguides.springboot.model.UserRole;

public interface UserService {
	
	public User createUser(User user, Set<UserRole> userRoles) throws Exception;
	
	public User getUser(String username);
	
	public void deletUser(Long userId);

}
