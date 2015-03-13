package controleur;

public class Gestionnaire {

	private ArrayList<Site> sites;
	private RSSAgent agent;

	public Gestionnaire(RSSAgent unAgent) {

		sites = new ArrayListe();
		agent = unAgant;

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

	public void majNews() {

		//void

	}

	public void trierSite() {

		//void

	}

	public void sauvegarderBDD() {

		//void

	}

}
