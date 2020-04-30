public class Execution {
	public static void main(String[] args) {
		//Création des étudiants
		Etudiant etu1 = new Etudiant("Dupont", "Alice", 21, "Pascal", 5);
		Etudiant etu2 = new Etudiant("Dujardin", "Benjamin" ,22, "Ohm", 2);
		Etudiant etu3 = new Etudiant();
		Etudiant etu4 = new Etudiant();	
	
		//Création de l'Administration
		Administratif admin = new Administratif("Dupont", "Béatrice", 19, "Administration", "Secrétaire");

		//Création des enseignants
		Enseignant ens = new Enseignant("Machin", "Boris", 36, "Enseignant", "Informatique", "Electronique");
		
		//Utilisation de la méthode ouMeTrouver()
		System.out.println("🌀🌀🌀🌀  METHODE ouMeTrouver() AVEC LES OBJETS CREES :");
		System.out.print("Pour l'etudiant : ");
		etu1.ouMeTrouver();
		System.out.print("Pour l'administration : ");
		admin.ouMeTrouver();
		System.out.print("Pour l'enseignant : ");
		ens.ouMeTrouver();

		//Création d'un tableau unique dans lequel seront 
		//stockés tous les objets créés à l’exercice 2
		Personne[] tabPersonne = new Personne[6];
		tabPersonne[0] = etu1;
		tabPersonne[1] = etu2;
		tabPersonne[2] = etu3;
		tabPersonne[3] = etu4;
		tabPersonne[4] = admin;
		tabPersonne[5] = ens;

		//appelle la méthode ouMeTrouver() en parcourant le tableau 
		//précédemment créé (sans vérifier le type de l’objet lu)
		System.out.println("\n 🌀🌀🌀🌀  METHODE ouMeTrouver() AVEC LES OBJETS DU TABLEAU tabPersonne[] :");
		System.out.print("Pour l'etudiant : ");
		tabPersonne[2].ouMeTrouver();
		System.out.print("Pour l'administration : ");
		tabPersonne[4].ouMeTrouver();
		System.out.print("Pour l'enseignant : ");
		tabPersonne[5].ouMeTrouver();

		//Affichage du contenu du tableau
		for(Personne personne : tabPersonne){
			System.out.println(personne);
		}

		//Affectation des noms, prénoms, ages, promotions 
		//aux étudiants “anonymes” précédemment créés
		etu3.setNom("Belfort");
		etu3.setPrenom("Ravière");
		etu3.setAge(18);
		etu3.setPromotion("Alpha");
		etu4.setNom("Lucky");
		etu4.setPrenom("Luke");
		etu4.setAge(21);
		etu4.setPromotion("Omega");

		//Affichage du contenu du tableau
		for(Personne personne : tabPersonne){
			System.out.println(personne);
		}

	}
}