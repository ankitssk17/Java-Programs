import java.util.*;// library for using Scanner class
class varExercise{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);// Scanner class will be in capital letters not small
        System.out.println("Enter the Cost of Pen:");
        float N1= sc.nextFloat();
        System.out.println("Enter the cost of Book:");
        float N2= sc.nextFloat();
        System.out.println("Enter the cost of Eraser:");
        float N3= sc.nextFloat();
        float cost= (N1+N2+N3);
        /* wrote f with 0.18 as java treats every decimal no. as double type. 0.18f will make it float type.
        If we dont do this rhs will be double type whereas costGST is float type variable.
        Conversion from double to float wont happen in Java.
        */
        float costGST=((0.18f*cost)+ cost);
        System.out.println("Cost without GST is:" + cost);
        System.out.println("Cost with GST is:" + costGST);
    }
}