import java.util.Scanner;
public class EntendendoVetores {

	public static void main(String[] args) {
		
		
		Scanner leitor = new Scanner(System.in);
		//Cria��o de um vetor
		int vetor[] = new int[20];
		/*
		vetor[0] = 50;
		vetor[1] = 30;
		vetor[2] = 70;
		vetor[3] = 90;
		vetor[4] = 70;
        */	
		for(int i=0;i<20;i++) {
		    System.out.println("Infomre um novo valor");	
		    vetor[i] = leitor.nextInt();	
		}
		
		for(int i=0; i<20; i++) {
			System.out.println(vetor[i]);
		}
		
		leitor.close();

	}

}
