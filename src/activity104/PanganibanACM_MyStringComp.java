package activity104;

import javax.swing.JOptionPane;

public class PanganibanACM_MyStringComp {
	public static void main(String[] args) {
		String pword, pword2;
		
		pword = JOptionPane.showInputDialog("Register password: ");
		pword2 = JOptionPane.showInputDialog("Enter your password: ");
		
		System.out.println((pword2.equals(pword)) ? "Congratulations, access granted!" : "ACCESS DENIED!");
	}
}
