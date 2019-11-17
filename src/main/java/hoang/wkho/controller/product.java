package hoang.wkho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class product {
	
	@RequestMapping("productindex")
	public String productindex() {
		return "productindex";
	}
}
