import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class MetricConversion implements ActionListener {
	final static String PROMPTLABEL = "Select a conversion type:";
	final static String[] conversionLabels = {"pounds to kilograms", "inches to centimeters", "feet to meters", "gallons to liters"};
	final static String[] conversionAnswerLabels = {"1 pound = 0.4536 kilograms", "1 inch = 2.54 centimers", "1 foot = 0.3048 meters", "1 gallon = 4.5461 liters"};

		
	JFrame frame;
	JPanel contentPane;
	JLabel prompt;
	JLabel answer;
	JComboBox convert;
	int ArrayVal;
	
	
	public MetricConversion() {
		frame = new JFrame("Metric conversion");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = new JPanel();
		contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));		
		
		prompt = new JLabel(PROMPTLABEL);
		answer = new JLabel(conversionAnswerLabels[0]);
		convert = new JComboBox(conversionLabels);
		convert.addActionListener(this);
		
		contentPane.add(prompt);
		contentPane.add(convert);
		contentPane.add(answer);
		
		contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
		frame.setContentPane(contentPane);
		
		frame.pack();
		frame.setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		String itemName = (String)convert.getSelectedItem();
		answer.setText(conversionAnswerLabels[convert.getSelectedIndex()]);
	}

	public static void main(String[] args) {
		MetricConversion DivideBy3OBJ = new MetricConversion();
	}
}
