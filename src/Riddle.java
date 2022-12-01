import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Riddle implements ActionListener{
	final static String RIDDLELABEL = "The more of this there is, the less you see. What is it?";
	
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton showHide;
	
	public Riddle() {
		frame = new JFrame("Riddle");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(new GridLayout(2, 1, 10, 10));
		
		label = new JLabel(RIDDLELABEL);
		contentPane.add(label);
		
		showHide = new JButton("Show Answer");	
		showHide.setActionCommand("Question");
		showHide.addActionListener(this);
		contentPane.add(showHide);
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String eventName = e.getActionCommand();
		if(eventName.equals("Question")) {
			showHide.setText("Show Question");
			label.setText("Darkness");
			showHide.setActionCommand("Show");
		} else {
			showHide.setText("Show Answer");
			label.setText(RIDDLELABEL);
			showHide.setActionCommand("Question");
		}
	}

	public static void main(String[] args) {
		Riddle NameOBJ = new Riddle();
	}
}
