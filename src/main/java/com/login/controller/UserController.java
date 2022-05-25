package com.login.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin()
public class UserController {

	@RequestMapping({ "/saludo" })
	public String saludo() {
		return "Hola Mundo";
	}

}
