package GUI;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Business.StudentDB;


public class Student {
	JFrame f = new JFrame("Student");
	JLabel lbId = new JLabel("ID");
	JTextField tfId = new JTextField(10);
	JLabel lbName = new JLabel("Name");
	JTextField tfName = new JTextField(10);
	JLabel lbMath = new JLabel("Math");
	JTextField tfMath = new JTextField(10);
	JButton btnInsert = new JButton("Insert");
	JButton btnUpdate = new JButton("Update");
	JButton btnDelete = new JButton("Delete");
	JButton btnView = new JButton("View");
	public Student() {		
		f.setLocation(300, 300);
		f.setLayout(new GridLayout(5,2));
		f.add(lbId);
		f.add(tfId);
		f.add(lbName);
		f.add(tfName);
		f.add(lbMath);
		f.add(tfMath);
		f.add(btnInsert);
		btnInsert.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StudentDB s = new StudentDB();
					int record = s.ExcuteUpdate("Insert into Student values('"+tfId.getText()+"','"+tfName.getText()+"','"+tfMath.getText()+"')");
					if(record>0) JOptionPane.showMessageDialog(null, "Add "+record+" rows");
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			} });
			
		f.add(btnUpdate);
		btnUpdate.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StudentDB s = new StudentDB();
					int record = s.ExcuteUpdate("Update Student set Name ='"+tfName.getText()+"',Math ='"+tfMath.getText()+"' where Id = '"+tfId.getText()+"' ");
					if(record>0) JOptionPane.showMessageDialog(null, "Update "+record+" rows");
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			} });
		f.add(btnDelete);
		btnDelete.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					StudentDB s = new StudentDB();
					int record = s.ExcuteUpdate("DELETE FROM Student WHERE Id = '"+tfId.getText()+"'");
					if(record>0) JOptionPane.showMessageDialog(null, "Delete "+record+" rows");
				} catch (Exception e2) {
					// TODO: handle exception
					e2.printStackTrace();
				}
				
			} });
		f.add(btnView);
		btnView.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ViewStudent vs = new ViewStudent();
				vs.setVisible(true);
				
			} });
		f.setSize(200 , 200);
		f.pack();
	    f.setVisible(true);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Student();
	}

}
