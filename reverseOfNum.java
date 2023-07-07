import java.util.*;
public class reverseOfNum{

     public static int reverse(int x) {
        long sum=0;
        int k=x;
        if(x<0)
        k=(-1)*k;
        while(k>0){
        sum=sum*10+x%10;
        x=x/10;
        k=k/10;
        }
        if(sum<Math.pow(-2,31) || sum>Math.pow(2,31) )
            return 0;
        else 
            return (int)sum;
    }
     public static int reverse2(int Num){
        int result = 0;
        for(;Num>0;Num=Num/10){
             result = Num%10;
        }
        return result;
     }
    public static void main(String args[]){
        System.out.println("Enter the Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(reverse(num));

    



       /* for(int i=1719;i>0;i/=10){
            System.out.print(i%10);
        }*/
       
       
        // int Num = sc.nextInt();
        // for(;Num>0;Num=Num/10){
        //     System.out.print(Num%10);
        // }


        /*while(Num>0){
            System.out.print(Num%10);
            Num = Num/10;
        }*/
    }
}