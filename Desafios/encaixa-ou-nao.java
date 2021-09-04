import java.io.IOException;
import java.util.Scanner;

public class Desafio {

	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		int N = leitor.nextInt();
		for (int i = 0; i < N; i++) {
			String A = leitor.next();
			String B = leitor.next();
			if (A.endsWith(B)) 
				System.out.println("encaixa");
			else 
				System.out.println("nao encaixa");
		}
	}

}
