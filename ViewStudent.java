package GUI;

import java.awt.GridLayout;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Business.StudentDB;

public class ViewStudent extends JFrame {
	Vector vData=null, vTitle=null; 
	ResultSet rs;
	ResultSetMetaData rstmeta;
	
	JFrame f = new JFrame("View Student");
	public ViewStudent() {
		f.setLocation(300, 300);
		f.setLayout(new GridLayout(2,1));
		
	    StudentDB s = new StudentDB();
	    rs = s.SelectDB("Select * from Student");
	    try {
			rstmeta = rs.getMetaData();
			int num_column = rstmeta.getColumnCount();
			/*Chuẩn bị dữ liệu để tạo bảng (JTable) hiển thị thông tin
			 vTitle chứa đựng thông tin tên cột của bảng */
			 vTitle = new Vector(num_column);
			 for (int i=1; i<=num_column;i++)
			 {
			 vTitle.add(rstmeta.getColumnLabel(i));
			 }
			 vData = new Vector(10,10);
			 while (rs.next())
			 {
			 Vector row = new Vector(num_column);
			 for (int i=1; i<=num_column;i++)				
				 row.add(rs.getString(i));				
				 vData.add(row);
			 }			 

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    /*tạo bảng để chứa thông tin truy vấn từ csdl*/
	   JScrollPane tableResult = new JScrollPane(new JTable(vData,vTitle));
	   f.setSize(200 , 200);
	   f.setContentPane(tableResult);
	   f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.pack();
	    f.setVisible(true);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ViewStudent();
	}

}
