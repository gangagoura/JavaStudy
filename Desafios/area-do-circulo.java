import java.io.IOException;
import java.util.Scanner;

public class Dio {
	
	public static void main(String[] args) throws IOException {
		Scanner leitor = new Scanner(System.in);
		double raio = leitor.nextDouble();
		double area = 3.14159 * (raio * raio);
		System.out.println(String.format("A=%.4f", area)); 
	}
	
}
