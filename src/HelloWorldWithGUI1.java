import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.event.*;
public class HelloWorldWithGUI1 implements ActionListener {
  final static String LABEL_TEXT = "Hello, world!";
  JFrame frame;
  JPanel contentPane;
  JLabel label;
  JButton button;
  public HelloWorldWithGUI1(){
    /* Create and set up the frame */
    frame = new JFrame("HelloWorldWithGUI");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    /* Create a content pane */
    contentPane = new JPanel();
    /* Create and add label */
    label = new JLabel(LABEL_TEXT);
    contentPane.add(label);
    /* Create and add button */
    button = new JButton("Hide");
    button.setActionCommand("Hide");
    button.addActionListener(this);
    contentPane.add(button);
    /* Add content pane to frame */
    frame.setContentPane(contentPane);
    /* Size and then display the frame. */
    frame.pack();
    frame.setVisible(true);
  }
//  * Handle button click action event
//  * pre: Action event is Hide or Show
//  * post: Clicked button has different text, and label
//  * displays message depending on when the button was clicked.
//  */
  public void actionPerformed(ActionEvent event) {
   String eventName = event.getActionCommand();
   if (eventName.equals("Hide")) {
     label.setText(" "); 
     button.setText("Show");
     button.setActionCommand("Show");
   } else {
     label.setText(LABEL_TEXT);
     button.setText("Hide");
     button.setActionCommand("Hide");
   }
 }
 /**
  * Create and show the GUI.
  */
 private static void runGUI() {
   JFrame.setDefaultLookAndFeelDecorated(true);
   HelloWorldWithGUI1 greeting = new HelloWorldWithGUI1();
 }
 public static void main(String[] args) {
   /* Methods that create and show a GUI should be 
      run from an event-dispatching thread */
   javax.swing.SwingUtilities.invokeLater(new Runnable() {
       public void run() {
         runGUI();
       }
   });
 }
}