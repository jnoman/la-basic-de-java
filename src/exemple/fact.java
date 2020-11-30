package exemple;
import java.util.Scanner;
public class fact {

	public static void main(String[] args) {
		int num,result,i;
		Scanner in = new Scanner(System.in);
		System.out.println("entrer un nombre");
		num = in.nextInt();
		if(num==1 || num==0) {
			System.out.println("la resulta est : 1");
		}
		else if(num>0) {
			result=1;
			for(i=2;i<=num;i++) {
				result=result*i;
			}
			System.out.println("la resulta est : "+result);
		}
		else {
			System.out.println("le nombre doit être supérieur à 0");
		}
	}

}
