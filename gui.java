/**
 * 
 * @author flaver, flaverkleiber@yahoo.de
 * @version 1.0
 * @cophyright 2013 flavcode
 *
 */
//Imports
/**
 * OUTDATED DO NOT USE IT!
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui extends JFrame {
	//Variabel
	private JButton start;
	private JButton start_editor;
	private JPanel panel;
	private JLabel top;
	private JLabel feedback;
	
	private connector first; 
	
	//Constructor
	public gui() {
		 super("24th STS-Launcher V2.5 BETA!");
	        setLocation(300,300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        getContentPane().setLayout(new BorderLayout(5,5));  

	        start = new JButton("Start");
	        start_editor = new JButton("Phantibutton!");

	        panel = new JPanel(new GridLayout(3,1));

	        panel.add(start);
	        panel.add(start_editor);

	        addButtonListener(start);
	        addButtonListener2(start_editor);

	        top = new JLabel("24th STS-Launcher V2.5");
	        top.setHorizontalAlignment(JLabel.CENTER); 
	        feedback = new JLabel("Dieser Button ist NUR dafür da um ne Mission zu bauen!");

	        getContentPane().add(BorderLayout.NORTH, top);
	        getContentPane().add(feedback);

	        getContentPane().add(BorderLayout.WEST, panel);

	        pack();
	        setVisible(true);
	}
	
    private void addButtonListener(JButton b) {
        b.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent ae) { 
               first = new connector();
               try {
				byte[] buff = first.getStartParams();
				starter start = new starter();
				start.normalStart(buff);
               } 
               catch (Exception e) {
            	  // TODO Auto-generated catch block
            	   e.printStackTrace();
               } 
            }
        });
    }
    private void addButtonListener2(JButton b) {
        b.addActionListener(new ActionListener() { 
            public void actionPerformed(ActionEvent ae) { 
               first = new connector();
               try {
				byte[] buff = first.getStartParams();
				starter start = new starter();
				start.editorStart(buff);
               } 
               catch (Exception e) {
            	  // TODO Auto-generated catch block
            	   e.printStackTrace();
               } 
            }
        });
    } 
}

