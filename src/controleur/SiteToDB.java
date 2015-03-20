package controleur;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import beans.Site;

/**
 * Classe d'ajout et de récupération des sites dans la bdd
 * @author niels
 *
 */
public class SiteToDB {
	private final String NOM_TABLE = "SITES";

	private Statement stmt;

	
	public SiteToDB(){
		InitDatabase init = new InitDatabase();

		Connection c = init.getConnection();
		try {
			stmt = c.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * Permet d'ajouter un site à la bdd
	 * @param objet Site
	 * @return 1 si l'opération c'est bien passé, 0 si un problème est survenu
	 */
	public int insertSite(Site site){
		int boolFav = 0;

		if(site.isFavori())
			boolFav = 1;



		String sql = "INSERT INTO "+NOM_TABLE+" (NOM,URL,FAVORI) VALUES ('"+site.getNom()+"', '"+site.getUrl()+"', "+boolFav+");"; 
		try {
			stmt.executeUpdate(sql);

		} catch (SQLException e) {
			return 0;
		}

		return 1;
	}

	/**
	 * Permet de récuperer la liste de site de la bdd
	 * @return liste d'objet Site
	 */
	public ArrayList<Site> getAllSite(){
		ArrayList<Site> listAllSite = new ArrayList<Site>();

		try {
			ResultSet rs = stmt.executeQuery( "SELECT * FROM "+NOM_TABLE+";");



			while(rs.next()){
				Site st = new Site();
				st.setId(rs.getInt("ID"));
				st.setNom(rs.getString("NOM"));
				st.setUrl(rs.getString("URL"));
				st.setFavori(rs.getInt("FAVORI")!=0);


				listAllSite.add(st);
			}

		} catch (SQLException e) {
			return null;
		}

		return listAllSite;
	}
}
