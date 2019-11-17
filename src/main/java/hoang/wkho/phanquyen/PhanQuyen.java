package hoang.wkho.phanquyen;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import hoang.wkho.entity.TaiKhoan;
import hoang.wkho.service.taikhoanservice;

@Service
public class PhanQuyen implements UserDetailsService {
	
	@Autowired
	private taikhoanservice taikhoanservice;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		 TaiKhoan taikhoan = taikhoanservice.timtaikhoan(username);
	        
	        // QUAN_TRI, NGUOI_DUNG
	       // String quyen = nguoiDung.getKieuNguoiDung();
	 
	        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();
	 
	        // ROLE_QUAN_TRI, ROLE_NGUOI_DUNG
	       // GrantedAuthority authority = new SimpleGrantedAuthority("ROLE_" + quyen);
	        
	       // grantList.add(authority);
	 
	       // boolean enabled = nguoiDung.isKichHoat();
	        boolean accountNonExpired = true;
	        boolean credentialsNonExpired = true;
	        boolean accountNonLocked = true;
	 
	        UserDetails thongtin = (UserDetails) new User(taikhoan.getTaikhoan(), //
	                taikhoan.getMatkhau(), true, accountNonExpired, //
	                credentialsNonExpired, accountNonLocked, grantList);
	 
	        return thongtin;
	}
}
