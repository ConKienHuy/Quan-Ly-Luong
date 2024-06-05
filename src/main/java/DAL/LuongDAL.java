package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import DTO.LuongDTO;

public class LuongDAL extends DatabaseManager{
	private Connection connection;
	
	public LuongDAL() {
		LuongDAL.connectDB();
		connection = DatabaseManager.getConnection();
	}
	
	public ArrayList<LuongDTO> selectAll(){
		ArrayList<LuongDTO> luonglist = new ArrayList<LuongDTO>();
 		String sql = "SELECT * FROM luong";
		
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String MaNV = rs.getString("MaNV");
				int Thang = rs.getInt("Thang");
				int Nam = rs.getInt("Nam");
				int SongayLV = rs.getInt("SoNgayLV");
				double Tiencongngay = rs.getDouble("TienCongNgay");
				double TienLuong = rs.getDouble("TienLuong");
				
				LuongDTO temp = new LuongDTO(MaNV, Thang, Nam, SongayLV, Tiencongngay, TienLuong);
				luonglist.add(temp);
			}
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return luonglist;
	}
	
	public int createLuong(LuongDTO luong) {
		int KetQua = 0;
		String sql = "INSERT INTO luong(MaNV, Thang, Nam, SoNgayLV, TienCongNgay, TienLuong)"
				+ " VALUES(?, ?, ?, ?, ?, ?)";
		
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, luong.getMaNV());
			pst.setInt(2, luong.getThang());
			pst.setInt(3, luong.getNam());
			pst.setInt(4, luong.getSoNgayLV());
			pst.setDouble(5, luong.getTienCongNgay());
			pst.setDouble(6, luong.getTienLuongThang());
			
			KetQua = pst.executeUpdate();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
		return KetQua;
	}
	
	public int updateLuong(LuongDTO luong) {
		int KetQua = 0;
		String sql = "UPDATE luong SET Thang = ?,Nam = ?,SoNgayLV = ?,TienCongNgay = ?,TienLuong = ?"
					+ " WHERE MaNV = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
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
	
	public int deleteLuong(LuongDTO luong) {
		int KetQua = 0;
		String sql = "DELETE FROM luong"
					+ " WHERE MaNV = ?";
		try {
			PreparedStatement pst = connection.prepareStatement(sql);
			pst.setString(1, luong.getMaNV());
			
			KetQua = pst.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return KetQua;
	}
	
	
//	public void them1(ThuCungDTO tc) {
//		String sql = "INSERT INTO ThuCung (MaThuCung, Ten, MauLong, DonGia, SoLuong)"
//				+ " VALUES (?, ?, ?, ?, ?)"; 
//		PreparedStatement pst = null;
//		try {
//			pst = connection.prepareStatement(sql);
//			pst.setString(1, tc.getMaThuCung());//MaThuCung: String
//			pst.setString(2, tc.getTen());		// Ten: String
//			pst.setString(3, tc.getMauLong());	// MauLong: String
//			pst.setFloat(4, tc.getDonGia()); 	// DonGia: float
//			pst.setInt(5, tc.getSoLuong());		//SoLuong: int
//			
//			pst.executeUpdate();
//		}catch (SQLException e) {
//			e.printStackTrace();
//		} 
//	} private ThuCungDAO tcDao = new ThuCungDAO();
//	
//	public void them(ThuCungDTO tc) {
//		tcDao.them(tc);
//	}
	
}
