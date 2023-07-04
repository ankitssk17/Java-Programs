import java.util.*;
public class reverseOfNum{
    public static void main(String args[]){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);

       /* for(int i=1719;i>0;i/=10){
            System.out.print(i%10);
        }*/
       
       
        int Num = sc.nextInt();
        for(;Num>0;Num=Num/10){
            System.out.print(Num%10);
        }


        /*while(Num>0){
            System.out.print(Num%10);
            Num = Num/10;
        }*/
    }
}