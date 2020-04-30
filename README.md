#	Kevin-Israel_2
##	TP2 Java

### Exercice 1 : Droits d'accès
	1- Dans la classe Personnel, l'attribut nom doit être explicitement défini, car il est défini en private dans la classe Personne.
	2-  Création des classes Personne et Personnel
	3- Le mot clé super permet à une classe fille de faire appel aux méthodes de la classe base et faire appel aux variables de la classe base dans le constructeur de la classe fille.
	4- Méthode afficherAge() : permet d'afficher l'age du personnel car la variable age est définie en protected dans la classe Personne.
	5- Droits d'accès:
		* Private : utilisé lorsqu'une variable ou une méthode ne doit être accessible qu'à l'intérieur de la classe
		* Protected : utilisé lorsqu'une variable ou une méthode de la classe de base doit être utilisée par les classes filles.
		* Public : utilisé lorsqu'une variable ou méthode doit être accessible partout dans le programme.
	6- Oui, une classe fille peut être une classe de base. Par exemple, dans la figue 1, on a la classe Enseignant qui est une classe héritée de la classe Personnel. Dans ce cas la classe fille Personnel devient une classe de base pour la classe Enseignant.
	7- Création des classes Etudiant, Administratif et Enseignant.