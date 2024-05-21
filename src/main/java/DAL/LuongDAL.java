package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import DTO.LuongDTO;

public class LuongDAL extends DatabaseManager{
	private Connection c;
	
	public LuongDAL() {
		LuongDAL.connectDB();
		c = DatabaseManager.getConnection();
	}
	
	public int updateLuong(LuongDTO luong) {
		int KetQua = 0;
		String sql = "UPDATE luong SET Thang = ?,Nam = ?,SoNgayLV = ?,TienCongNgay = ?,TienLuong = ?"
					+ " WHERE MaNV = ?";
		try {
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setInt(1, luong.getThang());
			pst.setInt(2, luong.getNam());
			pst.setInt(3, luong.getSoNgayLV());
			pst.setDouble(4, luong.getTienCongNgay());
			pst.setDouble(5, luong.getTienLuongThang());
			pst.setString(6, luong.getMaNV());
			
			KetQua = pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return KetQua;
	}

	public ArrayList<LuongDTO> timkiemThangNam(int thang, int nam) {
		ArrayList<LuongDTO> list = new ArrayList<LuongDTO>();
		String sql = "SELECT * from luong WHERE thang = ? AND nam = ?";
		
		try {
			PreparedStatement pst = c.prepareStatement(sql);
			pst.setInt(1, thang);
			pst.setInt(2, nam);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String MaNV = rs.getString("MaNV");
				
				LuongDTO temp = new LuongDTO();
				temp.setMaNV(MaNV);
				list.add(temp);
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
	}
}
