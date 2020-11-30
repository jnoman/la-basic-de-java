package exemple;


/*
 * algorithme boucle1
 * variable
 * 	i: entier
 * debut
 * 		pour i <-- 1 jusqu'a 10 pas 1
 * 			ecrire(i) 
 * 			si i< 10 alors
 * 				ecrire(", ")
 * 			fin si
 * 		fin pour
 * fin
 */









public class Boucle1 {

	public static void main(String[] args) {
		//créer une boucle
		for(int i=1;i<=10;i++) {
			//affichier les nomber
			System.out.print(i);
			//affichier les vergules exception la dernier vergule
			if(i<10) {
				System.out.print(", ");
			}
		}
	}

}
