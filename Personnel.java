public class Personnel extends Personne {
	protected String service;
	protected String nom;

	public Personnel(){
		super();
		service = "Inconnu";
		nom = "Anonyme";
	}	

	public Personnel(String nom, String prenom, int age, String service){
		super(nom, prenom, age);
		this.nom = nom;
		this.service = service; 
	}

	public void afficherAge() {
		System.out.println ( " Ce personnel a " + age + " an ( s ) " ) ;
	}
	
}