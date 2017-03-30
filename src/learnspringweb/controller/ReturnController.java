package learnspringweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/return")
public class ReturnController {

	@RequestMapping(method=GET)
	public void testReturn(@RequestParam("s") int p,HttpServletResponse respose) throws IOException{
		respose.getWriter().print(p);
	}
	
}
