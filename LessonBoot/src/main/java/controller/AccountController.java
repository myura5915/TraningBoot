package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import bean.AccountBean;
import service.AccountService;


@Controller
public class AccountController {

	@Autowired
	AccountService accountService;


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

	@RequestMapping(value="/login/action/", method=RequestMethod.POST)
	public String loginAction(@Validated AccountBean accountBean) {
		int resultCount = accountService.findUser(accountBean);
		if(resultCount == 0) return "loginfailed";
		return "loginOK";
	}
/*
	@RequestMapping(value="/loginSubmit", method=RequestMethod.POST)
	public String loginSubmit(ModelMap map) {
		map.addAttribute("msg","Hello!" + "${'user_name'}" + "さん!");
		return "loginOK";
	}
*/
	@RequestMapping("/registration")
	public String registration() {
		return "registration";
	}

	@RequestMapping(value="/registration/action", method=RequestMethod.POST)
	public String goUserCreateActionPage(@Validated AccountBean accountBean, BindingResult result) {
		if(result.hasErrors()) return "registrationError";
		accountService.registration(accountBean);
		return "registrationOK";
	}
}