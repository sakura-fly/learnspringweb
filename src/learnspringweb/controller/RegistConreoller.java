package learnspringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import learnspringweb.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/user")
public class RegistConreoller {

	@RequestMapping(value = "/regist", method = GET)
	public String registForm() {
		return "regist";
	}
	
	
	@RequestMapping(value="/regist", method=POST)
	public void registAct(@Validated User u, Errors e,PrintWriter out){
		System.out.println(u.toString());
		if(e.hasErrors())
			out.print("eee");     
		else
			out.print("666");
		
	}
}
