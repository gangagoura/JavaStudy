import java.util.*;
class Solution
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int t,ans,d;
        long n,m;
        t=in.nextInt();
        while(t-->0)
        {
            ans=0;
            n=in.nextLong();
            m=n;
            while(m!=0)
            {
                d=(int)m%10;
                m=m/10;
                if(d==0)
                continue;
                if(n%d==0)
                ans++;
            }
            System.out.println(ans);
        }
    }
}
