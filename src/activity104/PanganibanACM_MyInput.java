/**
 * 
 */
package activity104;

import javax.swing.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author binpngnbn
 *
 */
public class PanganibanACM_MyInput {
	public static void main(String[] args) {
		Date date = new Date();
		SimpleDateFormat formatyear = new SimpleDateFormat("yyyy");
		SimpleDateFormat formatmonth = new SimpleDateFormat("MM");
		SimpleDateFormat formatday = new SimpleDateFormat("dd");
		
		String name;	
		name = JOptionPane.showInputDialog("Enter name: ");
		System.out.println("Hello " + name);
		
		String input;
		input = JOptionPane.showInputDialog("How old are you: ");
		
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
}
