package beans;

import java.util.Date;

public class News {
	private int id;
	private String titre;
	private Date date;
	private String texte;
	private String urlNews;
	
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
	
	

}
