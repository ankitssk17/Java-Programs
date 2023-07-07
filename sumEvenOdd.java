import java.util.*;
public class sumEvenOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); // Take the input from the user
        int sum_even =0; // this variables will store the sum intialised at zero
        int sum_odd =0;
        for(; num>0; num/=10){// division by 10 will give the number except its last digit
            int mod = num%10; // modulo of 10 will give last digit of the number 
            if(mod % 2 == 0){
               sum_even=sum_even+ mod;
                
            }else{
                sum_odd=sum_odd+ mod;           
            }         
        }
         System.out.println(sum_even);
                 System.out.println( sum_odd);

    }
}
