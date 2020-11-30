package exemple;
import java.util.Scanner;





/*
 * algorithme Fonction1
 * variable
 * 	nom,prenom: chaine de caractere
 * 	age: entier
 * 
 * 
 * Procedure affichage (nom : chaine de caractere, prenom : chaine de caractere, age: entier)
 * Debut
 * 		ecrire("Bonjour " + nom + " " + prenom + ", tu as " + age + " ans.")
 * fin 
 * 
 * 
 * debut
 * 		ecrire("Quel est votre nom ?")
 * 		lire nom
 * 		ecrire("Quel est votre prenom ?")
 * 		lire prenom
 * 		ecrire("Quel est votre age ?")
 * 		lire age
 * 		affichage(nom, prenom, age)
 * fin
 */





















public class Fonction1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// declaration des variables
		String nom, prenom;
		int age;
		// affichier les message et lire les valeurs
		System.out.println("Quel est votre nom ?");
		nom = in.next();
		System.out.println("Quel est votre prénom ?");
		prenom = in.next();
		System.out.println("Quel est votre age ?");
		age = in.nextInt();
		// appeler le methode
		affichage(nom, prenom, age);
	}
	
	//creation de la fonction
	static void affichage(String nom, String prenom, int age) {
		System.out.print("Bonjour " + nom + " " + prenom + ", tu as " + age + " ans.");
	}
}
