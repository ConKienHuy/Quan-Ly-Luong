package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

import BLL.LuongBLL;
import DTO.LuongDTO;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.JobAttributes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.border.LineBorder;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;


public class luongGUI extends JFrame {
	private JTable table;
	private DefaultTableModel model;
	private JTextField txtMaNV;
	private JTextField txtThang;
	private JTextField txtNam;
	private JTextField txtSoNgay;
	private JTextField txtTienCong;
	private Font SegoeFont = new Font("Segoe UI", Font.PLAIN, 16);
	private LuongBLL luongBLL = new LuongBLL();
	
	public luongGUI() {
		innitFrame();
	}
	
	private void innitFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTieuDe = new JPanel();
		FlowLayout flowLayout = (FlowLayout) pnlTieuDe.getLayout();
		flowLayout.setVgap(21);
		getContentPane().add(pnlTieuDe, BorderLayout.NORTH);
		
		JLabel lblTieuDe = new JLabel("QUẢN LÝ LƯƠNG");
		lblTieuDe.setFont(new Font("Segoe UI", Font.BOLD, 24));
		pnlTieuDe.add(lblTieuDe);
		
		JPanel pnlMain = new JPanel();
		getContentPane().add(pnlMain, BorderLayout.CENTER);
		pnlMain.setLayout(new BorderLayout(0, 0));
		
		JPanel pnlTable = new JPanel();
		pnlMain.add(pnlTable, BorderLayout.CENTER);
		pnlTable.setLayout(new BorderLayout(0, 0));
		
		table = new JTable();
		table.setModel(new DefaultTableModel(	
			new Object[][] {{null, null, null, null, null, null},},
			new String[] {"Mã nhân viên", "Tháng", "Năm", "Số ngày làm việc", "Tiền công ngày", "Tiền lương"}
		));
		model = (DefaultTableModel) table.getModel();
		LoadData();
		pnlTable.add(table, BorderLayout.CENTER);
		
