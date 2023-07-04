import java.util.*;
public class Triangle3 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the height of Triangle:");
        int r = sc.nextInt();
       for(int i=1;i<=r;i++){ //Outer loop decide rows/height
        for(int j=1;j<i;j++){ //For adding whitespaces. This is used bfore the star loop coz white * to be printed after whitespaces.
            System.out.print(" ");
        }
        for(int j=1;j<=r-i+1;j++){ // For printing * after the whitespaces.
            System.out.print("*");
         
        
       }
       System.out.println("");
         }
       
        
    }
}