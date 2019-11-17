package hoang.wkho.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import hoang.wkho.entity.TaiKhoan;


@Repository
public class taikhoandao {
	
	@Autowired
	SessionFactory sessionFactory;
	
	public TaiKhoan timTaiKhoan(String id){
		Session session = this.sessionFactory.getCurrentSession();
		return session.get(TaiKhoan.class, id);
	}
	
	public boolean checklogin(TaiKhoan taikhoan) {
		
		Session session = this.sessionFactory.getCurrentSession();//
		String sql = "FROM "+TaiKhoan.class.getName()+" E WHERE E.taikhoan = :taikhoan and E.matkhau = :matkhau";
		
		Query<?> query = session.createQuery(sql);
		query.setParameter("taikhoan", taikhoan.getTaikhoan());
		query.setParameter("matkhau", taikhoan.getMatkhau());
		if(query.list().size() >= 1)
		return true;
		return false;
		
	}
}
