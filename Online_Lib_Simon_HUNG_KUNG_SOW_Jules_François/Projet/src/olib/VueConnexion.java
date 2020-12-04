package olib;


import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
import java.sql.*;

public class VueConnexion extends JPanel implements Observateur {

	private Application app;
	private JTextField login, url;
	private JPasswordField mdp;
	private JButton submit, cancel;


	public VueConnexion(ControleurConnexion cc, Application a) {



		this.app = a;

		JPanel pr = new JPanel();
		pr.setBackground(new Color(37, 37, 37));
		pr.setLayout(new GridLayout(5, 15, 5, 15));
		pr.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));


		login = new JTextField();
		url = new JTextField();
		mdp = new JPasswordField();

		login.setBackground(new Color(15, 15, 15));
		login.setForeground(new Color(0, 240, 100));

		mdp.setBackground(new Color(15, 15, 15));
		mdp.setForeground(new Color(0, 240, 100));

		url.setBackground(new Color(15, 15, 15));
		url.setForeground(new Color(0, 240, 100));


		JPanel bt = new JPanel();
		bt.setLayout(new FlowLayout(FlowLayout.RIGHT, 80, 80));
		bt.setBackground(new Color(37, 37, 37));

		submit = new JButton("Submit");
		submit.addActionListener(cc);
		submit.setBackground(new Color(0, 200, 100));

		cancel = new JButton("Cancel");
		cancel.addActionListener(cc);
		cancel.setBackground(new Color(0, 200, 100));


		bt.add(submit);
		bt.add(cancel);



		JLabel jl1 = new JLabel("User:     	");
		jl1.setForeground(new Color(0, 240, 100));
		JLabel jl2 = new JLabel("Password:		");
		jl2.setForeground(new Color(0, 240, 100));
		JLabel jl3 = new JLabel("URL: 			");	
		jl3.setForeground(new Color(0, 240, 100));


		this.setLayout(new GridLayout(2, 1));
		this.setBackground(new Color(37, 37, 37));
		this.setPreferredSize(new Dimension(400, 200));





		pr.add(jl1);
		pr.add(login);
		pr.add(jl2);
		pr.add(mdp);
		pr.add(jl3);
		pr.add(url);

		this.add(pr);
		this.add(bt);


	}






	@Override
	public void actualiser(Sujet s) {

		Application a = (Application) s;
		this.app = a;



		switch (app.getComboboxSwitch()) {

		case 5: 


			String pass = new String(mdp.getPassword());
			app.setJd(new Jdbc(url.getText(), login.getText(), pass, this.app)); 


			break; 


		case 6:

			url.setText(null);
			login.setText(null);
			mdp.setText(null);


			break;


		}


	}







}
