
import java.util.Scanner;
public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int c;
Scanner in=new Scanner(System.in);
System.out.println("Enter the number to be tested fro prime");
int n=in.nextInt();
for(c = 2; c <= n-1;c++) {
	if ( n%c==0) {
		System.out.println(n+">>>>>not prime");break;
	}
}
if(c==n)
System.out.println(n+">>>>Number is prime.");	

}
}