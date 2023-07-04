import java.util.*;
public class facto {
    public static int factorial(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
           fact = fact*i;
        }
        return fact;
    }
    public static void main(String args[]){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
       int  Result=factorial(n);
       System.out.println("Factorial is:"+ Result);
    }
    
}
