package activity104;

import java.text.DecimalFormat;

import javax.swing.*;
public class PanganibanACM_MyAverage2 {
	public static void main(String[] args) {
		double q1, q2, q3, ave;
		
		q1 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ1: "));
		q2 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ2: "));
		q3 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ3: "));
		ave = ((q1+q2+q3) / 3);
		
		DecimalFormat varformat = new DecimalFormat("#,###.00");
		
		String avestring;
		avestring = varformat.format(ave);
		JOptionPane.showMessageDialog(null,"(" + q1 + " + " + q2 + " + " + q3 + " )/3 = " + avestring);
	}
}
