package controleur;

public class Gestionnaire {

	private ArrayList<Site> sites;
	private RSSAgent agent;

	public Gestionnaire(RSSAgent unAgent) {

		sites = new ArrayListe();
		agent = unAgent;
		initialiserSites();
		majNews();

	}

	//Getter and Setter

	public Agent getAgent() {

		return agent;

	}

	public void setAgent(RSSAgent unAgent) {

		agent = unAgent;

	}

	public void AfficherTout() {

		//void

	}

	public void AfficherFavoris() {

		//void

	}

	public void ajoutFavoris(Site unSite) {

		unSite.setFavoris(true);

	}

	public void supprimerFavoris(Site unSite) {

		unSite.setFavoris(false);

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

		List<String> descriptions = new List<String>();
		List<String> liens = new List<String>();
		List<String> titres = new ListString>();
		News news = new News();
		int i = 0;
		Iterator iter = new sites.iterator();
		while(iter.hasNext()) {

			agent.setAdress(iter.next().getUrl());
			descriptions = agent.getDescriptions();
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
