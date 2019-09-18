package test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
@Controller
public class SpringBootSample {
	
	@RequestMapping
	@ResponseBody
	public String data() {
		return "Spring Body";
	}

}
