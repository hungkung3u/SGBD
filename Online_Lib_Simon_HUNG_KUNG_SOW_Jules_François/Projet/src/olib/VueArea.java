package olib;

import java.util.*;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
import java.awt.color.*;


public class VueArea extends JPanel implements Observateur {


	private JTextArea zone;
	private Application app;

	public VueArea(Application a) {
		
		this.app = a;


		zone = new JTextArea(10, 1);
		zone.setBackground(new Color(37, 37, 37));
		zone.setFont(new Font("Verdana", Font.PLAIN, 12));
		zone.setForeground(new Color(0, 240, 100));
		
	}





	public JTextArea getZone() {
		return zone;
	}





	public void setZone(JTextArea zone) {
		this.zone = zone;
	}





	public void actualiser(Sujet s) {

		Application a = (Application) s;
		this.app = a;
		
		zone.setText(app.getChaineRes());
		
		if (app.getComboboxSwitch() == 4) {
			
			
			zone.setText(null);
		//	a.setComboboxSwitch(1);
			
		}
		
		


	}



}