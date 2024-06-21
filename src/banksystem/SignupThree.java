package banksystem;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{

	JRadioButton r1,r2,r3,r4;
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JButton submit,cancel;
	String formno;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	   new  SignupThree("");            // pass empty string here,coz formno is a string
		

	}
	
	SignupThree(String formno){           // coz before it was a default constructor, now it is a parameterized contructor to pass formno value 
		this.formno=formno;          
		
		setLayout(null);
		
		JLabel l1 = new JLabel("Page 3: Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(280,40,400,40);
		add(l1);
		
		JLabel type = new JLabel("Account Type");
		type.setFont(new Font("raleway", Font.BOLD, 22));
		type.setBounds(100,140,200,30);
		add(type);
		
		
		
		r1 = new JRadioButton("Saving account");
		r1.setFont(new Font("Raleway", Font.BOLD,16));
		r1.setBackground(Color.white);
		r1.setBounds(100,180,150,50);
		add(r1);
		
		r2 = new JRadioButton("Fixed Deposit account");
		r2.setFont(new Font("Raleway", Font.BOLD,16));
		r2.setBackground(Color.white);
		r2.setBounds(100,220,250,50);
		add(r2);
		
		r3 = new JRadioButton("Current account");
		r3.setFont(new Font("Raleway", Font.BOLD,16));
		r3.setBackground(Color.white);
		r3.setBounds(350,220,150,50);
		add(r3);
		
		r4 = new JRadioButton("Recurring Deposit account");
		r4.setFont(new Font("Raleway", Font.BOLD,16));
		r4.setBackground(Color.white);
		r4.setBounds(350,180,250,50);
		add(r4);
		ButtonGroup accountgroup = new ButtonGroup();
		accountgroup.add(r1);
		accountgroup.add(r2);
		accountgroup.add(r3);
		accountgroup.add(r4);
		
		JLabel card = new JLabel("Card Number");
		card.setFont(new Font("Raleway", Font.BOLD,30));
		card.setBackground(Color.white);
		card.setBounds(100,300,200,30);
		add(card);
		
		JLabel num = new JLabel("XXX-XXXX-XXXX-2893");
		num.setFont(new Font("Raleway", Font.BOLD,16));
		num.setBackground(Color.white);
		num.setBounds(330,300,200,30);
		add(num);
		
		JLabel cardetail = new JLabel("Your 16-digit Card Number");
		cardetail.setFont(new Font("Raleway", Font.BOLD,16));
		cardetail.setBackground(Color.white);
		cardetail.setBounds(100,330,300,20);
		add(cardetail);
		
		JLabel pin = new JLabel("PIN:");
	    pin.setFont(new Font("Raleway", Font.BOLD,30));
	    pin.setBounds(100, 370, 100, 30);
	    add(pin);
	    
	    JLabel pnum = new JLabel("XXXX");
	    pnum.setFont(new Font("Raleway", Font.BOLD,16));
	    pnum.setBounds(330,370,100,30);
	    add(pnum);
	    
	    JLabel pindetail = new JLabel("Your 4-digit pin");
	    pindetail.setFont(new Font("Raleway", Font.BOLD,16));
	    pindetail.setBackground(Color.white);
	    pindetail.setBounds(100,400,300,16);
		add(pindetail);
	    
		JLabel services = new JLabel("services required");
		services.setFont(new Font("Raleway", Font.BOLD,22));
		services.setBackground(Color.white);
		services.setBounds(100,450,200,22);
		add(services);
		
		c1 = new JCheckBox("ATM CARD");
		c1.setBackground(Color.white);
		c1.setFont(new Font("Raleway", Font.BOLD, 16));
		c1.setBounds(100,500,200,30);
		add(c1);
		
		c2 = new JCheckBox("Internet banking");
		c2.setBackground(Color.white);
		c2.setFont(new Font("Raleway", Font.BOLD, 16));
		c2.setBounds(350,500,200,30);
		add(c2);
		
		c3 = new JCheckBox("Mobile banking");
		c3.setBackground(Color.white);
		c3.setFont(new Font("Raleway", Font.BOLD, 16));
		c3.setBounds(100,550,200,30);
		add(c3);
		
		c4 = new JCheckBox("email alerts");
		c4.setBackground(Color.white);
		c4.setFont(new Font("Raleway", Font.BOLD, 16));
		c4.setBounds(350,550,200,30);
		add(c4);
		
		c5 = new JCheckBox("Cheque Book");
		c5.setBackground(Color.white);
		c5.setFont(new Font("Raleway", Font.BOLD, 16));
		c5.setBounds(100,600,200,30);
		add(c5);
		
		c6 = new JCheckBox("E-statement");
		c6.setBackground(Color.white);
		c6.setFont(new Font("Raleway", Font.BOLD, 16));
		c6.setBounds(350,600,200,30);
		add(c6);
		
		c7 = new JCheckBox("I hereby declares that the above entered details are correct to the best of my knowledge");
		c7.setBackground(Color.white);
		c7.setFont(new Font("Raleway", Font.BOLD, 12));
		c7.setBounds(100,680,600,30);
		add(c7);
		
		submit = new JButton("Submit");
		submit.setBackground(Color.BLACK);
		submit.setForeground(Color.white);
		submit.setFont(new Font("Raleway",Font.BOLD,14));
		submit.setBounds(250,720,100,30);
		submit.addActionListener(this);
		add(submit);
		
		cancel = new JButton("Cancel");
		cancel.setBackground(Color.BLACK);
		cancel.setForeground(Color.white);
		cancel.setFont(new Font("Raleway",Font.BOLD,14));
		cancel.setBounds(420,720,100,30);
		cancel.addActionListener(this);
		add(cancel);
		
		getContentPane().setBackground(Color.WHITE);

		
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource() == submit) {
			String accountType = null;
			if(r1.isSelected()) {
				accountType = "Saving Account";
			}
			else if(r2.isSelected()) {
				accountType = "Fixed Deposit account";
			}
			else if(r3.isSelected()) {
				accountType ="Currrent Account";
			}
			else if(r4.isSelected()) {
				accountType = "Recurring Deposit account";
			}
			
			Random random = new Random();
			String cardnumber =""+ Math.abs(random.nextLong() % 90000000L) + 504093600000000L;
		    
			String pinnumber = ""+ Math.abs((random.nextLong() % 9000L)+ 1000L);
		 
			String facility = "";
			if(c1.isSelected()) {
				facility = facility + "ATM Card";
			}
			else if(c2.isSelected()) {
				facility = facility +"Internet banking";
			}
			else if(c3.isSelected()) {
				facility = facility+"Mobile Banking";
			}
			else if(c4.isSelected()) {
				facility = facility+"Email alerts";
			}
			else if(c5.isSelected()) {
				facility = facility+"Cheque book";
			}
			else if(c6.isSelected()) {
				facility= facility+"E-statement";
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null," account type is required");
				}
				else {
					Connect c = new Connect();
					//passing user inputs to database through by writing a query
					String query1 = "insert into signupthree values('"+formno+"', '"+accountType+"', '"+cardnumber+"', '"+pinnumber+"', '"+facility+"')";
				   //executing the query
					c.s.executeUpdate(query1);
				}
				
			}        //37:24
			catch(Exception e) {
				System.out.println(e);
			}
			
		}
		else if (ae.getSource() == cancel) {
			
		}
	}

}
