package ObjetTableau1;

import java.util.Scanner;

public class ObjetTableau {

	int n;

	public static void main(String[]args) {

		Scanner sc = new Scanner(System.in);

		int valeur = sc.nextInt();

		int[] tab = new int [valeur];

		System.out.println("affichage d'un objet");

		System.out.println("n vaut " );
		for (int i = 0; i < tab.length; i++){
			System.out.print(tab[i]+" * ");
		}
		System.out.println("");
	}
}



