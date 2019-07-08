package activity104;

import javax.swing.*;

public class PanganibanACM_MyPword {
	public static void main(String[] args) {
		String pword, pword2;
		
		pword = JOptionPane.showInputDialog("Register your password here: ");
		
		JPasswordField password = new JPasswordField();
		JOptionPane.showConfirmDialog(null, password, "Enter your password: ", JOptionPane.OK_CANCEL_OPTION);
		
		pword2 = new String(password.getPassword());
		
		JOptionPane.showMessageDialog(null, (pword2.equals(pword)? "Congratulations access granted!":"Access Denied!"));
	}

}
