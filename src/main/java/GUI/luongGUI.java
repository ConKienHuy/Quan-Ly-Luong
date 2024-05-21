package GUI;

import javax.swing.*;
import javax.swing.GroupLayout.Alignment;
import javax.swing.table.DefaultTableModel;

import BLL.LuongBLL;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.border.CompoundBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.EtchedBorder;


public class luongGUI extends JFrame {
	private JTable table;
	private JButton btThem = new JButton();
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
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
			new Object[][] {
			},
			new String[] {
				"Mã Nhân Viên", "Tháng", "Năm", "Số Ngày Làm Việc", "Tiền Công Ngày"
			}
		));
		pnlTable.add(table, BorderLayout.CENTER);
		
		JPanel pnlThongTin = new JPanel();
		pnlThongTin.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		pnlMain.add(pnlThongTin, BorderLayout.WEST);
		
		JLabel lblNewLabel = new JLabel("Mã nhân viên");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		textField = new JTextField();
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Tháng");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Năm");
		lblNewLabel_2.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Số ngày làm việc");
		lblNewLabel_3.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tiền công ngày");
		lblNewLabel_4.setFont(new Font("Segoe UI", Font.BOLD, 16));
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		GroupLayout gl_pnlThongTin = new GroupLayout(pnlThongTin);
		gl_pnlThongTin.setHorizontalGroup(
			gl_pnlThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlThongTin.createSequentialGroup()
					.addGap(21)
					.addGroup(gl_pnlThongTin.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(textField_1, GroupLayout.DEFAULT_SIZE, 189, GroupLayout.DEFAULT_SIZE))
						.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblNewLabel_4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(textField, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(textField_3))
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(textField_2))
						.addGroup(gl_pnlThongTin.createSequentialGroup()
							.addGap(21)
							.addComponent(textField_4)))
					.addContainerGap(12, Short.MAX_VALUE))
		);
		gl_pnlThongTin.setVerticalGroup(
			gl_pnlThongTin.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_pnlThongTin.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(16)
					.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addGap(8)
					.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(116, Short.MAX_VALUE))
		);
		pnlThongTin.setLayout(gl_pnlThongTin);
		
		JPanel panel = new JPanel();
		pnlMain.add(panel, BorderLayout.SOUTH);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 12, 21));
		
		JButton btnNewButton = new JButton("Thêm");
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Sửa");
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Xóa");
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Tìm Kiếm");
		panel.add(btnNewButton_3);
		
	}
	
	private void LoadData() {
		
	}
	
	public static void main(String[] args) {
		new luongGUI().setVisible(true);
	}
	
}
