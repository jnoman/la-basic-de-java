package exemple;


/*
 * algorithme boucle2
 * variable
 * 	i: entier
 * debut
 * 		pour i <-- 1 jusqu'a 10 pas 1
 * 			ecrire(i) 
 * 			si i< 10 alors
 * 				ecrire(", " + (101 - i) + ", ")
 * 			fin si
 * 		fin pour
 * fin
 */











public class Boucle2 {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			System.out.print(i);
			if(i<10) {
				System.out.print(", " + (101 - i) + ", ");
			}
		}
	}

}
