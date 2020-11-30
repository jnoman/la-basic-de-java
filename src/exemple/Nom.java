package exemple;
import java.util.Scanner;




/*
 * algorithme affichierNom
 * variable
 * 	nom: chaine de caractere
 * debut
 * 		ecrire("Quel est votre prénom ?")
 * 		lire nom
 * 		ecrire("Bonjour, " + nom)
 * fin
 */








public class Nom {

	public static void main(String[] args) {
		// declaration des variables
		String nom;
		System.out.println("Quel est votre prénom ?");
		//lire la valuer de nom
		Scanner in = new Scanner(System.in);
		nom = in.next();
		// affichier le message
		System.out.println("Bonjour, "+nom);
	}

}
