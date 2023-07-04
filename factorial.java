import java.util.*;
public class factorial {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number:");
       int n = sc.nextInt();
       int Fac=1;
       for(int i=n;i>=1;i--){
        
         Fac *= i; // Fac=Fac*i;

       }
       System.out.println("Factorial of given number is:"+Fac);
       

    }
}
