//package tacos;
//
//import static org.hamcrest.Matchers.containsString;
//import static org.springframework.test.web.servlet.result.MockMvcRequestBuilders.get;
//import static org.springframework.test.web.servlet.result.ModelResultMatchers.content;
//import static org.springframework.test.web.servlet.result.ModelResultMatchers.status;
//import static org.springframework.test.web.servlet.result.ModelResultMatchers.view;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.test.context.junit4.SpringRunner;
//import org.springframework.test.web.servlet.MockMvc;
//
//@RunWith(SpringRunner.class)
//@WebMvcTest(HomeController.class)
//public class HomeControllerTest {
//	
//	@Autowired
//	private MockMvc mockMvc;
//	
//	@Test
//	public void testHomePage() throws Exception {
//		mockMvc.perform(get("/"))
//		.andExpect(status().isOk())
//		.andExpect(view().name("home"))
//		.andExpect(content().string(containsString("Witaj w...")));
//		
//	}
//
//}
