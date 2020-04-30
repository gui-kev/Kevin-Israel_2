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
		
	}
}