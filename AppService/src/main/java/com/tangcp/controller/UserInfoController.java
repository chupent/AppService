package com.tangcp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserInfoController {
	@RequestMapping("/login")
	public @ResponseBody String  logining(String username,String password){
		return "Login Success!  user:"+username;
	}
}
