package activity104;

import javax.swing.JOptionPane;

public class PanganibanACM_MyIfElse {
	public static void main(String[] args) {
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
		
		JOptionPane.showMessageDialog(null,"(" + q1 + " + " + q2 + " + " + q3 + " )/3 = " + ave + "\n" + remarks);
	}
}
