
package ExerciceAgnes;

import java.util.Scanner;

public class TestVoiture {

	//Main//

	public static void main(String[] args) {

		// Instantation du scan
		Scanner scan = new Scanner(System.in);

		// Instantation voiture
		exoVoiture voit = new exoVoiture();
		exoVoiture voitu = new exoVoiture();
		exoVoiture voitur = new exoVoiture();
		
		// affect sur obj voit
		voit.setCouleur("mauve ");

		// affect sur obj punto
		System.out.println("Merci d'entrée la couleur de votre voiture ");
		voitu.setCouleur(scan.nextLine());

		System.out.println("Merci d'entrée la marque ");
		voitu.setMarque(scan.nextLine());

		System.out.println("Merci d'entrée le nb de portes de votre voiture ");
		voitu.setNbPorte(scan.nextInt());

		voitur.setCouleur("rouge");
		voitur.setMarque("opel");
		voitur.setNbPorte(5);

		voitu.affichage();
		voitur.affichage();

		String utilisateur = "l'utilisateur possede" + voitur.getMarque() + "et" + voitu.getMarque();


		scan.close();

	}

}
