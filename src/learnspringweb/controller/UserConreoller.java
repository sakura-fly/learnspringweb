package learnspringweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mongodb.DuplicateKeyException;

import learnspringweb.dao.UserRepository;
import learnspringweb.model.User;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.io.PrintWriter;

@Controller
@RequestMapping("/user")
public class UserConreoller {
	@Autowired
	private UserRepository ur;

	@RequestMapping(value = "/regist", method = GET)
	public String registForm() {
		return "regist";
	}

	@RequestMapping(value = "/regist", method = POST)
	public void registAct(@Validated User u, Errors e, PrintWriter out) {
		String r = "eee";
		if (e.hasErrors()) {
			FieldError f = e.getFieldError();
			r = f.getField() + "\n" + f.getCode() + "\n" + f.getDefaultMessage();
			System.out.println(r);
			
		} else {
			try {
				ur.insert(u);
				r = "666";
			} catch (Exception e2) {
				e2.printStackTrace();
				Throwable cause = e2.getCause();
				System.out.println("eeeeeeeeeeeee");
				if (cause instanceof DuplicateKeyException) {
					DuplicateKeyException de = (DuplicateKeyException) cause;
					System.out.println(de.getCode());
					if(de.getCode() == 11000){
						r = "用户名重复";
					}
				}
			}
			// catch (DuplicateKeyException e2){
			// System.out.println("wwwwwwwwwwwwwwwwww" + e2.getCode());
			// e2.printStackTrace();
			// }
			
		}
		out.print(r);
	}

	@RequestMapping(value = "/login", method = GET)
	public String login() {
		return "login";
	}

	@RequestMapping(value = "/login", method = POST)
	public void loginAct(@Validated User u, Errors e, PrintWriter out) {
		if (e.hasErrors()) {
			FieldError f = e.getFieldError();
			String r = f.getField() + "\n" + f.getCode() + "\n" + f.getDefaultMessage();
			System.out.println(r);
			out.print(r);
		} else {
			// u=ur.findByUserName(u).get(0);
			out.print(ur.findByUser(u));
		}
	}

}
