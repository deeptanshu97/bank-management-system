package banksystem;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import com.toedter.calendar.JDateChooser;

public class SignupTwo extends JFrame implements ActionListener{
	
//	long random;
	JTextField panTextField, adTextField;
	JButton next;
	JRadioButton syes, sno, eayes, eano;
	JComboBox<String> religion,income ,education, occupation;
	String formno;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SignupTwo("");

	}
	
	
	SignupTwo(String formno){
		this.formno =formno;
		setLayout(null);
		
		
		
		JLabel additioncalDetails = new JLabel("NEW ACCOUNT  FORM - PAGE 2");
		additioncalDetails.setFont(new Font("Raleway", Font.BOLD, 30));
		additioncalDetails.setBounds(140, 20, 600, 40);
		getContentPane().setBackground(Color.white);
		add(additioncalDetails);
		JLabel additionalDetails = new JLabel("Page 2: additional Details");
		additionalDetails.setFont(new Font("Raleway", Font.BOLD, 26));
		additionalDetails.setBounds(290, 80, 400, 30);
		add(additionalDetails);
		
		
		JLabel Religion = new JLabel("Religion:");
		Religion.setFont(new Font("Raleway", Font.BOLD, 22));
		Religion.setBounds(100, 140, 100, 30);
		add(Religion);
		String valReligion[] = {"Hindu", "Muslim", "Sikh" ,"Christian", "Other"};
		religion = new JComboBox<String>(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.white);
		add(religion);
		
		
		JLabel inc = new JLabel("Income:");
		inc.setFont(new Font("Raleway", Font.BOLD, 22));
		inc.setBounds(100, 190, 200, 30);
		add(inc);
		String incomecategory[] = {"below 1 lakh","1-5 lacs", "<5-10 lacs", "5-10 lacs", "10-25 lacs", "25 lacs - 50 lacs", "more than 50 lacs"};
		income = new JComboBox<String>(incomecategory);
		income.setBounds(300,190,400,30);
		income.setBackground(Color.white);
		add(income);
		
		
		JLabel quali = new JLabel("Qualification:");
		quali.setFont(new Font("Raleway", Font.BOLD, 22));
		quali.setBounds(100, 340, 200, 30);
		add(quali);
		String educationvalues[] = {"Non-graduation","Graduate", "Post-Graduate", "Doctorate", "Other"};
		education = new JComboBox<String>(educationvalues);
		education.setBounds(300,340,400,30);
		education.setBackground(Color.white);
		add(education);
		
		
		JLabel occ = new JLabel("Occupation:");
		occ.setFont(new Font("Raleway", Font.BOLD, 22));
		occ.setBounds(100, 390, 200, 30);
		add(occ);
		String occupationvalues[] = {"Salaried","Bussiness", "Student", "Retired", "Other"};
		occupation = new JComboBox<String>(occupationvalues);
		occupation.setBounds(300,390,400,30);
		occupation.setBackground(Color.white);
		add(occupation);
		
		
		JLabel pan = new JLabel("Pan number:");
		pan.setFont(new Font("Raleway", Font.BOLD, 22));
		pan.setBounds(100, 440, 200, 30);
		add(pan);
		panTextField = new JTextField();
		panTextField.setFont(new Font("raleway", Font.BOLD, 16));
		panTextField.setBounds(300,440,400,30);
		add(panTextField);
		
		
		JLabel adhar = new JLabel("Adhar number:");
		adhar.setFont(new Font("Raleway", Font.BOLD, 22));
		adhar.setBounds(100, 480, 200, 30);
		add(adhar);
		adTextField = new JTextField();
		adTextField.setFont(new Font("raleway", Font.BOLD, 16));
		adTextField.setBounds(300,480,200,30);
		add(adTextField);
		
		
		JLabel senior = new JLabel("Senior Citizen:");
		senior.setFont(new Font("Raleway", Font.BOLD, 22));
		senior.setBounds(100, 520, 200, 30);
		add(senior);
		syes = new JRadioButton("Yes");
		syes.setBounds(300,520,100,30);
		syes.setBackground(Color.white);
		add(syes);
		sno = new JRadioButton("no");
		sno.setBounds(450, 520, 100, 30);
		sno.setBackground(Color.white);
		add(sno);
		ButtonGroup seniorgroup = new ButtonGroup();
		seniorgroup.add(syes);
		seniorgroup.add(sno);
		
		
		
		JLabel existacc = new JLabel("Existing Account:");
		existacc.setFont(new Font("Raleway", Font.BOLD, 22));
		existacc.setBounds(100, 560, 200, 30);
		add(existacc);
		eayes = new JRadioButton("Yes");
		eayes.setBounds(300,560,100,30);
		eayes.setBackground(Color.white);
		add(eayes);
		eano = new JRadioButton("no");
		eano.setBounds(450, 560, 100, 30);
		eano.setBackground(Color.white);
		add(eano);
		ButtonGroup exaccgroup = new ButtonGroup();
		exaccgroup.add(eayes);
		exaccgroup.add(eano);
		
		
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
	//	String formno = ""+random;
		String sreligion = (String) religion.getSelectedItem();   //it returns a object so type-cast it into string
		String sincome =(String) income.getSelectedItem();
		String seducation = (String) education.getSelectedItem();
		String ad   = adTextField.getText();
		String pan  = panTextField.getText();
	    String senior = null;
	    if(syes.isSelected()) {
	    	senior = "yes";
	    }
	    else if (sno.isSelected()) {
	    	senior = "no";
	    }
	    
	    String existacc =null;
	    if(eayes.isSelected()) {
	    	existacc = "yes";
	    }
	    else if(eano.isSelected()){
	    	existacc = "no";
	    }
	    
	    
	    try {
	    	
	    		Connect c =new Connect();               //"string"+variable+"string"  , now identify the varible as string->   "string'"+variabl+"'string" 
/*mysql query */String query = "insert into signuptwo values('"+formno+"', '"+sreligion+"', '"+sincome+"','"+seducation+"', '"+ad+"', '"+pan+"', '"+senior+"', '"+existacc+"')";                                       

/*execute mysql query*/	    	
	    	c.s.executeUpdate(query);
	        
	    	//signupThree object to pass formno in it
	    	new SignupThree(formno).setVisible(true);
	    	
	    }catch(Exception e) {
	    	System.out.println(e);
	    }
	
	
	}
}