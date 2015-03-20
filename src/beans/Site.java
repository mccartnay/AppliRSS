package beans;

import java.util.ArrayList;

public class Site {
	private int id;
	private String nom;
	private String url;
	private ArrayList<News> news;
	private boolean favori;


	public Site(int unId, String unNom, String uneUrl) {

		id = unId;
		nom = unNom;
		url = uneUrl;
		news = new ArrayList<News>();
		favori = false;

	}


	public void ajouterNews(News uneNews) {

		news.push(unNews);

	}


	public void razNews(){
		this.news.clear();
	}

	//Getter and Setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public ArrayList<News> getNews() {
		return news;
	}
	public void setNews(ArrayList<News> news) {
		this.news = news;
	}
	public boolean isFavori() {
		return favori;
	}
	public void setFavori(boolean favori) {
		this.favori = favori;
	}

	public void sauvegarder() {

		//void

	}

	public void connecter() {

	

	}

	public void afficherNews() {

	

	}

}
