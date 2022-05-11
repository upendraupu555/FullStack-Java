//EatingCandies codechef
import java.util.*;
 
public class EatingCandies
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++){
		    int n=sc.nextInt();
		    int[] a=new int[n];
		    for(int j=0;j<n;j++)
		        a[j]=sc.nextInt();
		    int p1=0,p2=n-1,c=0,s1=0,s2=0,res=0;
            while(p1<=p2){
                c++;
                if(s1>s2){
                    s2+=a[p2];
                    if(s1==s2)  res=c;
                    p2--;
                }
                else{
                    s1+=a[p1];
                    if(s1==s2)  res=c;
                    p1++;
                }
            }
		    System.out.println(res);
		}
	}
}