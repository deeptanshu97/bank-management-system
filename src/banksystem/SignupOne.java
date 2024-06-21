package banksystem;

import java.awt.Color;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.*;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener{
	
	long random;
	JTextField nameTextField, fnameTextField, emailTextField, addressTextField, cityTextField, stateTextField, pincodeTextField;
	JButton next;
	JRadioButton male, female, married, unmarried;
	JDateChooser dateChooser;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignupOne();
	}
	
	
	SignupOne(){
		
		setLayout(null);
		
		Random ran = new Random();
		random = Math.abs((ran.nextLong() % 9000L) + 1000L);
		
		JLabel formno = new JLabel("APPLICATION FORM NO:" + random );
		formno.setFont(new Font("Raleway", Font.BOLD, 38));
		formno.setBounds(140, 20, 600, 40);
		getContentPane().setBackground(Color.white);
		add(formno);
		
		JLabel personDetails = new JLabel("Page 1: Personal Details");
		personDetails.setFont(new Font("Raleway", Font.BOLD, 26));
		personDetails.setBounds(290, 80, 400, 30);
		add(personDetails);
		
		JLabel name = new JLabel("Name:");
		name.setFont(new Font("Raleway", Font.BOLD, 22));
		name.setBounds(100, 140, 100, 30);
		add(name);
		nameTextField = new JTextField();
		nameTextField.setFont(new Font("raleway", Font.BOLD, 16));
		nameTextField.setBounds(300,140,400,30);
		add(nameTextField);
		
		
		JLabel fname = new JLabel("Father's name:");
		fname.setFont(new Font("Raleway", Font.BOLD, 22));
		fname.setBounds(100, 190, 200, 30);
		add(fname);
		fnameTextField = new JTextField();
		fnameTextField.setFont(new Font("raleway", Font.BOLD, 16));
		fnameTextField.setBounds(300,190,400,30);
		add(fnameTextField);
		
		
		JLabel dob = new JLabel("Date of Birth:");
		dob.setFont(new Font("Raleway", Font.BOLD, 22));
		dob.setBounds(100, 240, 200, 30);
		add(dob);
		dateChooser = new JDateChooser();
		dateChooser.setForeground(new Color(105,105,105));
		dateChooser.setBounds(300, 240, 400, 30);
		add(dateChooser);
		
		
		JLabel gender = new JLabel("Gender:");
		gender.setFont(new Font("Raleway", Font.BOLD, 22));
		gender.setBounds(100, 290, 200, 30);
		add(gender);
		male = new JRadioButton("male");
		male.setBounds(300, 290, 60, 30);
		male.setBackground(Color.white);
		add(male);
		female = new JRadioButton("female");
		female.setBounds(400, 290,70,30);
		female.setBackground(Color.white);
		add(female);
		ButtonGroup gendergroup = new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		
		JLabel email = new JLabel("Email Address:");
		email.setFont(new Font("Raleway", Font.BOLD, 22));
		email.setBounds(100, 340, 200, 30);
		add(email);
		emailTextField = new JTextField();
		emailTextField.setFont(new Font("raleway", Font.BOLD, 16));
		emailTextField.setBounds(300,340,400,30);
		add(emailTextField);
		
		
		JLabel marital = new JLabel("Marital status:");
		marital.setFont(new Font("Raleway", Font.BOLD, 22));
		marital.setBounds(100, 390, 200, 30);
		add(marital);
		unmarried = new JRadioButton("unmarried");
		unmarried.setBounds(300, 390, 100, 30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		married = new JRadioButton("married");
		married.setBounds(450,390,100,30);
		married.setBackground(Color.white);
		add(married);
		ButtonGroup martialgroup = new ButtonGroup();
		martialgroup.add(unmarried);
		martialgroup.add(married);
		
		
		JLabel address = new JLabel("Address:");
		address.setFont(new Font("Raleway", Font.BOLD, 22));
		address.setBounds(100, 440, 200, 30);
		add(address);
		addressTextField = new JTextField();
		addressTextField.setFont(new Font("raleway", Font.BOLD, 16));
		addressTextField.setBounds(300,440,400,30);
		add(addressTextField);
		
		
		JLabel city = new JLabel("City:");
		city.setFont(new Font("Raleway", Font.BOLD, 22));
		city.setBounds(100, 480, 200, 30);
		add(city);
		cityTextField = new JTextField();
		cityTextField.setFont(new Font("raleway", Font.BOLD, 16));
		cityTextField.setBounds(300,480,200,30);
		add(cityTextField);
		
		
		JLabel state = new JLabel("State:");
		state.setFont(new Font("Raleway", Font.BOLD, 22));
		state.setBounds(100, 520, 200, 30);
		add(state);
		stateTextField = new JTextField();
		stateTextField.setFont(new Font("raleway", Font.BOLD, 16));
		stateTextField.setBounds(300,520,200,30);
		add(stateTextField);
		
		
		JLabel pincode = new JLabel("Pincode:");
		pincode.setFont(new Font("Raleway", Font.BOLD, 22));
		pincode.setBounds(100, 560, 200, 30);
		add(pincode);
		pincodeTextField = new JTextField();
		pincodeTextField.setFont(new Font("raleway", Font.BOLD,16));
		pincodeTextField.setBounds(300, 560, 100, 30);
		add(pincodeTextField);
		
		
		next = new JButton("Next");
		next.setBackground(Color.black);
		next.setForeground(Color.white);
		next.setFont(new Font("Raleway", Font.BOLD, 15));
		next.setBounds(620, 660, 80, 30);
		next.addActionListener(this);
		add(next);
			
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
	}

	public void actionPerformed(ActionEvent ae) {
		String formno = ""+random;
		String name   = nameTextField.getText();
		String fname  = fnameTextField.getText();
		String dob    = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
	    String gender = null;
	    if(male.isSelected()) {
	    	gender = "Male";
	    }
	    else if (female.isSelected()) {
	    	gender = "Female";
	    }
	    
	    String email = emailTextField.getText();
	    String marital =null;
	    if(married.isSelected()) {
	    	marital = "married";
	    }
	    else if(unmarried.isSelected()){
	    	marital = "unmarried";
	    }
	    
	    String address = addressTextField.getText();
	    String city    = cityTextField.getText();
	    String state   = stateTextField.getText();
	    String pincode     = pincodeTextField.getText();
	    
	    try {
	    	if(name.equals("")) {                                             // for if the name textfield is left empty bu the user 
	    		JOptionPane.showMessageDialog(null, "name is required");      // show dialog box with this text
	    	} else {
	    		Connect c =new Connect();               //"string"+variable+"string"  , now identify the varible as string->   "string'"+variabl+"'string" 
/*mysql query */String query = "insert into signup values('"+formno+"', '"+name+"', '"+fname+"','"+dob+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";                                       

/*execute mysql query*/	    	
	    	c.s.executeUpdate(query);
	        
	    	setVisible(false);
	//this is signuptwo object below to pass formno to it from here
	    	new SignupTwo(formno).setVisible(true);
	    	
	    	}
	    	
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	
	
	}
}

