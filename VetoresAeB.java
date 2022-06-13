package exercicios;
import java.util.Scanner;
public class VetoresAeB {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		int c = 0;
		int vetorA[] = new int[5];
		int vetorB[] = new int[5];
		

		for (int x = 0; x < 5; x++) { // Laço para se repetir 5 vezes
			
			System.out.printf("Valores dentro do Vetor A: "); // usuario insere valores do vetor A
			
			vetorA[x] = entrada.nextInt();
			
			System.out.printf("Valores dentro do Vetor B: "); // usuario insere valores do vetor B
			
			vetorB[x] = entrada.nextInt();
			
			entrada.close();
			
			
			
		}
		for(int x = 1; x < 5; x++){ //
			c = c + (vetorA[x] * vetorB[x]); // variavel C recebe valor do vetor A e multiplica pelo vetor B
		}
		
		System.out.println("Valor total da variavel C: " + c); // Mostra o valor total da variavel C
		
	}

}
