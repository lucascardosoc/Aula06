import java.util.Scanner;

public class TesteVetores {

	public static void main(String[] args) {
		double aluno[] = new double [5];
		double total=0, media=0;
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<aluno.length;i++) {
			
			System.out.println("Digite a nota do " + (i+1) + " º aluno");
			aluno[i]=leitor.nextDouble();
		}
		
		for(int i=0;i<aluno.length;i++) {
			
			System.out.println("A nota do " + (i+1) + " º aluno é: " + aluno[i]);
			total = total + aluno[i];
			media = total / 5;
		}
		
		System.out.println("A média da sala é: " + media);
		leitor.close();

	}

}
