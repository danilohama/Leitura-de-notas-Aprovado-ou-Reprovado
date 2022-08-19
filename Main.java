import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x ; 
		System.out.printf("Digite sua nota: ");
		x = sc.nextInt();
		String Aprovado, Reprovado;
	
		     switch (x) {
		     case 1:
		     case 2:
		     case 3:
		     case 4:
		     case 5:
		Reprovado = "Reprovado";
		
		System.out.println("Status: " + Reprovado);
		     break;
			  
		     case 6:
		     case 7:
		     case 8:
		     case 9:
		     case 10:
		    	Aprovado = "Aprovado";
		    	 
		System.out.printf("Status: "+ Aprovado);
		break;
			 
		  }

			sc.close();
		}

	}


