package hoang.wkho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class account {

	@RequestMapping("account")
	public String account() {
		return "doimatkhau";
	}
}
