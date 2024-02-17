package com.ashish.userservices.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ashish.userservices.entity.User;
@Service
public class UserServicesIMplementation implements UserService {

	// user list

	List<User> list = List.of(new User(101L, "Prabhat"), new User(102L, "Ajeet"), new User(103L, "Amit"));

	@Override
	public User getUser(long id) {
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}

}
