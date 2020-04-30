public class Personnel extends Personne {
	private String service;

	public Personnel(){
		super();
		service = "inconnu"
	}	

	public Personnel(String nom, String prenom, int age, String service){
		super(nom, prenom, age);
		this.service = service; 
	}
}