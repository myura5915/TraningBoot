package com.tuyano.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class LoginController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/login")
	public String login() {
		return "login";
	}

	@RequestMapping("/logout")
	public String logout() {
		return "logout";
	}
/*	@RequestMapping(value="/login/action", method=RequestMethod.POST)
	public String loginSubmit(@Validated LoginBean loginbean) {
		LoginBean login = new LoginBean("${'user_name'}", "${'password'}");
		LoginService bo = new LoginService();
		boolean result = bo.execute(login);
		if (result) {
			model.addAttribute("msg","Hello!" + "${'user_name'}" + "さん!");
			return "loginOK";

		}else {
		return "loginfailed";
		}
	}
*/
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	public String loginSubmit(ModelMap map) {
		map.addAttribute("msg","Hello!" + "${'user_name'}" + "さん!");
		return "loginOK";
	}

	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}
}