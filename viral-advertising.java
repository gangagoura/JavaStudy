import java.io.*;
import java.util.*;
public class Solution {
    public static final int INITIAL_AMOUNT_OF_PEOPLE = 5;
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int currentAmount = INITIAL_AMOUNT_OF_PEOPLE;
            int totalNumber = 0;
            for (int i = 0; i < n; i++) {
                currentAmount = currentAmount/2;
                totalNumber += currentAmount;
                currentAmount *= 3;
            }
            System.out.println(totalNumber);
        }
    }
}
