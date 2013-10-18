import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.GridBagConstraints;
import java.awt.*;
import java.awt.event.*;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.Canvas;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JProgressBar;


public class newGui extends JFrame {

	private JPanel contentPane;
	private connector first; 

	/**
	 * Create the frame.
	 */
	public newGui() {
		super("24th Addonslauncher V2.5a");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 610, 487);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JButton start= new JButton("ArmA3 Starten");
		
		JButton start_editor = new JButton("Phanti-Button");
		
		addButtonListener(start);
        addButtonListener2(start_editor);
		
		JLabel lblthStsAddonlauncher = new JLabel("24th STS AddonLauncher");
		lblthStsAddonlauncher.setFont(new Font("Tahoma", Font.PLAIN, 40));
		
		JLabel lblNewLabel = new JLabel("<html><body>Version: 2.5a<br />\r\nProgrammier:[24th STS]flaver<br />\r\nClan: 24th STS<br />\r\n</body>\r\n</html>");
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("http://files.24th-sts.eu/squad/logo.png"));
		
		JButton btnNewButton = new JButton("Addonsyncen");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JProgressBar progressBar = new JProgressBar();
		
		JLabel lblBitteKlickeAuf = new JLabel("Bitte klicke auf Addonssyncen um zu schauen ob es neue Addons gibt");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(63)
							.addComponent(lblthStsAddonlauncher))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(153)
							.addComponent(start)
							.addGap(106)
							.addComponent(start_editor))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 205, GroupLayout.PREFERRED_SIZE)
							.addGap(88)
							.addComponent(lblNewLabel_1, GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(197)
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, 252, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(143, Short.MAX_VALUE)
					.addComponent(lblBitteKlickeAuf)
					.addGap(109))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblthStsAddonlauncher)
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(lblNewLabel_1)
						.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 116, GroupLayout.PREFERRED_SIZE))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(33)
							.addComponent(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(20)
							.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
					.addComponent(lblBitteKlickeAuf)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(start)
						.addComponent(start_editor))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		setVisible(true);
	}
	//Normalstart
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
    //Editorstart
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

