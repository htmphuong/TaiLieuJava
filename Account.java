import java.awt.GridLayout;
import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Account extends JFrame {
	JFrame f = new JFrame("Account");
	JLabel lbUser = new JLabel("Username");
	JTextField tfUser = new JTextField(10);
	JLabel lbPass = new JLabel("Password");
	JPasswordField tfPass = new JPasswordField(10);
	JButton btnSignUp = new JButton("Sign Up");
	public Account() {
		f.setLocation(300, 300);
		f.setLayout(new GridLayout(3,1));
		f.add(lbUser);
		f.add(tfUser);
		f.add(lbPass);
		f.add(tfPass);
		f.add(btnSignUp);
		btnSignUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){  
		    	Business bs = new Business();
		    	bs.connect();
		    }  
		});
		f.setSize(200,200);
		f.pack();
	    f.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Account();
	}

}
