package BLL;

import java.util.ArrayList;

import DAL.LuongDAL;
import DTO.LuongDTO;

public class LuongBLL {
	private LuongDAL luongDAL;
	
	public LuongBLL() {
		this.luongDAL = new LuongDAL();
	}
	
	public ArrayList<LuongDTO> selectAll(){
		return luongDAL.selectAll();
	}
	
	public int createLuong(LuongDTO luong) {
		return luongDAL.createLuong(luong);
	}
	
	public int updateLuong(LuongDTO luongDTO) {
		return luongDAL.updateLuong(luongDTO);
	}
	
	public int deleteLuong(LuongDTO luong) {
		return luongDAL.deleteLuong(luong);
	}
	
	public boolean checkMatrung(String maso) {
		// Check mã số nhân viên bị trùng
		for(LuongDTO luong : luongDAL.selectAll()) {
			if(luong.getMaNV().equals(maso))
				return true;
		}
		
		return false;
	}
	
	public ArrayList<LuongDTO> timkiemThangNam(int thang, int nam) {
		//ArrayList<LuongDTO> rawList = luongDAL.selectAll();
		ArrayList<LuongDTO> ketQua = new ArrayList<LuongDTO>();
		for(LuongDTO luong : luongDAL.selectAll()) {
			if(luong.getThang() == thang && luong.getNam() == nam)
				ketQua.add(luong);
		}
		
		return ketQua;
	}
	
	public float tinhTrungbinhLuong() {
		float tong = 0.0f;
		int count = 0;
		for(LuongDTO luong : luongDAL.selectAll()) {
			tong += luong.getTienLuongThang();
			count += 1;
		}
//		System.out.println(tong);
		return tong / count;
	}
	
	public double tinhTrungbinhThang() {
		double tong = 0;
		int count = 0;
		for(LuongDTO luong : luongDAL.selectAll()) {
			tong += luong.getThang();
			count += 1;
		}
//		System.out.println(tong);
		return tong / count;
	}
	
	public static void main(String[] args) {
		LuongBLL l = new LuongBLL();
		ArrayList<LuongDTO> list = l.timkiemThangNam(1, 2024);
		for(LuongDTO luongDTO : list) {
			System.out.println(luongDTO);
		}
		
		System.out.println(l.tinhTrungbinhThang());
	}
}
