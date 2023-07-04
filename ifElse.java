import java.util.*;
class ifElse{
    public static void main(String args[]){
        System.out.println("Enter the number N:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println("Entered No. is: " + num);
        
        if(num%2 != 0){
            System.out.println("Weird"); 
        }
        
        else if ( (num >= 2) && (num <= 5)){
            System.out.println("not weird");
        }
        
        else if ( (num>=6) && (num <=20)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
    }
}