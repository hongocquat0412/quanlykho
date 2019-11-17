package hoang.wkho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class customer {
	
	@RequestMapping("customerindex")
	public String customerindex() {
		return "customerindex";
	}
}
