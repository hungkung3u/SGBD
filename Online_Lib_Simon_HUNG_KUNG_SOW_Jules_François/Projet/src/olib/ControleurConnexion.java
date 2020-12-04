package olib;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.*;

public class ControleurConnexion implements ActionListener {

	private Application app;


	public ControleurConnexion(Application app) {

		this.app = app;

	}


	@Override
	public void actionPerformed(ActionEvent e) {


		if (e.getActionCommand().equals("Submit")) {


			app.setComboboxSwitch(5);

			app.notifierObservateurs();

		}




		if (e.getActionCommand().equals("Cancel")) {


			try {	
				app.setComboboxSwitch(6);
				app.notifierObservateurs();
				app.getJd().cnt.close();
			}

			catch(SQLException es) {

				es.printStackTrace();

			}

		}




	}







}
