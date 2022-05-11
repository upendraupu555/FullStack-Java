//Sum of Pairs HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SumofPairs {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int j=0;j<t;j++){
            int n=sc.nextInt();
            int k=sc.nextInt();
            ArrayList<Integer> a = new ArrayList();
            for(int i=0;i<n;i++)
                a.add(sc.nextInt());
            HashMap<Integer,Integer> hm = new HashMap();
            for(int i=0;i<n;i++)
                hm.put(a.get(i),i);
            int flag=0;
            for(int i=0;i<n;i++){
                if(hm.containsKey(k-a.get(i))){
                    flag=1;break;
                }
            }
            if(flag==1) System.out.println("True");
            else System.out.println("False");
        }
    }
}