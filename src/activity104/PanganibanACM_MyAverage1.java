package activity104;

import javax.swing.*;
public class PanganibanACM_MyAverage1 {
	public static void main(String[] args) {
		double q1, q2, q3, ave;
		
		q1 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ1: "));
		q2 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ2: "));
		q3 = Double.parseDouble(JOptionPane.showInputDialog("Enter LQ3: "));
		ave = ((q1+q2+q3) / 3);
		System.out.println("(" + q1 + " + " + q2 + " + " + q3 + " )/3 = " + ave);
	}
}
