import java.util.*;

public class Methods{ // Method for calculating modulus
      public static int mod(int a , int b){
        int mod= a%b;
        return mod;
    } 
    public static int Sum(int N){ // Method for calculating sum of n natural numbers
         int sum=0;
    for(int i=1;i<=N;i++){
        sum=sum+i;
    }
    return sum;
    }
    public static int Product(int N){
        int prod=1;
        for(int i=1;i<=N;i++){
            prod=prod*i;
        }
        return prod;

    }
    
        
    
    public static void main(String args[]){
        
        /*System.out.println("Enter the number Num1 & Num2 whose mod value has to be taken:");
        int Num1=sc.nextInt();*/
        Scanner sc = new Scanner(System.in);
        int Num2=sc.nextInt();
        int Ans=mod(55,Num2);
        System.out.println("Modlus is:"+ Ans);
       int ans= Sum(Num2);
       System.out.println("Sum of n natural number is:"+ ans);
       int Prod=Product(Num2);
       System.out.println ("product of n natural numbrs"+ Prod);
       
    //System.out.println("Sum is:"+sum);
        
        }
    }