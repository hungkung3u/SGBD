package olib;

import java.util.*;
import javax.swing.*;
import javax.swing.border.*;


import java.awt.*;
import java.awt.event.*;



public class VueBoutons extends JPanel implements Observateur {

	private Application app;
	
	public VueBoutons(ControleurBouton c, Application a) {
		
		
		this.app = a;
		
		JButton bout1 = new JButton("Q1");
		JButton bout2 = new JButton("Q2");
		JButton bout3 = new JButton("Q3");
		JButton bout4 = new JButton("Q4");
		JButton bout5 = new JButton("Q5");
		JButton bout6 = new JButton("Q6");
		JButton bout7 = new JButton("Q7");
		JButton bout8 = new JButton("Clear");
		
		bout1.setBackground(new Color(0, 200, 100));
		bout2.setBackground(new Color(0, 200, 100));
		bout3.setBackground(new Color(0, 200, 100));
		bout4.setBackground(new Color(0, 200, 100));
		bout5.setBackground(new Color(0, 200, 100));
		bout6.setBackground(new Color(0, 200, 100));
		bout7.setBackground(new Color(0, 200, 100));
		bout8.setBackground(new Color(0, 200, 100));
	

		
		
		
		bout1.addActionListener(c);
		bout2.addActionListener(c);
		bout3.addActionListener(c);
		bout4.addActionListener(c);
		bout5.addActionListener(c);
		bout6.addActionListener(c);
		bout7.addActionListener(c);
		bout8.addActionListener(c);
	
		
		this.setBackground(new Color(25, 25, 25));
		this.setLayout(new FlowLayout(FlowLayout.CENTER, 45, 10));
		add(bout1);
		add(bout2);
		add(bout3);
		add(bout4);
		add(bout5);
		add(bout6);
		add(bout7);
		add(bout8);



	}
	

	
	
	public void actualiser(Sujet s) {
		
		Application a = (Application) s;
		this.app = a;
		
		
		
		
		
	}
	
}
