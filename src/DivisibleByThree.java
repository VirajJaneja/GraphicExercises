import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class DivisibleByThree implements ActionListener{
	final static String PROMPTLABEL = "Enter an Integer:";
	
	JFrame frame;
	JPanel contentPane;
	JLabel prompt;
	JTextField input;
	JLabel answer;
	JButton check;
	
	public DivisibleByThree() {
		frame = new JFrame("Divisible by 3?");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(2, 2, 3, 3));		
		
		prompt = new JLabel(PROMPTLABEL);
		input = new JTextField(20);
		answer = new JLabel("");
		
		check = new JButton("Check");	
		check.setActionCommand("Check");
		check.addActionListener(this);
		
		contentPane.add(prompt);
		contentPane.add(input);
		contentPane.add(check);
		contentPane.add(answer);
		
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String eventName = e.getActionCommand();
		if(eventName.equals("Check")) {
			int tempNum = Integer.parseInt(input.getText());
			if(tempNum%3 == 0)
				answer.setText("Number is divisible by 3");
			else
				answer.setText("Number is not divisible by 3");
		}
	}

	public static void main(String[] args) {
		DivisibleByThree DivideBy3OBJ = new DivisibleByThree();
	}
}