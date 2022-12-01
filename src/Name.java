import javax.swing.*;
import java.awt.event.*;


public class Name implements ActionListener{
	final static String NAMELABEL = "Viraj Janeja";
	
	JFrame frame;
	JPanel contentPane;
	JLabel label;
	JButton showHide;
	
	public Name() {
		frame = new JFrame("Name");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		
		label = new JLabel(NAMELABEL);
		contentPane.add(label);
		
		showHide = new JButton("Hide");
		showHide.setActionCommand("Hide");
		showHide.addActionListener(this);
		contentPane.add(showHide);
		
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String eventName = e.getActionCommand();
		if(eventName.equals("Hide")) {
			showHide.setText("Show");
			label.setText("");
			showHide.setActionCommand("Show");
		} else {
			showHide.setText("Hide");
			label.setText(NAMELABEL);
			showHide.setActionCommand("Hide");
		}
	}
	
	public static void main(String[] args) {
		Name NameOBJ = new Name();
	}
}
