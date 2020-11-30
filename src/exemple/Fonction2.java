package exemple;
import java.util.Scanner;






/*
 * algorithme Fonction2
 * variable
 * 	genre: caractere
 * 	age: entier
 * 
 * 
 * Procedure affichage (genre : caractere, age: entier)
 * Debut
 * 		chaine <-- "Vous êtes ":chaine de caractere
 * 		si genre='h' alors
 * 			chaine <-- chaine + "un homme"
 * 		sinon
 * 			chaine <-- chaine + "une femme"
 * 		fin si
 * 		chaine <-- chaine + " et vous êtes "
 * 		si age<18 alors
 * 			chaine <-- chaine + "mineur"
 * 		sinon
 * 			chaine <-- chaine + "majeur"
 * 		fin si
 * 		ecrire(chaine)
 * fin 
 * 
 * 
 * debut
 * 		ecrire("Quel est votre genre ?(h/f)")
 * 		lire genre
 * 		si genre='h' ou genre='f' alors
 * 			ecrire("Quel est votre age ?")
 * 			lire age
 * 			affichage(genre, age)
 * 		sinon
 * 			ecrire("le genre ne pas valid")
 * 		fin si
 * fin
 */







public class Fonction2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// declaration des variables
		char genre;
		int age;
		// affichier les message et lire les valeurs
		System.out.println("Quel est votre genre ?(h/f)");
		genre = in.next().charAt(0);
		if(genre == 'h' || genre == 'f') {
			System.out.println("Quel est votre age ?");
			age = in.nextInt();
			affichage(genre, age);
		}
		else {
			System.out.println("le genre ne pas valid");
		}

	}
	//creation de la fonction
	static void affichage(char genre, int age) {
		String chaine = "Vous êtes ";
		if(genre == 'h') {
			chaine += "un homme";
		}
		else {
			chaine += "une femme";
		}
		chaine += " et vous êtes ";
		if(age < 18) {
			chaine += "mineur";
		}
		else
		{
			chaine += "majeur";
		}
		System.out.print(chaine);
	}
}
