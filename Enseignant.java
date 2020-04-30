public class Enseignant extends Personnel {
	private String matierePrincipale;
	private String matiereSecondaire;

	public Enseignant(String nom, String prenom, int age, String service, String matierePrincipale, String matiereSecondaire){
		super(nom, prenom, age, service);
		this.matierePrincipale = matierePrincipale;
		this.matiereSecondaire=matiereSecondaire;
	}

	public String getMatierePrincipale(){
		return matierePrincipale;
	}

	public String getMatiereSecondaire(){
		return matiereSecondaire;
	}

	public void setMatierePrincipale(){
		this.matierePrincipale = matierePrincipale;
	}

	public void setMatiereSecondaire(){
		this.matiereSecondaire = matiereSecondaire;
	}
}