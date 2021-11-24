package Basic;

import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login extends JFrame {
	JFrame f = new JFrame("Login");
	JLabel lblUser = new JLabel("Username");
	JTextField tfUser = new JTextField(10);
	JLabel lblPass  = new JLabel("Password");
	JPasswordField tfPass = new JPasswordField(10);
	JButton btnLogin = new JButton("Login");
	JButton btnExit = new JButton("Exit");
	
	public Login() {
		Container cont = f.getContentPane();
		f.setLayout(new GridLayout(3,2));
		f.setLocation(400, 250);
		cont.add(lblUser);
		cont.add(tfUser);
		cont.add(lblPass);
		cont.add(tfPass);
		cont.add(btnLogin);
		
		cont.add(btnExit);
		
		f.setSize(300, 300);
		f.pack();
		f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new  Login();
	}

}
