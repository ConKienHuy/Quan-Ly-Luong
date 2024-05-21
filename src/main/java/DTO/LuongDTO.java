package DTO;

public class LuongDTO {
	private String MaNV;
	private int nam, thang;
	private int SoNgayLV;
	private double TienCongNgay;
	private double TienLuongThang;
	
	public LuongDTO() {
	
	}
	
	public LuongDTO(String MaNV, int nam, int thang, int SoNgayLV, double TienCongNgay, double TienLuongThang) {
		this.MaNV = MaNV;
		this.nam = nam;
		this.thang = thang;
		this.SoNgayLV = SoNgayLV;
		this.TienCongNgay = TienCongNgay;
		this.TienLuongThang = TienLuongThang;
	}
	
	public String getMaNV() {
		return MaNV;
	}
	public void setMaNV(String maNV) {
		MaNV = maNV;
	}
	public int getNam() {
		return nam;
	}
	public void setNam(int nam) {
		this.nam = nam;
	}
	public int getThang() {
		return thang;
	}
	public void setThang(int thang) {
		this.thang = thang;
	}
	public int getSoNgayLV() {
		return SoNgayLV;
	}
	public void setSoNgayLV(int soNgayLV) {
		SoNgayLV = soNgayLV;
	}
	public double getTienCongNgay() {
		return TienCongNgay;
	}
	public void setTienCongNgay(double tienCongNgay) {
		TienCongNgay = tienCongNgay;
	}
	public double getTienLuongThang() {
		return TienLuongThang;
	}
	public void setTienLuongThang(double tienLuongThang) {
		TienLuongThang = tienLuongThang;
	}
	
	
}
