package com.sift.app.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sift.app.dto.UserDTO;
import com.sift.app.model.User;
import com.sift.app.repository.UserRepository;
import com.sift.app.service.UserService;


@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	
	public List<UserDTO> getAllUsers() {
		List<User> users = userRepository.findAll();
		
		 List<UserDTO> usersList=new ArrayList<>();
		 users.forEach(e->{
			 UserDTO dto= new UserDTO();
			 BeanUtils.copyProperties(e, dto);
			 usersList.add(dto);
		 });
		 
		 return usersList;
		
	}

	public UserDTO getUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	public User createUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public User updateUser(UserDTO userDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteUser(Integer userId) {
		// TODO Auto-generated method stub
		
	}

}
