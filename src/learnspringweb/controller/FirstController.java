package learnspringweb.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FirstController {
	

	@RequestMapping(value="/",method=GET)
	public String test(){
		System.out.println(666);
		return "test";
	}
}
