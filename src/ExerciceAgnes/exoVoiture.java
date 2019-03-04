
package ExerciceAgnes;

public class exoVoiture {

	//////////////
	//Attributs//
	/////////////

	private String couleur ="";
	private int nbPorte = 5;
	private String marque = "";


	//Voiture//


	//Accesseur//
	
	public String getCouleur() {
		return this.couleur;

	}

	//Mutateur//
	
	public void setCouleur(String nouvelleCouleur) {
		this.couleur = nouvelleCouleur ;
	}

	//Accesseur//
	
	public String getMarque() {
		return marque;
	}

	//Mutateur//
	
	public void setMarque(String marque) {
		this.marque = marque;
	}
	//Accesseur//
	
	public int getNbPorte() {
		return nbPorte;
	}
	//Mutateur//
	
	public void setNbPorte(int nbPorte) {
		this.nbPorte = nbPorte;
	}
	public void affichage() {

		System.out.println("La couleur de votre voiture est " + getCouleur());
		System.out.println("La marque de votre voiture est " + getMarque());
		System.out.println("Le nombre de porte de votre voiture est " + getNbPorte());
	}
}
