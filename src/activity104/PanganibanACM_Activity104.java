package activity104;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

class ButtonxFrame extends Frame{
	ButtonxFrame(String s){
		super(s);
		setSize(400,400);
		setLayout(new GridLayout(3,1));
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent we) {
				System.exit(0);
			}
		});
		
		Button loginb = new Button("Login");  
		loginb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String pword, pword2;
				
				pword = JOptionPane.showInputDialog("Register your password: ");
				
				JPasswordField password = new JPasswordField();
				
				String flag = "F";
				do {
					JOptionPane.showConfirmDialog(null, password, "Enter your password: ", JOptionPane.OK_CANCEL_OPTION);
					pword2 = new String(password.getPassword());
					
					if(pword2.equals(pword)) {
						flag = "T";
					}
					JOptionPane.showMessageDialog(null, (pword2.equals(pword)? "Congratulations access granted!":"Access Denied!"));
				}while(flag.equals("F"));
			}
		});
		
		Button avg = new Button("Get Average");
		avg.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				double q1, q2, q3, ave;
				
				q1 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ1: "));
				q2 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ2: "));
				q3 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ3: "));
				ave = ((q1+q2+q3) / 3);
				
				String remarks;
				
				if(ave >= 80 && ave <= 100) {
					remarks = "Excellent";
				}
				else if(ave >= 60 && ave <= 79) {
					remarks = "Fair";
				}
				else if(ave >= 0 && ave <= 59) {
					remarks = "Fail";
				}
				else {
					remarks = "Illegal Grade";
				}
				
				JOptionPane.showMessageDialog(null,"(" + q1 + " + " + q2 + " + " + q3 + " )/3 = " + ave + "\n" + remarks);			}
		});
		
		Button getage = new Button("Compute your age");
		getage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Date date = new Date();
				SimpleDateFormat formatyear = new SimpleDateFormat("yyyy");
				SimpleDateFormat formatmonth = new SimpleDateFormat("MM");
				SimpleDateFormat formatday = new SimpleDateFormat("dd");
				
				String name;	
				name = JOptionPane.showInputDialog("Enter name: ");
				
				String input;
				input = JOptionPane.showInputDialog("How old are you " + name + ": ");
				
				String birthdate;
				birthdate = JOptionPane.showInputDialog("When is your birthday (MM/DD): ");
				String[] birthdateParts;
				birthdateParts = birthdate.split("/");
				int month = Integer.parseInt(birthdateParts[0]);
				int day = Integer.parseInt(birthdateParts[1]);
				
				int yearnow = Integer.parseInt(formatyear.format(date));
				int monthnow = Integer.parseInt(formatmonth.format(date));
				int daynow = Integer.parseInt(formatday.format(date));
				int age, year;
				age = Integer.parseInt(input);
				if (monthnow >= month && daynow >= day )
					year = yearnow - age;
				else
					year = yearnow - age -1;

				JOptionPane.showMessageDialog(null, "You were born in " + year);
			}
		});
		add(loginb);
		add(avg);
		add(getage);
	}
}

public class PanganibanACM_Activity104 {
	public static void main(String[] args) {
		 new ButtonxFrame("Activity 104");
	}
}
