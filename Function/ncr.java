import java.util.*;
public class ncr {
    public static int factorial(int n){
        int fact=1;
         for(int i=n;i>=1;i--){
            fact=fact*i;
         }
         return fact;

    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter N:");
        int N=sc.nextInt();
        int factN=factorial(N);
        System.out.println("Enter R:");
        int R=sc.nextInt();
        int factR=factorial(R);
        int factNR=factorial(N-R);
        int Result = factN / (factR * factNR);
        System.out.println("Combination of the given numbers is:"+ Result);
    }

}