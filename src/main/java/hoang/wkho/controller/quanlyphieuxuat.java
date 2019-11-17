package hoang.wkho.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class quanlyphieuxuat {

	@RequestMapping("quanlyphieuxuat")
	public String quanlyphieuxuat() {
		return "quanlyphieuxuatindex";
	}
}
