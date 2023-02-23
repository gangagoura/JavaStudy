import java.util.Scanner;
public class AngryProfessor {
    public static void main(String[] args) {
        int numberOfTests = 0;
        Scanner sc =  new Scanner(System.in);
        numberOfTests = sc.nextInt();
        
        for (int i = 0;i < numberOfTests;i++) {
            int N = sc.nextInt();
            int K = sc.nextInt();
            int arrived = 0;
            for (int j = 0;j < N;j++) {
                int currentStudent = sc.nextInt();
                if (currentStudent <= 0) {
                    arrived++;
                }
            }
            if (arrived>=K) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        }
        
        sc.close();
    }
}
