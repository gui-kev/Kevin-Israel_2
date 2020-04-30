public class Administratif extends Personnel {
	private String fonction;

	public Administratif(String nom, String prenom, int age, String service, String fonction){
		super(nom, prenom, age, service);
		this.fonction = fonction;
	}

}