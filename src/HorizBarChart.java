import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class HorizBarChart extends JPanel{
	Graphics g;
	double[] tableVals = {0, 0, 0, 0, 0};
	int[] adjustedVals;
	
	
	HorizBarChart(){
		g = getGraphics();
	}
	
	public double[] getValList(double[] list) {
		return list;
	}
		
	
	public void paint(Graphics g) {
		g = getGraphics();
		g.setColor(Color.white);
		g.drawRect(0,  0, 300000, 30000);
		g.fillRect(0,  0, 300000, 30000);
		g.setColor(Color.black);
		g.drawRect(44, 10, 5, 150);
		g.fillRect(44,  10,  5,  150);
		int temp = 25;
		adjustVals();
		for(int i = 0; i < 5; i++) {
			g.setColor(Color.red);
			g.drawRect(50, (temp*i)+25, adjustedVals[i], 5);
			g.fillRect(50, (temp*i)+25, adjustedVals[i], 5);
			g.drawString(tableVals[i]+"", adjustedVals[i]+52, (temp*i)+31);
			g.drawString("Dept." + (i+1) + ": ", 3, (temp*i)+27);
		}
	}
	
	public void updateChartVals(double[] vals) {
		for(int i =0; i<5; i++) {
			tableVals[i] = vals[i];
		}
		paint(g);
	}
	
	private void adjustVals() {
		int max = this.getSize().width-100;
		double valMax = 0;
		double multiplier = 0;
		for(double i: tableVals) {
			if(i > valMax)
				valMax = i;
		}
		multiplier = (double)valMax/max;
		int[] result = {0, 0, 0, 0, 0};
		for(int i = 0; i<5; i++) {
			result[i] = (int)(tableVals[i]/multiplier);
		}
		adjustedVals = result;
	}
}
