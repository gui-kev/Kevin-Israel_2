#	Kevin-Israel_2
##	TP2 Java

### Exercice 1 : Droits d'accès
	1- Dans la classe Personnel, l'attribut nom doit être explicitement défini, car il est défini en private dans la classe Personne.
	
	2-  Création des classes Personne et Personnel
	
	3- Le mot clé super permet à une classe fille de : 
		* faire appel aux méthodes de la classe mère
		* faire appel aux variables de la classe base dans le constructeur de la classe fille.
		Code test : https://drive.google.com/open?id=1ejZB4KXhHKwVbmiAhYQr0v2sT_CYcGrq
		resultat : https://drive.google.com/open?id=1BzFTA_E1rmeJh0wlS5i3Y0L4r63w_Bzu
	
	4- Méthode afficherAge() : permet d'afficher l'age du personnel car la variable age est définie en protected dans la classe Personne.
	Résultat : https://drive.google.com/open?id=15hmBYAgCSl9GVhjezph9F3KrrP0So7ze
	
	5- Droits d'accès:
		* Private : utilisé lorsqu'une variable ou une méthode ne doit être accessible qu'à l'intérieur de la classe
		* Protected : utilisé lorsqu'une variable ou une méthode de la classe de base doit être utilisée par les classes filles.
		* Public : utilisé lorsqu'une variable ou méthode doit être accessible partout dans le programme.

	6- Oui, une classe fille peut être une classe de base. Par exemple, dans la figue 1, on a la classe Enseignant qui est une classe héritée de la classe Personnel. Dans ce cas la classe fille Personnel devient une classe de base pour la classe Enseignant.
	
	7- Création des classes Etudiant, Administratif et Enseignant.

	8- Création des accesseurs et mutateurs pour chacune des classes. 
	Comme les accesseurs et mutateus de la classe mère sont définis en public, il n'est plus nécessaire de les reécrire dans les classes filles. 

### Exercice 2 : Construction d’objets et l’initialisation d’objets
	1- Création de la classe Execution

### Exercice 3 : Redéfinition de méthodes et polymorphisme
	1- Utilisation de la méthode ouMeTrouver()
		Code test : https://drive.google.com/open?id=1EhR3h_govXbJyy4i4KSRU_0qDToJc6Yo
		Résultat : https://drive.google.com/open?id=1BnmFVSP9kUDsk5QJvkZpbecHWhXJzzqw
	2- Redéfinir la méthode ouMeTrouver() afin que le texte affiché dépende du l’objet utilisé
		Code : https://drive.google.com/open?id=1zZOnfoQ9bFu7rFqSyOT4jaX82w8uYuyd
		Résultat : https://drive.google.com/open?id=1cV-DFhoCJZ_wfeM46lQ9SNZQdcXhaiWa
	4- Création d'un tableau unique dans lequel seront stockés tous les objets créés à l’exercice 2.
	5- Utilisation de la méthode ouMeTrouver() avec les éléments du tableau	
		Code : https://drive.google.com/open?id=19PbqQyjSCGtA1VqA2B_OJrhG35fTI1vF
		Résultat : https://drive.google.com/open?id=1yDNl8IQs2K8VPq8iAZwsgdq3sdXqVDXN
		On constate que le teste affiche est le même que celui de la question 3. 
	6- Afficher le contenu du tableau grâce à des méthodes toString à définir dans les différentes classes
		* Méthodes toString() : code --> https://drive.google.com/open?id=1Kik0EPieX0stNm57nH7Y0u9_xOrqoR9V
			Résultat : https://drive.google.com/file/d/1FcpiQF2dct4zyu_iadgSFtBKxxLImvkj/view?usp=sharing
	7- Affecter des noms, prénoms, ages, promotions aux étudiants “anonymes” précédemment créés et afficher les.
		Code : https://drive.google.com/open?id=11efLDcvqrVH-hZAPPsOddgt9Owqf7BEL
		Résultat : https://drive.google.com/open?id=1z60QQD4K92VVNp6XNUy-pZvq1XIEGGho
		Remarque : On se rend compte que les éléments du tableau correspondant aux étudiants anonymes ont aussi été modifié. On peut conclure  que les éléments affectés au tableau sont passés par référence.
