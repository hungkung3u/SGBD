package olib;

import java.util.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.JComboBox;

import java.awt.*;
import java.awt.event.*;
import java.sql.SQLException;



public class ControleurBouton implements ActionListener {


	private Application app;

	public ControleurBouton(Application app) {

		this.app = app;

	}


	public void actionPerformed(ActionEvent e) {

		/*String paramEmail = "";

		if (e.getSource() instanceof JComboBox) {


			JComboBox<String> jcb = (JComboBox) e.getSource();
			paramEmail = (String) jcb.getSelectedItem();	

		} */



		if (e.getActionCommand().equals("Q1")) {

			//Q1
			app.setComboboxSwitch(1);
			try {
				//String res = app.listeArticleAuteur("Rachid.Guerraoui@epfl.ch");
				String res = app.listeArticleAuteur(app.getEmail());
				app.setChaineRes(res);
				app.notifierObservateurs();


			}

			catch (Exception ee) {

				ee.printStackTrace();
			}

		}

		if (e.getActionCommand().equals("Q2")) {

			//Q2
			//
			app.setComboboxSwitch(1);

			try {
				//String res = app.coAuteurs("susan@cis.upenn.edu");
				String res = app.coAuteurs(app.getEmail());
				app.setChaineRes(res);
				app.notifierObservateurs();


			}

			catch (Exception ee) {

				ee.printStackTrace();
			}

		}

		if (e.getActionCommand().equals("Q3")) {

			//Q3
			//

			try {
				String res = app.laboratoires();
				app.setChaineRes(res);
				app.notifierObservateurs();


			}

			catch (Exception ee) {

				ee.printStackTrace();
			}




		}

		if (e.getActionCommand().equals("Q4")) {


			//Q4
			//


			try {
				String res = app.aAnnoter(1);
				app.setChaineRes(res);
				app.notifierObservateurs();


			}

			catch (Exception ee) {

				ee.printStackTrace();
			}

		}

		if (e.getActionCommand().equals("Q5")) {

			//Q5
			//

			app.setComboboxSwitch(1);

			try {
				//String res = app.moyenneChercheur("peter@cis.upenn.edu");
				String res = app.moyenneChercheur(app.getEmail());
				app.setChaineRes(res);
				app.notifierObservateurs();


			}

			catch (Exception ee) {

				ee.printStackTrace();
			}

		}

		if (e.getActionCommand().equals("Q6")) {

			//Q6
			//System.out.println(app.infoArticles("Laboratory for Foundations of Computer Science"));

			app.setComboboxSwitch(2);



			try {
				//String res = app.infoArticles("Laboratory for Foundations of Computer Science");
				String res = app.infoArticles(app.getTitre());
				//System.out.println(app.getTitre());
				app.setChaineRes(res);
				app.notifierObservateurs();
				app.getJd().cnt.close();


			}

		
			catch (Exception ee) {
				
				try {
				app.setChaineRes("\n Rien Pour ce labo\n");
				app.notifierObservateurs();
				app.getJd().cnt.close();
				}
				
				catch(SQLException es) {

					es.printStackTrace();
				}
			}


			

			// 



		}


		if (e.getActionCommand().equals("Q7")) {

			//Q7
			//false
			// System.out.println(app.verifNote("Representing and Querying XML with Incomplete Information"));
			//true
			//    System.out.println(app.verifNote("A User-centric Framework for Accessing Biological Sources and Tools"));


			app.setComboboxSwitch(3);
			
			
			

			try {


				if (app.verifNote(app.getArticle()) == true) {

					app.setChaineRes(" \n Article non note \n"); 

				}

				else app.setChaineRes("\n Article note \n"); 



				app.notifierObservateurs();
				app.getJd().cnt.close();


			}

			catch (Exception ee) {

				try {
					app.setChaineRes("\n Article non repertorie \n");
					app.notifierObservateurs();
					app.getJd().cnt.close();
					}
					
					catch(SQLException es) {

						es.printStackTrace();
					}
			}


		}



		if (e.getActionCommand().equals("Clear")) {

			app.setComboboxSwitch(4);
			app.notifierObservateurs();


		}


	}








}
