import java.util.Scanner;
public class solidRect {
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    int r = sc.nextInt();// r variable is used for rows
    System.out.println("Enter the number of column:");
    int c = sc.nextInt(); // c variable is used for storing value of columns
    for(int i=1;i<=r;i++){           // The outer for loop will decide the number of rows.
      for(int j=1;j<=c;j++){         // The inner for loop will print the * in horizontal columns.
         System.out.print("*");
      }
      System.out.println(); // This will move the cursor to a new line after each iterration
                            // of i when the inner for loop executes.
    }


    


   } 
}
