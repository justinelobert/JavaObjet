package objetVoiture;

public class exoVoiture {




		private String couleur;
		private String marque;
		private int portieres = 3;

		public exoVoiture(String marque) {
			System.out.println("Création d'une voiture de marque : " + marque);
			this.marque = marque;
		}



		public void setCouleur(String couleur) {
			this.couleur = couleur;
		}

		public String getCouleur() {
			return couleur;
		}

		private void setMarque(String marque) {
			this.marque = marque;
		}

		public String getMarque() {
			return marque;
		}

		public void setPortieres(int portieres) {
			this.portieres = portieres;
		}

		public int getPortieres() {
			return portieres;
		}

		public void affiche() {
			System.out.println(couleur + " " + marque + " " + portieres);
		}
		public static void affiche3(Voiture uneVoiture) {
			System.out.println(uneVoiture.getCouleur() + " " + uneVoiture.getMarque() + " " + uneVoiture.getPortieres());

		}

	}


