package hoang.wkho.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hoang.wkho.dao.taikhoandao;
import hoang.wkho.entity.TaiKhoan;

@Repository
@Transactional
public class taikhoanservice {
	
	@Autowired
	private taikhoandao taikhoandao;
	
	public TaiKhoan timtaikhoan(String id) {
		return taikhoandao.timTaiKhoan(id);
	}
	public boolean checklogin(TaiKhoan taikhoan) {
		boolean kq = taikhoandao.checklogin(taikhoan);
		if(kq==true)
			return true;
		return false;
	}
}
