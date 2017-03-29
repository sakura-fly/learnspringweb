package learnspringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import learnspringweb.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.*;

@Controller
@RequestMapping("/user")
public class RegistConreoller {

	@RequestMapping(value = "/regist", method = GET)
	public String registForm() {
		return "regist";
	}
	
	
	@RequestMapping(value="/regist", method=POST)
	public String registAct(@Validated User u, Errors e){
		if(e.hasErrors())
			System.out.println("eeeee");
		System.out.println(u.toString());
		return "redirect:";
	}
}
