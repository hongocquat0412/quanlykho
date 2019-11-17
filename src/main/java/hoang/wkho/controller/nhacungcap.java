package hoang.wkho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class nhacungcap {
	
	@RequestMapping("nhacungcap")
	public String nhacungcap() {
		return "nhacungcapindex";
	}
}
