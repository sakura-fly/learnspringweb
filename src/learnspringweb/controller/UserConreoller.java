package learnspringweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import learnspringweb.dao.UserOperations;
import learnspringweb.dao.UserRepository;
import learnspringweb.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserConreoller {

	@RequestMapping(value = "/regist", method = GET)
	public String registForm() {
		return "regist";
	}

	@Autowired
	private UserRepository ur;

	@RequestMapping(value = "/regist", method = POST)
	public void registAct(@Validated User u, Errors e, PrintWriter out) {
		System.out.println(u.toString());
		if (e.hasErrors()) {
			FieldError f = e.getFieldError();
			String r = f.getField() + "\n" + f.getCode() + "\n" + f.getDefaultMessage();
			System.out.println(r);
			out.print(r);
		} else {
			ur.insert(u);
		}

	}
	
	
	
	@RequestMapping(value="/login" , method=GET)
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/login" , method=POST)
	public void loginAct(@Validated User u, Errors e, PrintWriter out){
		if (e.hasErrors()) {
			FieldError f = e.getFieldError();
			String r = f.getField() + "\n" + f.getCode() + "\n" + f.getDefaultMessage();
			System.out.println(r);
			out.print(r);
		}else{
			out.print(ur.findByUserName(u));
		}
	}
	
	
	
}
