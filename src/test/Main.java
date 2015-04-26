package test;

import beans.Site;
import controleur.Gestionnaire;
import controleur.RSSAgent;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Test t = new Test();
		
		Site s1 = new Site();
		s1.setNom("test1");
		s1.setFavori(false);
		s1.setUrl("http://korben.info/feed");
		
		RSSAgent agent = new RSSAgent(null);
		Gestionnaire gest = new Gestionnaire(agent);
		
		gest.ajouterSite(s1);
		gest.addListener(t);
	}

}
