import java.util.Scanner;
public class Matrizes {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		int matriz[][] = new int[5][2];
		
		//Atribuir manualmente
		matriz[0][1] = 99;
		
		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.println("Insira um valor para a linha " + linha + " e coluna " + coluna);
				matriz[linha][coluna] = leitor.nextInt();
			}
		}

		for(int linha=0;linha<5;linha++) {
			for(int coluna=0;coluna<2;coluna++) {
				System.out.println("O valor da linha " + linha + " e coluna " + coluna + " é " + matriz[linha][coluna]);
	}

}

	}
	
}
