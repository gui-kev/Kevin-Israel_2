public class Etudiant extends Personne {

	private String promotion;
	private int nbAbsences;
	private String nom;

	public Etudiant(){
		super();
		promotion = "Promotion inconnue";
		nom = "Anonyme";
		nbAbsences = 0;
	}

	public Etudiant(String nom, String prenom, int age, String promotion, int nbAbsences){
		super(nom, prenom, age);
		this.nom = nom;
		this.promotion = promotion;
		this.nbAbsences = nbAbsences;
	}
}