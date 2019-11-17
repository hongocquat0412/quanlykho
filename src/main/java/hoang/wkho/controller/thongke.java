package hoang.wkho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class thongke {
	@RequestMapping("thongke")
	public String thongke() {
		return "thongkeindex";
	}
}
