import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
import java.util.Random;      
public class Roll implements ActionListener {
  JFrame frame;
  JPanel contentPane;
  JButton rollDie;
  JLabel dieFace, dieFace2;
  
  public Roll(){
    /* Create and set up the frame */
	frame = new JFrame("Roll");
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	/* Create a content pane with a BoxLayout and 
	 empty borders */
	contentPane = new JPanel();
	contentPane.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
	contentPane.setBackground(Color.white);
	contentPane.setLayout(new BoxLayout(contentPane, BoxLayout.PAGE_AXIS));
	    
	/* Create a label that shows a die face */
	dieFace = new JLabel(new ImageIcon("die3.gif"));
	dieFace.setAlignmentX(JLabel.CENTER_ALIGNMENT);
	dieFace.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
	
	dieFace2 = new JLabel(new ImageIcon("die2.gif"));
	dieFace2.setAlignmentX(JLabel.CENTER_ALIGNMENT);
	dieFace2.setBorder(BorderFactory.createEmptyBorder(0, 0, 10, 0));
	
	contentPane.add(dieFace);
	contentPane.add(dieFace2);
	rollDie = new JButton("Roll Die");
	rollDie.setAlignmentX(JButton.CENTER_ALIGNMENT);
	rollDie.addActionListener(this);
	contentPane.add(rollDie);
	  
	/* Add content pane to frame */
	frame.setContentPane(contentPane);
	/* Size and then display the frame. */
	    frame.pack();
	    frame.setVisible(true);
  	}
	    
	    
	  /**
	   * Handle a button click
	   * pre: none
	   * post: A die has been rolled. Matching image shown.
	   */
  	public void actionPerformed(ActionEvent event) {
	    Random rand = new Random();
	    int newRoll, newRoll2;
	     
	    newRoll = rand.nextInt(6) + 1;
	    newRoll2 = rand.nextInt(6) + 1;
	    if (newRoll == 1) {
	      dieFace.setIcon(new ImageIcon("die1.gif"));
		} else if (newRoll == 2) {
		  dieFace.setIcon(new ImageIcon("die2.gif"));
		} else if (newRoll == 3) {
		  dieFace.setIcon(new ImageIcon("die3.gif"));
		} else if (newRoll == 4) {
		  dieFace.setIcon(new ImageIcon("die4.gif"));
		} else if (newRoll == 5) {
		  dieFace.setIcon(new ImageIcon("die5.gif"));
		} else if (newRoll== 6) {
		  dieFace.setIcon(new ImageIcon("die6.gif"));
		}
	
		if (newRoll2 == 1) {
		    dieFace2.setIcon(new ImageIcon("die1.gif"));
		  } else if (newRoll2 == 2) {
		    dieFace2.setIcon(new ImageIcon("die2.gif"));
		  } else if (newRoll2 == 3) {
		    dieFace2.setIcon(new ImageIcon("die3.gif"));
		  } else if (newRoll2 == 4) {
		    dieFace2.setIcon(new ImageIcon("die4.gif"));
		  } else if (newRoll2 == 5) {
		    dieFace2.setIcon(new ImageIcon("die5.gif"));
		  } else if (newRoll2 == 6) {
		    dieFace2.setIcon(new ImageIcon("die6.gif"));
		      }
		    contentPane.setBackground(new Color((int)(Math.random()*255), (int)(Math.random()*255), (int)(Math.random()*255)));
  	}
  	public static void main(String[] args) {
  		Roll TwoDice = new Roll();
	}
  
}