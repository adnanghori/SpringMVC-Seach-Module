package com.user.registration.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.user.registration.model.User;
import com.user.registration.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/form")
	public String form() {
		return "form";
	}
	
	@RequestMapping(path="/processform", method = {RequestMethod.GET,RequestMethod.POST})
	public String processForm(@ModelAttribute User user ) {
		System.out.println(user);
		int createUser = this.userService.createUser(user);
		return "success";
	}
}
