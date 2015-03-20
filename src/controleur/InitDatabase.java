package controleur;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Classe d'initialisation de la base de donnée si elle n'existe pas, et permet de s'y connecter
 * @author niels
 *
 */
public class InitDatabase {
	private final String CHEMIN_FICHIER = "test.db";
	private final String NOM_TABLE = "SITES";

	private Connection c = null;

	public InitDatabase(){
		try {
			Class.forName("org.sqlite.JDBC");
			c = DriverManager.getConnection("jdbc:sqlite:"+CHEMIN_FICHIER);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Permet de créer la base de donnée si elle n'existe pas
	 */
	public void createDatabase() {
		try 
		{ 
			java.io.File fichier = new java.io.File(CHEMIN_FICHIER);
			if(!fichier.exists())
				fichier.createNewFile();
		} 
		catch (IOException e) {} 


		Statement stmt = null;
		try {

			stmt = c.createStatement();	
			String sqlSite = "CREATE TABLE IF NOT EXISTS "+NOM_TABLE+" " +
					"(ID 			INTEGER PRIMARY KEY   AUTOINCREMENT," +
					" NOM           TEXT    UNIQUE	NOT NULL, " + 
					" URL           TEXT    UNIQUE	NOT NULL, " + 
					" FAVORI        INT(1))"; 
			stmt.executeUpdate(sqlSite);

			stmt.close();
		} catch ( Exception e ) {
			e.printStackTrace();
		}
	}

	/**
	 * @return objet de connexion à la bdd
	 */
	public Connection getConnection(){
		return c;
	}

	/**
	 * Méthide permetant de fermer la connexion à la bdd
	 */
	public void closeConnection(){
		try {
			c.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


}
