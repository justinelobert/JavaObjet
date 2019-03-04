package ObjetTableau1;

import java.util.Scanner;

public class ProgObjet {
	
	int n;
	
	public void affiche() {
		
		Scanner sc = new Scanner(System.in);
		
		int valeur = sc.nextInt();
		int[] tab = new int [valeur];
		
		System.out.println("affichage d'un objet");
		System.out.println("n vaut "+n);
		for (int i = 0; i < n; i++){
		System.out.print(tab[i]+" * ");
		}
		System.out.println("");
		}
	
	public static void main(String[] args) {
		
	
	}

}
