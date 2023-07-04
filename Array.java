import java.util.*;
public class Array{

   public static void update(int marks[]){
    for(int i=0;i<marks.length;i++){
        marks[i]=marks[i]+5;
    }
   }
   public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int Result[]=new int[3];
    System.out.println("Enter Physics marks: ");
    Result[0]=sc.nextInt();
    System.out.println("Enter Maths marks: ");
    Result[1]=sc.nextInt();
    System.out.println("Enter Chemistry marks: ");
    Result[2]=sc.nextInt();
    update(Result);
    for(int i=0;i<Result.length;i++){
        if(i==0){
            System.out.println("Updated marks of Physics: "+ Result[i]);
        }else if(i==1){
            System.out.println("Updated marks of maths: "+ Result[i]);
        }else{
            System.out.println("Updated marks of Chemistry: "+ Result[i]);
        }
        
    }
    
   }
}
