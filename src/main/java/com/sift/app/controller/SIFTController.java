package com.sift.app.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sift.app.dto.UserDTO;
import com.sift.app.service.UserService;


@RestController
public class SIFTController {

private static Logger LOG=Logger.getLogger(SIFTController.class.getName());
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/getAllUsers")
	public List<UserDTO> getAllUsers()
	{
		LOG.info("Calling Get getAllUsers");
		return userService.getAllUsers();
	}
	
}
