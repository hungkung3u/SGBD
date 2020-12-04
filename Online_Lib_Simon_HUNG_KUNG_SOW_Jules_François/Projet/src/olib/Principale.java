package olib;

import java.awt.event.*;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.*;

import javax.swing.*;
import javax.swing.border.*;

public class Principale {


	public static void main(String[] args) throws Exception {

		Application app = new Application();





		ControleurBouton c = new ControleurBouton(app);
		ControleurConnexion cc = new ControleurConnexion(app);
		VueConnexion vco = new VueConnexion(cc, app);
		VueChoix vc = new VueChoix(app);
		VueBoutons vb = new VueBoutons(c, app);
		VueArea va = new VueArea(app);
		JScrollPane jsp = new JScrollPane(va.getZone());
		jsp.getVerticalScrollBar().setBackground(Color.black);
		jsp.getVerticalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = new Color(0, 150, 75);
			}
		});

		jsp.getHorizontalScrollBar().setBackground(Color.black);
		jsp.getHorizontalScrollBar().setUI(new BasicScrollBarUI() {
			@Override
			protected void configureScrollBarColors() {
				this.thumbColor = new Color(0, 150, 75);
			}
		});



		va.getZone().append("Starting... \r\n\n //DISCLAIMER \r\n\n Pour vérifier que vous etes bien connecté une fois les logins rentrés, \n merci d'appuyer sur le bouton SUBMIT une seconde fois"
				+ " pour vous assurer que \n le message 'connected' apparaisse.");

		app.enregistrerObservateur(vb);
		app.enregistrerObservateur(va);
		app.enregistrerObservateur(vc);
		app.enregistrerObservateur(vco);

		JFrame frame=new JFrame();

		frame.setBackground(Color.black);
		frame.getContentPane().add(vco,BorderLayout.WEST);
		frame.getContentPane().add(vc,BorderLayout.NORTH);
		frame.getContentPane().add(jsp, BorderLayout.CENTER);	
		frame.getContentPane().add(vb, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(new Dimension(1200,500));
		frame.setVisible(true);	



		//Exemple d'utilisation (console) 

		//Q1
		//System.out.print(app.listeArticleAuteur("Rachid.Guerraoui@epfl.ch"));

		//Q2
		//System.out.println(app.coAuteurs("susan@cis.upenn.edu"));

		//Q3
		//System.out.println(app.laboratoires());

		//Q4
		//System.out.println(app.aAnnoter(2));

		//Q5
		//System.out.println(app.moyenneChercheur("peter@cis.upenn.edu"));

		//Q6
		//System.out.println(app.infoArticles("INRIA Saclay - Ile-de-France"));

		//Q7
		//false
		//System.out.println(app.verifNote("Representing and Querying XML with Incomplete Information"));
		//System.out.println(app.verifNote("Partial reversal acyclicity"));
		//true
		//System.out.println(app.verifNote("A User-centric Framework for Accessing Biological Sources and Tools"));
		/*
        //Q8

        //b

        //test :
        //erreur
        //app.jd.insert("insert into annoter values('Rachid.Guerraoui@epfl.ch', 'The TLA?+? Proof System: Building a Heterogeneous Verification Platform', 'workflow' )");
        //corect
        app.jd.insert("insert into annoter values('test@mail10.com', 'testTitre', 'test Tag' )");

        System.out.println(app.jd.resultOf("select * from log_chercheurs"));

		 */

	}





}
