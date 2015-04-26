package controleur;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import beans.News;
import beans.Site;

public class Gestionnaire {

	private ArrayList<Site> sites;
	private RSSAgent agent;
	private SiteToDB siteToDB;
	private List<NewsUpdatedListener> listeners = new ArrayList<NewsUpdatedListener>();

	public Gestionnaire(RSSAgent unAgent) {

		siteToDB = new SiteToDB();
		
		sites = new ArrayList<Site>();

		agent = unAgent;
		initialiserSites();
		//majNews();

	}
	
	
	public void addListener(NewsUpdatedListener toAdd) {
        listeners.add(toAdd);
    }

	//Getter and Setter

	public RSSAgent getAgent() {

		return agent;

	}

	public void setAgent(RSSAgent unAgent) {

		agent = unAgent;

	}

	public ArrayList<Site> getAll() {

		return sites;

	}

	public void AfficherFavoris() {

		//void

	}

	public void ajoutFavoris(Site unSite) {

		unSite.setFavori(true);

	}

	public void supprimerFavoris(Site unSite) {

		unSite.setFavori(false);

	}

	public void ajouterSite(Site unSite) {

		sites.add(unSite);

	}

	public void supprimerSite(Site unSite) {

		sites.remove(unSite);

	}

	public void initialiserSites() {

		//charger sites en BDD dans la liste
		sites = siteToDB.getAllSite();

	}


	public void majNews() {

		//Parcourir liste des sites et demander les news à RSSAgent
		//Récupérer les trois listes qu'il nous renvoit
		//Les parcourir en même temps pour ajouter les news au Site courant

		ArrayList<String> descriptions = new ArrayList<String>();
		ArrayList<String> liens = new ArrayList<String>();
		ArrayList<String> titres = new ArrayList<String>();
		News news = new News();
		
		for(Site s : sites){
			agent.setAddress(s.getUrl());
			descriptions = (ArrayList<String>) agent.getDescription();
			liens = (ArrayList<String>) agent.getLink();
			titres = (ArrayList<String>) agent.getTitle();
			s.razNews();
			
			for(int i=0; i<titres.size();i++) {

				news.setTitre(titres.get(i));
				news.setUrlNews(liens.get(i));
				news.setTexte(descriptions.get(i));
				s.ajouterNews(news);

			}
		}
		/*
		Iterator<Site> iter = sites.iterator();
		while(iter.hasNext()) {
			

			agent.setAddress(iter.next().getUrl());
			descriptions = (ArrayList<String>) agent.getDescription();
			liens = (ArrayList<String>) agent.getLink();
			titres = (ArrayList<String>) agent.getTitle();
			iter.next().razNews();
			for(int i=0; i<titres.size();i++) {

				news.setTitre(titres.get(i));
				news.setUrlNews(liens.get(i));
				news.setTexte(descriptions.get(i));
				iter.next().ajouterNews(news);

			}

		}
		*/
		//informe les listeners des mises à jours
		for(NewsUpdatedListener listener : listeners){
			listener.newsUpdated();
		}

	}

	public void trierSite() {
		ArrayList<Site> listeTmp = new ArrayList<Site>();

		for (Site s : sites) {
			if(s.isFavori())
				listeTmp.add(s);
		}
		for (Site s : sites) {
			if(!s.isFavori())
				listeTmp.add(s);
		}
		sites = listeTmp;
	}

	public void sauvegarderBDD() {
		siteToDB.updateTableSites(sites);
	}

}
