package beans;

import java.util.Date;

public class News {
	private String titre;
	private String texte;
	private String urlNews;


	public News(String unTitre, String texte, String uneUrl) {

		titre = unTritre;
		texte = unTexte;
		urlNews = uneUrl;

	}

	public News() {

		titre = "";
		texte = "";
		urlNews = "";

	}


	//Getter and Setter
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
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
