import java.util.*;
public class Triangle2 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        //System.out.println("Enter the height of Triangle:");
       // int r = sc.nextInt();
       int r = 4;
        for (int i = 1;i<=r;i++){
            for(int j = 1;j<=r-i+1;j++){
                System.out.print("*");
            }
            System.out.println("");

        }
        
    }
}