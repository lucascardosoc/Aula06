import java.util.Scanner;

public class FixandoVetores {

	public static void main(String[] args) {
		double numeros[] = new double[5];
		double total=0;
		
		Scanner leitor = new Scanner(System.in);
		
		for(int i=0;i<numeros.length;i++) {
			System.out.println("Informe a nota do " + (i+1) + " aluno");
			numeros[i]=leitor.nextDouble();
			
		}
		
		for(int i=0;i<numeros.length;i++) {
			
		System.out.println("A nota do " + (i+1) + " aluno é: " + numeros[i]);
		
		total = total + numeros[i];
		}
		
		System.out.println("O número total de notas é: " + total);
		leitor.close();

	}

}
