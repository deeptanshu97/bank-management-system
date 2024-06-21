package banksystem;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  // action listener is in the event package of java



public class Login extends JFrame implements ActionListener{ // interface is action-listener
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Login();
	}
	
	JButton clear, signup,login;
	JTextField cardTextField;
	JPasswordField pinTextField;
	
	Login(){
		setTitle("automated teller machine");
		
		setLayout(null); //to null the default layout,so you can use custom layout by setting bounds
		
		ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/logo.jpg"));
		Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
		ImageIcon i3 = new ImageIcon(i2);
		JLabel label = new JLabel(i3);
		label.setBounds(70, 10, 100, 100);             //to change the location of label
		add(label);
		
		JLabel text = new JLabel("Welcome to ibank ATM");//to write anything on the frame 
		text.setFont(new Font("Osward", Font.BOLD, 38));
		text.setBounds(200, 40, 450, 40); //define the location of the text 
		add(text);
		
		JLabel cardno = new JLabel("Card No:");//to write anything on the frame 
		cardno.setFont(new Font("Raleway", Font.BOLD, 28));
		cardno.setBounds(120, 150, 150, 30); //define the location of the text 
		add(cardno);
		
		 cardTextField = new JTextField();//text-block to let user add the card number 
		cardTextField.setBounds(300, 150, 250, 28);
		add(cardTextField);
		
		JLabel pin = new JLabel("PIN:");//to write anything on the frame 
		pin.setFont(new Font("Osward", Font.BOLD, 28));
		pin.setBounds(120, 220, 250, 30); //define the location of the text 
		add(pin);
		
		 pinTextField = new JPasswordField();//text-block to let user add the card number 
		pinTextField.setBounds(300, 220, 250, 30);
		add(pinTextField);
		
		 login = new JButton("SIGN IN");
		login.setBounds(300,300,100,30);          //location of sign in button
		login.setBackground(Color.black);
		login.setForeground(Color.white);
		login.addActionListener(this);
		add(login);
		
		 clear = new JButton("CLEAR");
		clear.setBounds(430,300,100,30);          //location of clear in button
		clear.setBackground(Color.black);
		clear.setForeground(Color.white);
		clear.addActionListener(this);
		add(clear);
		
		signup = new JButton("SIGNUP");
		signup.setBounds(300,350,230,30);          //location of sign in button
		signup.setBackground(Color.black);
		signup.setForeground(Color.white);
		signup.addActionListener(this);
		add(signup);
		
		getContentPane().setBackground(Color.white);
		
		setSize(800, 480);
		setVisible(true);
		setLocation(350, 200);
	}

	public void actionPerformed(ActionEvent ae) {   // when you implement a interface in java, you have the override all the methods in that interface
		 //this is an abstract method in the interface action-listener i.e the method is declared but not defined 
	  // so this is how you override this abstract method which is in the interface
	
	/*
	 * this method action-performed helps you define the function of the button when it is pressed by the user
	 */
	
	if(ae.getSource() == clear ) {//tells us the source of which button is clicked
		cardTextField.setText("");
		pinTextField.setText("");
	}
	else if(ae.getSource() == login){
		
	}
	else if(ae.getSource() == signup){
		setVisible(false);
		new SignupOne().setVisible(true);
	}
	}
	
	
}
