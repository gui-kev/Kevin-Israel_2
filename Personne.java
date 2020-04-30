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

	public String getNom(){
		return nom;
	}

	public String getPrenom(){
		return prenom;
	}

	public int getAge(){
		return age;
	}

	public void setNom(String nom){
		this.nom = nom;
	}

	public void setPrenom(String prenom){
		this.prenom = prenom;
	}	

	public void setAge(int age){
		this.age = age;
	}
}