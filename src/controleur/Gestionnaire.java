package controleur;

import java.util.ArrayList;
import java.util.Iterator;

import beans.News;
import beans.Site;

public class Gestionnaire {

	private ArrayList<Site> sites;
	private RSSAgent agent;

	public Gestionnaire(RSSAgent unAgent) {

		sites = new ArrayList<Site>();
		agent = unAgent;
		initialiserSites();
		majNews();

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

	}


	public void majNews() {

		//Parcourir liste des sites et demander les news à RSSAgent
		//Récupérer les trois listes qu'il nous renvoit
		//Les parcourir en même temps pour ajouter les news au Site courant

		ArrayList<String> descriptions = new ArrayList<String>();
		ArrayList<String> liens = new ArrayList<String>();
		ArrayList<String> titres = new ArrayList<String>();
		News news = new News();
		int i = 0;
		Iterator<Site> iter = sites.iterator();
		while(iter.hasNext()) {
			

			agent.setAddress(iter.next().getUrl());
			descriptions = agent.getDescription();
			liens = agent.getLink();
			titres = agent.getTitle();
			iter.next().razNews();
			for(i; i<titres.length();i++) {

				news.setTitre(titres(i));
				news.setUrlNews(liens(i));
				news.setTexte(descriptions(i));
				iter.next().ajouterNews(news);

			}

		}

	}

	public void trierSite() {

		for (Site s : sites) {

			//balancer les sites favoris au début de la liste

		}

	}

	public void sauvegarderBDD() {

		sauvegarderSites(sites);

	}

}
