import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Random;   

public class BloodDrive implements ActionListener{
	JFrame frame;
	JPanel contentPane;
	JPanel mainPanel;
	HorizBarChart graph;
	JTextField dInput1, dInput2, dInput3, dInput4, dInput5;
	JTextField[] InputList= {dInput1, dInput2, dInput3, dInput4, dInput5};
	JLabel dLabel1, dLabel2, dLabel3, dLabel4, dLabel5;
	JLabel[] inputLabels = {dLabel1, dLabel2, dLabel3, dLabel4, dLabel5};
	
	double bloodVals[] = {0, 0, 0, 0, 0};
	
	public BloodDrive() {
		
		dInput1 = new JTextField();
		
		frame = new JFrame("Blood Drive");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(2, 0 ,10, 10));
		contentPane = new JPanel();
		graph = new HorizBarChart();
		contentPane.setBackground(Color.red);
		
		for(int i = 0; i<5; i++) {
			InputList[i] = new JTextField();
			inputLabels[i] = new JLabel("Department " + (i+1));
			contentPane.add(inputLabels[i]);
			contentPane.add(InputList[i]);
		}
		
		InputList[4].addActionListener(this);
		InputList[4].setActionCommand("Graph Data");
		
		frame.setContentPane(mainPanel);
		contentPane.setLayout(new GridLayout(5, 0, 10, 10));
		
		mainPanel.add(graph);
		mainPanel.add(contentPane);
		
		mainPanel.setBorder(BorderFactory.createEmptyBorder());
		
		frame.setSize(400, 400);
		frame.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		String eventName = e.getActionCommand();
		if(eventName.equals("Graph Data")) {
			for(int i = 0; i<5; i++) {
				if(!InputList[i].getText().isEmpty())
					bloodVals[i] = Double.parseDouble(InputList[i].getText());
				else
					bloodVals[i] = 0;
			}
			graph.updateChartVals(bloodVals);
		}
	}
	
	public static void main(String[] args) {
		BloodDrive BD = new BloodDrive();
	}
	
}
