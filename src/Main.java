import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int v[] = new int[8];
		int i;
		String nome[] = new String[8];
		float n1[] = new float[8];
		float n2[]= new float[8];
		float n3[]= new float[8];
		float media[] = new float[8];
		
		for(i=0;i<v.length;i++) {
			v[i] = i;
			System.out.println("Digite o nome: ");
			nome[i] = new Scanner(System.in).nextLine();
			System.out.println("Digite as três notas do aluno: ");
			n1[i] = new Scanner(System.in).nextFloat();
			n2[i] = new Scanner(System.in).nextFloat();
			n3[i] = new Scanner(System.in).nextFloat();
			
			media[i] = ((n1[i] + n2[i] + n3[i])/3); 
		}
		
		
		
		for(i=0;i<v.length;i++) {
			System.out.println("Nome: " + nome[i]);
			System.out.println("Nota 1: " + n1[i]);
			System.out.println("Nota 2: " + n2[i]);
			System.out.println("Nota 3: " + n3[i]);
			System.out.println("Média: " + media[i]);
		}
		
	}//fecha metodo
}//fecha classe
