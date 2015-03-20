package beans;

import java.util.Date;

public class News {
	private int id;
	private String titre;
	private Date date;
	private String texte;
	private String urlNews;


	public News(int unId, String unTitre, Date uneDate, String texte, String uneUrl) {

		id = unId;
		titre = unTritre;
		date = uneDate;
		texte = unTexte;
		urlNews = uneUrl;

	}

	//Getter and Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTexte() {
		return texte;
	}
	public void setTexte(String texte) {
		this.texte = texte;
	}
	public String getUrlNews() {
		return urlNews;
	}
	public void setUrlNews(String urlNews) {
		this.urlNews = urlNews;
	}

	public void consulterNews() {

		//void

	}

}
