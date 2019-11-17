package hoang.wkho.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="account")
public class TaiKhoan implements Serializable {
	
	private int id;
	private String taikhoan;
	private String matkhau;
	
	public TaiKhoan(int id, String taikhoan, String matkhau) {
		this.id = id;
		this.taikhoan = taikhoan;
		this.matkhau = matkhau;
	}

	public TaiKhoan() {
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	 @Column(name = "taikhoan")
	public String getTaikhoan() {
		return taikhoan;
	}
	public void setTaikhoan(String taikhoan) {
		this.taikhoan = taikhoan;
	}
	
	 @Column(name = "matkhau")
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
	
	
}
