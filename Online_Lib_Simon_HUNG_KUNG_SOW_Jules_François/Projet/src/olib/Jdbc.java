package olib;

import java.sql.*;
import java.util.ArrayList;

public class Jdbc {
    public Connection cnt;
    private String url, login, password;
    private Application app;
	
	
	public Jdbc(String u, String l ,String p, Application a){
		
		this.url = u;
		this.login = l;
		this.password = p;
		this.app = a;	
		
		this.cnt = connect();
		
	}
	
	public Connection connect() {
		//IUT
		//String url = "jdbc:oracle:thin:@charlemagne.iutnc.univ-lorraine.fr:1521:infodb";
		//Local
		//String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			Connection cnt = DriverManager.getConnection(this.url, this.login, this.password);
			app.setChaineRes("Connected");
		    cnt.setAutoCommit(false);
		    return cnt;
		    
		} catch (SQLException e) {
			
			app.setChaineRes("Impossible to connect");
		
			//System.out.print("Connect impossible");
			
			
			e.printStackTrace();
		}
		return null;
	}
	
	public void init() {
		this.cnt = connect();
	}
	

	/**
	 * Retourne une liste contenant la requete
	 * @param query la requete Oracle
	 */
	public ArrayList<String> selectTab(String query) throws Exception {
		cnt = this.connect();
		PreparedStatement ps = this.cnt.prepareStatement(query);
	    ResultSet rs = ps.executeQuery();
	    ArrayList<String> res = new ArrayList<String>();
	    while(rs.next()){
	    	res.add(rs.getString(1));
	    }
	    return res;
	}
	
	/**
	 * Insert ou table, crée un trigger
	 * @param query
	 */
	public void insert(String query) throws Exception {
	    PreparedStatement ps = cnt.prepareStatement(query);
	    ResultSet rs = ps.executeQuery();
	    System.out.println("inséré");
        ps.close();
        rs.close();
	}
	
	/**
	 * Renvoi sous forme de string le résultat d'une requête
	 * @param query
	 */
	public String resultOf(String query) throws Exception{
    	cnt = this.connect();
	    PreparedStatement ps = cnt.prepareStatement(query);
	    ResultSet rs = ps.executeQuery();
    	ResultSetMetaData metadata = rs.getMetaData();
        int columnCount = metadata.getColumnCount();
    	int i=1;
        String res = "";
    	//rs : ligne, i : colonne
        while(rs.next()){
        	i=1;
        	res += "\n\t";
            while (i <= columnCount) {
            	
            	res += rs.getString(i) +" ";
            	i++;
            }
          }
        return res;
    }
    public void printAll(String table) throws Exception{
    	cnt = this.connect();
	    PreparedStatement ps = cnt.prepareStatement("Select * from "+table);
	    ResultSet rs = ps.executeQuery();
    	ResultSetMetaData metadata = rs.getMetaData();
        int columnCount = metadata.getColumnCount();
        int i=1;
        String res = "";
        
        while(rs.next()){
        	i=1;
        	res = "";
        	//res += rs.getString("email") + " " + rs.getString("titre")+" ";
            while (i <= columnCount) {
            	
            	res += rs.getString(i) +" ";
            	i++;
            }
            System.out.println("    " +res);
          }

    }

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
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
    
    
    
    
    
}















/*
 * 
 *  
 * 	public Connection connect() {
		//IUT
		//String url = "jdbc:oracle:thin:@charlemagne.iutnc.univ-lorraine.fr:1521:infodb";
		//Local
		String url = "jdbc:oracle:thin:@localhost:1521:XE";
		try {
			Connection cnt = DriverManager.getConnection(url, "root", "root");
		    cnt.setAutoCommit(false);
		    return cnt;
		} catch (SQLException e) {
			System.out.print("Connect impossible");
			e.printStackTrace();
		}
		return null;
	} 
 *  
 *  
 *  
 *  
 */









