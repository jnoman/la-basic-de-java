package exemple;
import java.util.Scanner;



/*
* algorithme calculerTTC
 * variable
 * 	ht: réel
 * debut
 * 		ecrire("Entrer les prix HT")
 * 		lire ht
 * 		ecrire("le prix TTC est : " + ht*1.2)
 * fin
 */











public class TTC {

	public static void main(String[] args) {
		float ht;
		System.out.println("Entrez le prix HT");
		//lire la valuer de HT
		Scanner in = new Scanner(System.in);
		ht = in.nextFloat();
		// affichier le message de prix TTC(HT*20%)
		System.out.println("le prix TTC est : "+ht*1.2);

	}

}
