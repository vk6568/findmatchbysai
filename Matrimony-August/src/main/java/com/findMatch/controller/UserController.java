package com.findMatch.controller;

import java.lang.annotation.Annotation;
import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.findMatch.dto.LoginDto;
import com.findMatch.dto.UserDto;
import com.findMatch.response.ApiResponse;
import com.findMatch.service.IUserService;



@CrossOrigin(allowedHeaders = { "*", "*/" }, origins = { "*", "*/" })
@RestController
@RequestMapping("/findmatch")
public class UserController {
	
	@Autowired
	IUserService userService;
	
	@PostMapping("/registration")
	public ResponseEntity<String> registration(@RequestBody UserDto userDto) throws ParseException{
		return new ResponseEntity<String>(userService.registration(userDto),HttpStatus.OK);
	}
	
	@PostMapping("/login")
	public ApiResponse login(@RequestBody LoginDto logindto) {
		
    //  logger.info("controller classs");
		
		return userService.login(logindto);
		
		
	}
	
	
}
