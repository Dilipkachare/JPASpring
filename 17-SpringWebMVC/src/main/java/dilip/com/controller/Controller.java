package dilip.com.controller;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/welcome")
	public ModelAndView getWelcomeMsg() {
		ModelAndView mav1 = new ModelAndView();
		mav1.addObject("msg", "Welcome to Pune");
		mav1.setViewName("index");
		return mav1;

	}
}
