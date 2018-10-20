package com.javabycode.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.javabycode.springboot.model.User;
import com.javabycode.springboot.service.UserService;
import com.javabycode.springboot.util.ErrorType;

@RestController
@RequestMapping("/welcome")
public class WelcomeController {

	

	@RequestMapping(value = "/spring", method = RequestMethod.GET)
	public ResponseEntity<String> findAllUsers() {
		
		return new ResponseEntity<String>("Spring", HttpStatus.OK);
	}

	

}