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

	public String getPromotion(){
		return promotion;
	}

	public int getNbAbsences(){
		return nbAbsences;
	}

	public String getNom(){
		return nom;
	}

	public void setPromotion(String promotion){
		this.promotion = promotion;
	}

	public void setNbAbsences(int nbAbsences){
		this.nbAbsences= nbAbsences;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public void ouMeTrouver(){
		System.out.println("  Je suis en cours tous les jours, sauf les jeudis après-midis"
				+" (je fais du sport, mais c’est comme un cours car j’aime le sport \n");
	}
	
	public String toString(){
		return(" ✅ Etudiant \n"+super.toString() 
				+"\n \t Promotion : " + promotion 
				+"\n \t Nombre d'absences : "+ nbAbsences+ "\n");
	}
	
}