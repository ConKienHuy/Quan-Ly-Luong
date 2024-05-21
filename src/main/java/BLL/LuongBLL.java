package BLL;

import java.util.ArrayList;

import DAL.LuongDAL;
import DTO.LuongDTO;

public class LuongBLL {
	private LuongDAL luongDAL;
	
	public LuongBLL() {
		this.luongDAL = new LuongDAL();
	}
	
	public int updateLuong(LuongDTO luongDTO) {
		return luongDAL.updateLuong(luongDTO);
	}
	
	public ArrayList<LuongDTO> timkiemThangNam(int thang, int nam) {
		return luongDAL.timkiemThangNam(thang, nam);
	}
	
	public static void main(String[] args) {
		LuongBLL l = new LuongBLL();
		ArrayList<LuongDTO> list = l.timkiemThangNam(1, 2024);
		for(LuongDTO luongDTO : list) {
			System.out.println(luongDTO.getMaNV());
		}
	}
}
