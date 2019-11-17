package hoang.wkho.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hoang.wkho.entity.TaiKhoan;
import hoang.wkho.service.taikhoanservice;

@Controller
public class home {
	
	@Autowired
	private taikhoanservice taiKhoanservice;
	
	@RequestMapping(value = {"/","login"})
	public String login(Model model) {
		model.addAttribute("Formlogin",new TaiKhoan());
		return "login";
	}
	@RequestMapping("index")
	public String home() {
		return "index";
	}	
	@RequestMapping(value= {"login"}, method = RequestMethod.POST)
	public String checklogin(Model model, @ModelAttribute("Formlogin") TaiKhoan taikhoan) {
		boolean kq = taiKhoanservice.checklogin(taikhoan);
		if(kq==true)
			return "index";
		return "login";
	}
}
