package com.sift.app.service;

import java.util.List;

import com.sift.app.dto.UserDTO;
import com.sift.app.model.User;



public interface UserService {

	public List<UserDTO> getAllUsers();
	public UserDTO getUser(Integer id);
	public User createUser(UserDTO userDTO);
	public User updateUser(UserDTO userDTO);
	public void deleteUser(Integer userId);
	
}
