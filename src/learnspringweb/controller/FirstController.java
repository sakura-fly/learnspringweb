package learnspringweb.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FirstController {
	

	@RequestMapping(value="/",method=GET)
	public String first(Model model,@RequestParam("num") int num){
		System.out.println(666);
		model.addAttribute("key", num);
		return "test";
	}
}