		JPanel pnlThongTin = new JPanel();
		pnlThongTin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnlMain.add(pnlThongTin, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		txtMaNV = new JTextField();
		txtMaNV.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tháng");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		txtThang = new JTextField();
		txtThang.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		txtNam = new JTextField();
		txtNam.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Số ngày làm việc");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		txtSoNgay = new JTextField();
		txtSoNgay.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tiền công ngày");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		txtTienCong = new JTextField();
		txtTienCong.setColumns(10);
		GroupLayout gl_pnlThongTin = new GroupLayout(pnlThongTin);
		gl_pnlThongTin.setHorizontalGroup(
			gl_pnlThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlThongTin.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_pnlThongTin.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(txtThang, GroupLayout.DEFAULT_SIZE, 189, GroupLayout.DEFAULT_SIZE))
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(txtMaNV, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(txtSoNgay))
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(txtNam))
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(txtTienCong)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_pnlThongTin.setVerticalGroup(
			gl_pnlThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlThongTin.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(txtMaNV, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(txtThang, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(txtNam, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(txtSoNgay, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(txtTienCong, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(116, Short.MAX_VALUE))
		);
		pnlThongTin.setLayout(gl_pnlThongTin);
		
		JPanel panel = new JPanel();
		pnlMain.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 12, 21));
		
		JButton btThem = new JButton("Thêm");
		btThem.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(btThem);
		
		JButton btSua = new JButton("Sửa");
		btSua.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(btSua);
		
		JButton btXoa = new JButton("Xóa");
		btXoa.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(btXoa);
		
		JButton btTimkiem = new JButton("Tìm Kiếm");
		btTimkiem.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(btTimkiem);
		
		JButton btClear = new JButton("Clear");
		btClear.setFont(new Font("Segoe UI", Font.BOLD, 16));
		panel.add(btClear);
		
		table.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				int rowIndex = table.getSelectedRow();
				String maNV = (String) table.getValueAt(rowIndex, 0);
				int thang = (int) table.getValueAt(rowIndex, 1);
				int nam = (int) table.getValueAt(rowIndex, 2);
				int songay = (int) table.getValueAt(rowIndex, 3);
				double tienluong = (Double) table.getValueAt(rowIndex, 4);
				
				txtMaNV.setText(maNV);
				txtThang.setText(thang +"");
				txtNam.setText(nam +"");
				txtSoNgay.setText(songay +"");
				txtTienCong.setText(tienluong +"");
			}
			
		});
				
		btThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					String ma = txtMaNV.getText();
					String thangStr = txtThang.getText();
					String namStr = txtNam.getText();
					String songayStr = txtSoNgay.getText();
					String tiencongStr = txtTienCong.getText();										
					if(isDulieuNull(ma, thangStr, namStr, songayStr, tiencongStr)) {
						return;
					}
					
					int thang = Integer.parseInt(thangStr);
					int nam = Integer.parseInt(namStr);
					int songay = Integer.parseInt(songayStr);
					double tiencong = Double.parseDouble(tiencongStr);
					
					if(luongBLL.checkMatrung(ma)) {
						JOptionPane.showMessageDialog(null, "Mã số nhân viên đã tồn tại, vui lòng nhập mã số khác");
						return;
					}
					
					LoadData();
				}catch (NumberFormatException numEx) {
					JOptionPane.showMessageDialog(null, "Tháng năm số ngày tiền công phải là chữ số");
					System.out.println(numEx);
				}
			}
		});
		
		btSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String ma = txtMaNV.getText();
				int thang = Integer.parseInt(txtThang.getText());
				int nam = Integer.parseInt(txtNam.getText());
				int songay = Integer.parseInt(txtSoNgay.getText());
				double tiencong = Double.parseDouble(txtTienCong.getText());
				double tienLuongthang = songay * tiencong;
				
				luongBLL.updateLuong(new LuongDTO(ma,thang,nam,songay,tiencong, tienLuongthang));
				LoadData();
			}
		});	
		
		btXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int rowIndex = table.getSelectedRow();
				if(rowIndex < 0)
					JOptionPane.showMessageDialog(null, "Vui lòng chọn một hàng để xóa!");
				
				int option = JOptionPane.showConfirmDialog(null, "Bạn có chắc chắn muốn xóa?","Xác nhận xóa",JOptionPane.YES_NO_OPTION);
				if(option == JOptionPane.YES_OPTION) {
					String maso = (String) table.getValueAt(rowIndex, 0);
					LuongDTO luong = new LuongDTO();
					luong.setMaNV(maso);
					int check = luongBLL.deleteLuong(luong);
					if(check >= 1) {
						JOptionPane.showMessageDialog(null, "Xóa thành công!");
						// Cập nhật dữ liệu sau khi xóa
						LoadData();
					}else {
						JOptionPane.showMessageDialog(null, "Thất bại!");
					}
				}
			}
		});
		
		btTimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
//				luongBLL.timkiemThangNam(12, 1);
//				LoadData();
			}
		});
		
		btClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtMaNV.setText("");
				txtNam.setText("");
				txtThang.setText("");
				txtSoNgay.setText("");
				txtTienCong.setText("");
				
			}
		});
	}
	
	private void LoadData() {
		// Xóa các dữ liệu hiện có trong bảng
		model.setRowCount(0);
		
		ArrayList<LuongDTO> luongList = luongBLL.selectAll();
		for(LuongDTO luong : luongList) {
			Object[] row = new Object[]{
                    luong.getMaNV(),
                    luong.getThang(),
                    luong.getNam(),
                    luong.getSoNgayLV(),
                    luong.getTienCongNgay(),
                    luong.getTienLuongThang()
                };
                model.addRow(row);
		}
	}
	
	private int ThemLuong(LuongDTO luong) {
		return luongBLL.createLuong(luong);
	}
	
	private void CapNhat(LuongDTO luong) {
		
	}
	
	private void XoaLuong(LuongDTO luong) {
		
	}
	
	private void TimKiem() {
		
	}
	
	private boolean isDulieuNull(String manv, String thang, String nam, String songay, String tiencong) {
		if(manv.isBlank()) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập mã nhân viên");
			return true;
		}
		if(thang.isBlank()) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập tháng");
			return true;
		}
		if(nam.isBlank()) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập năm");
			return true;
		}
		if(songay.isBlank()) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập số ngày");
			return true;
		}
		if(tiencong.isBlank()) {
			JOptionPane.showMessageDialog(null, "Vui lòng nhập tiền công");
			return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		new luongGUI().setVisible(true);
	}
}
