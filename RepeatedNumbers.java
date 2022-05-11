//RepeatedNumbers HackerRank
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RepeatedNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=0;k<t;k++){
            int n=sc.nextInt();
            int[] a=new int[n];
            for(int i=0;i<n;i++)
                a[i]=sc.nextInt();
            int[] b=new int[n];
            HashMap<Integer,Integer> hm = new HashMap<>();
            Arrays.sort(a);
            for(int i=0;i<a.length;i++){
                if(hm.containsKey(a[i]))
                    b[i]=a[i];
                else
                    hm.put(a[i],i);
            }
            for(int i=0;i<b.length;i++){
                if(b[i]!=0) System.out.print(b[i]+" ");   
            }
            System.out.println();
        }
    }
}