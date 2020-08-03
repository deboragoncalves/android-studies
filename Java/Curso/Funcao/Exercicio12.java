import java.util.Random;

public class Exercicio12 {

	public static void main(String[] args) {
		// 12
		
		Random aleatorio = new Random();

		somaAlgarismos(aleatorio.nextInt(200) + 1);

	}
	
	public static void somaAlgarismos(int numero) {
		if (numero > 0) {
			
			char digitos[] = String.valueOf(numero).toCharArray();
			
			for (char a : digitos) {
				System.out.print(a + " ");
			}
		} else {
			System.out.println("O n�mero � inv�lido");
		}
		
	}

}