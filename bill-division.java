import java.io.*;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int sum = 0;
        for(int i = 0; i < n; i++){
            if(i != k){
                sum += in.nextInt();
            }else{
                in.nextInt();
            }
        }
        int res = in.nextInt();
        int t = res - sum / 2;
        System.out.println(t == 0 ? ("Bon Appetit") : t);
    }
}
