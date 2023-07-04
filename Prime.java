import java.util.*;
public class Prime {
    public static boolean isPrime(int n){
        boolean isPrime = true;
         if(n==2){
            isPrime=true;
        }
        for(int i =2;i<=n-1;i++){
            if(n % i == 0){
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
    public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Number:");
      int n =sc.nextInt();
        boolean P= isPrime(n);
        if(P== true){
            System.out.println("The given number "+ n + " is a prime number");
        }
            else{
                System.out.println("The given number "+ n + " is a composite number");
            }
          System.out.println("Prime numbers between 1 to "+ n + " are:");
        for(int i =1;i<=n;i++){
            if(isPrime(i)== true){
                System.out.print(i + " ");
            } 
        }

        }
    }