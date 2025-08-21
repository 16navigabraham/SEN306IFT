import java.util.Scanner;

public class multiply {
    
    public static void main(String[] args) {
        
        // TODO Auto-generated method stub
        int a, b, c, result;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter your first number");
        a = in.nextInt();
        
        System.out.println("Enter your second number");
        b = in.nextInt();
        
        System.out.println("Enter your third number");
        c = in.nextInt();
        
        result = a * b * c;
        
        System.out.println("The result of " + a + " × " + b + " × " + c + " = " + result);
        
        in.close();
    }
}