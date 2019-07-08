package activity104;

import java.awt.*;

class ButtonFrame extends Frame{
	ButtonFrame(String s){
		super(s);
		setSize(300,200);
		setLayout(new GridLayout(4,3));
		for (int i = 0; i < 12; i++)
			add(new Button("Button " + i));
		setVisible(true);
	}
}

public class PanganibanACM_TestFrame {
	public static void main(String[] args) {
		new ButtonFrame("Example 5");
	}
}

