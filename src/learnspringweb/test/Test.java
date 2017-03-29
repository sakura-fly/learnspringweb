package learnspringweb.test;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import learnspringweb.controller.FirstController;

public class Test {

	@org.junit.Test
	public void testFirst() throws Exception{
		FirstController fc = new FirstController();
		MockMvc mockMvc = MockMvcBuilders.standaloneSetup(fc).build();
		mockMvc.perform(get("/23")).andExpect(view().name("test"));
		
	}
	
	
	
	
}
