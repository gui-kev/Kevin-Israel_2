public class Personne{
	private String nom;
	public String prenom;
	protected int age;

	public Personne(){
		nom = "Anonyme";
		prenom = "Anonyme";
		age = -1;
	}		

	public Personne(String nom, String prenom, int age){
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
}