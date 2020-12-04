package olib;

import java.util.ArrayList;



public class Application implements Sujet {

	private Jdbc jd;
	private ArrayList<Observateur> observateurs;
	private String chaineRes, email, titre, article, login, password, url;
	private int comboboxSwitch;


	public Application(){

		this.login = "root";
		this.password = "root";
		this.url = "jdbc:oracle:thin:@localhost:1521:XE";
		this.jd = new Jdbc(url, login, password, this);
		this.observateurs = new ArrayList<Observateur> ();
		this.chaineRes = "";
		this.email = "peter@cis.upenn.edu";
		this.titre = "Laboratory for Foundations of Computer Science";
		this.article = "Adding Structure to Unstructured Data";

		this.comboboxSwitch = 0;  

	}
	/**
	 * Q1
	 * @param emailAuteur
	 * @throws Exception
	 */
	public String listeArticleAuteur(String emailAuteur) throws Exception{
		String res = "\n" + "Article(s) de "+emailAuteur;
		res += jd.resultOf("SELECT titre FROM ecrire WHERE email = '"+emailAuteur+"'");
		return res;
	}
	/**
	 * Q2
	 * @param emailAuteur
	 * @throws Exception
	 */
	public String coAuteurs(String emailAuteur) throws Exception{
		String res = "";
		res = "\n" + ("Collaborateur de "+emailAuteur + ": ") + "\n";

		ArrayList<String> lTitre = jd.selectTab("Select Titre from ecrire where email = '"+emailAuteur+"'");
		for (String string : lTitre) {
			res += ("\n" + "Pour l'article : "+string);
			res += "\n " + jd.resultOf("Select email from ecrire where titre = '"+string +"'" + "\n");
			//System.out.println(res);
		}

		return res;
	}
	/**
	 * Q3
	 * @throws Exception
	 */
	public String laboratoires() throws Exception{
		String res = "\n" + ("Liste labo-chercheur :") + "\n"; 
		res += jd.resultOf("Select * from Travailler order by EMAIL") +"\n";

		return res;
	}

	/**
	 * Q4
	 * @param nbMin
	 * @throws Exception
	 */
	public String aAnnoter(int nbMin) throws Exception{
		String res = "\n Listes des chercheurs ayant annote au moins "+nbMin+" fois : \n";
		ArrayList<String> lMail = jd.selectTab("Select email from Chercheur");

		for (String string : lMail) {
			res += jd.resultOf("SELECT DISTINCT email from AnNoter where (SELECT COUNT(*) FROM AnNoter where EMAIL = '"+string+"')  > 2 AND EMAIL = '"+string+"'");
			res +="\n";
		}
		return res;
	}

	/**
	 * Q5
	 * @param emailChercheur
	 * @throws Exception
	 */
	public String moyenneChercheur(String emailChercheur) throws Exception {

		String res = "";
		res = "\n" + ("Moyenne de "+emailChercheur + "\n");
		res += jd.resultOf("Select avg(note) from Noter where EMAIL = '"+emailChercheur+"' \n");
		return res;
	}

	public String infoArticles(String nomLabo) throws Exception {
		ArrayList<String> lActeur = jd.selectTab("SELECT EMAIL from Travailler where NOMLABO = '"+nomLabo+"'");
		String res = "";
		String tmp;
		for (String acteur : lActeur) {
			tmp =jd.resultOf("SELECT count(*) from Ecrire where EMAIL = '"+acteur+"'");
			tmp = tmp.replaceAll("\\s+", "");  //enlève  les espaces
			int nbArticles = Integer.parseInt(tmp);  
			res +="L'auteur "+acteur+" a publié " +nbArticles +" article(s) ";
			ArrayList<String> lArticle = jd.selectTab("Select Titre from Ecrire where email = '"+acteur+"'");
			int somme = 0;
			int nbNotes= 0;
			for (String article : lArticle) {
				try {
					tmp = jd.resultOf("SELECT sum(NOTE) from NOTER where TITRE = '"+article+"'");
					tmp = tmp.replaceAll("\\s+", "");
					somme += Integer.parseInt(tmp);
					tmp = jd.resultOf("SELECT count(*) from NOTER where TITRE = '"+article+"'");
					tmp = tmp.replaceAll("\\s+", "");
					nbNotes += Integer.parseInt(tmp);
				}
				//Pas de note sur cette article
				catch(java.lang.NumberFormatException e1) {
				}
			}
			if(nbNotes == 0) {
				res += "et n'a pas obtenu de notes ";
			}
			else {
				res += "et a obtenu "+nbNotes+" notes pour une moyenne de "+(somme/nbNotes)+"\n";
			}
		}
		return res;
	}


	/**
	 * Q7
	 * @param article
	 * @return true si la condition est vérifié, false sinon
	 * @throws Exception
	 */
	public boolean verifNote(String article) throws Exception {
		String auteur = jd.resultOf("Select email from ecrire where titre = '"+article+"'");
		auteur = auteur.replaceAll("\\s+", "");
		String tmpNoteMax = jd.resultOf("Select max(note) from Noter where TITRE ='"+article+"'");
		tmpNoteMax = tmpNoteMax.replaceAll("\\s+", "");
		int noteMax;
		try {
			noteMax = Integer.parseInt(tmpNoteMax);
		}
		catch (java.lang.NumberFormatException e){
			return true; //L'article n'a pas été noté, il n'y rien a rembousé
		}
		ArrayList<String> labo = jd.selectTab("Select nomLabo from travailler where email = '"+auteur+"'");
		ArrayList<String> collegues =new ArrayList<String>();
		for (String lab : labo) {
			collegues.addAll(jd.selectTab("Select email from travailler where nomLabo = '"+lab+"'"));
		}
		ArrayList<String> noteursMax = jd.selectTab("Select email from Noter where Note ='"+noteMax+"' and titre= '"+article+"'");

		for (String string : collegues) {
			if (noteursMax.contains(string)) {
				return false;
			}
		}
		return true;
	}


	public void enregistrerObservateur(Observateur o) {

		this.observateurs.add(o);

	}



	public void supprimerObservateur(Observateur o) {

		int i = this.observateurs.indexOf(o);
		if (i >= 0) {
			this.observateurs.remove(i);
		}

	}


	public void notifierObservateurs() {

		for (int i = 0; i < this.observateurs.size(); i++) {
			Observateur observer = this.observateurs.get(i);
			observer.actualiser(this);
		}	

	}
	public String getChaineRes() {
		return chaineRes;
	}
	public void setChaineRes(String chaineRes) {
		this.chaineRes = chaineRes;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public int getComboboxSwitch() {
		return comboboxSwitch;
	}
	public void setComboboxSwitch(int comboboxSwitch) {
		this.comboboxSwitch = comboboxSwitch;
	}
	public Jdbc getJd() {
		return jd;
	}
	public void setJd(Jdbc jd) {
		this.jd = jd;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}





}
