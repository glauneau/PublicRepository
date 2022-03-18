package tp_git;

import java.util.ArrayList;
import java.util.List;

public class System_hospitalier {
	
	private List<Requête> listRequetes;

	public System_hospitalier(List<Requête> listRequetes) {
		super();
		this.listRequetes = listRequetes;
	}

	public System_hospitalier() {
		super();
		listRequetes = new ArrayList<>();
	}

	public List<Requête> getListRequetes() {
		return listRequetes;
	}

	public void setListRequetes(List<Requête> listRequetes) {
		this.listRequetes = listRequetes;
	}
	
	public void recevoirRequete(Requête requete) {
		listRequetes.add(requete);
		String analyse =  analyserRequete(requete);
		String comparaisonDonnees = comparerDonnes();
		System.out.println(analyse);
		System.out.println(comparaisonDonnees);
	}
	
	private String analyserRequete(Requête requête) {
		// Methode  qui prend la requete comme argument  qui appelle comparerdonnes 
		// pour connaitre  les similitude avec la base de donnes 
		return "requête analysée";
	}
	
	private String comparerDonnes() {
		// Methode qui est appellé par AnalyserRequete pour verifier qu'une requete contient ou non 
		// des symptomes similaire a la base de donnés 
		return "Cluster trouvé";
	}

}
