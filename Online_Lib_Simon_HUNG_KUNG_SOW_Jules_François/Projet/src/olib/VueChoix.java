package olib;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VueChoix extends JPanel implements Observateur {


	private JComboBox<String> jcb, jcbt, jcba;
	private JLabel jl1, jl2, jl3;

	private Application app;

	public VueChoix(Application a) {

		this.app = a;



		String[] emails = {"peter@cis.upenn.edu", "cohen@lri.fr", "chris@lri.fr", "susan@cis.upenn.edu", "luc.segoufin@inria.fr",
				"lamport@microsoft.com", "lynch@theory.csail.mit.edu", "Rachid.Guerraoui@epfl.ch"
		};


		jcb = new JComboBox<String>(emails);
		jcb.setBackground(new Color(37, 37, 37));
		jcb.setForeground(new Color(0, 240, 100));
		jcb.setFont(new Font("Verdana", Font.PLAIN, 12));
		jcb.setFocusable(false);


		jcb.addItemListener(new ItemListener(){



			public void itemStateChanged(ItemEvent e){

				JComboBox<String> jcb = (JComboBox) e.getSource();
				String paramEmail = (String) jcb.getSelectedItem();	

				app.setEmail(paramEmail);
			}

		}

				);





		String[] titre = {"Laboratory for Foundations of Computer Science",
				"Department of Computer and Information Science University of Pennsylvania", "Laboratoire de Recherche en Informatique",
				"Laboratoire Sp�cification et V�rification","Distributed Programming Laboratory",
				"Theory of Distributed Systems","Microsoft Corporation", "INRIA Saclay - Ile-de-France"};	



		jcbt = new JComboBox<String>(titre);
		jcbt.setBackground(new Color(37, 37, 37));
		jcbt.setForeground(new Color(0, 240, 100));
		jcbt.setFont(new Font("Verdana", Font.PLAIN, 12));
		jcbt.setFocusable(false);

		jcbt.addItemListener(new ItemListener(){



			public void itemStateChanged(ItemEvent e){

				JComboBox<String> jcbt = (JComboBox) e.getSource();
				String paramTitre = (String) jcbt.getSelectedItem();	

				app.setTitre(paramTitre);
			}

		}

				);


		///////////////////////////////////////////


		String[] article = {"Adding Structure to Unstructured Data",
				"A User-centric Framework for Accessing Biological Sources and Tools", "PDiffView: Viewing the Difference in Provenance of Workflow Results",
				"Automata and Logics for Words and Trees over an Infinite Alphabet","Representing and Querying XML with Incomplete Information",
				"The TLA?+? Proof System: Building a Heterogeneous Verification Platform","Partial reversal acyclicity", "Reliably Detecting Connectivity Using Local Graph Traits"
				, "Generalized Universality", "Transactional Memory: Glimmer of a Theory" };	




		jcba = new JComboBox<String>(article);
		jcba.setBackground(new Color(37, 37, 37));
		jcba.setForeground(new Color(0, 240, 100));
		jcba.setFont(new Font("Verdana", Font.PLAIN, 12));
		jcba.setFocusable(false);

		jcba.addItemListener(new ItemListener(){



			public void itemStateChanged(ItemEvent e){

				JComboBox<String> jcba = (JComboBox) e.getSource();
				String paramArticle = (String) jcba.getSelectedItem();	

				app.setArticle(paramArticle);
			}

		}

				);





		jl1 = new JLabel("Donner un email puis reappuyez sur le bouton "+"    ",JLabel.CENTER);
		jl1.setForeground(new Color(0, 240, 100));
		jl1.setFont(new Font("Verdana", Font.PLAIN, 12));

		//add(jl1);
		//add(jcb); 







		jl2 = new JLabel("Donner un nom de labo puis reappuyez sur le bouton"+"    ",JLabel.CENTER);
		jl2.setForeground(new Color(0, 240, 100));
		jl2.setFont(new Font("Verdana", Font.PLAIN, 12));
		//add(jl2);
		//add(jcbt); 




		jl3 = new JLabel("Donner un nom d'article puis reappuyez sur le bouton"+"    ",JLabel.CENTER);
		jl3.setForeground(new Color(0, 240, 100));
		jl3.setFont(new Font("Verdana", Font.PLAIN, 12));

		//add(jl3);
		//add(jcba);

		setLayout(new GridLayout(1, 1));
		setBackground(new Color(25, 25, 25));








	}



	public void actualiser(Sujet s) {

		Application a = (Application) s;
		this.app = a;


		switch (app.getComboboxSwitch()) {

		case 1: 
			
			this.add(jl1);
			this.add(jcb); 
			this.remove(jl2);
			this.remove(jcbt);
			this.remove(jl3);
			this.remove(jcba);
			revalidate();
			repaint();
			
			
			break;	

		case 2: 
			
			this.remove(jl1);
			this.remove(jcb); 
			this.add(jl2);
			this.add(jcbt);
			this.remove(jl3);
			this.remove(jcba);
			revalidate();
			repaint();
		
	


			break;


		case 3: 
			
			this.remove(jl1);
			this.remove(jcb); 
			this.remove(jl2);
			this.remove(jcbt);
			this.add(jl3);
			this.add(jcba);
			revalidate();
			repaint();
		
	
			


			break;

		}




	}
}
