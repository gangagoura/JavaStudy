import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] a = new int[n];
        HashSet<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            set.add(a[i]);
        }
        
        int ans = 0;
        
        for (int i = 0; i < n; i++) {
            if (set.contains(a[i]+d)&&set.contains(a[i]+2*d))
                ans++;
        }
        
        System.out.println(ans);
    }
}
