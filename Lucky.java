//Lucky? codechef

import java.util.*;
 
public class Lucky
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int k=0;k<t;k++){
		    String s=sc.next();
		    String s1=s.substring(0,3);
		    String s2=s.substring(3,s.length());
		    int i=0,j=0,a1=0,a2=0;
		    while(i<s1.length()){
		        a1+=Character.getNumericValue(s1.charAt(i));
		        i++;
		    }
		    while(j<s2.length()){
		        a2+=Character.getNumericValue(s2.charAt(j));
		        j++;
		    }
		    if(a1==a2)  System.out.println("YES");
		    else    System.out.println("NO");
		}
	}
}