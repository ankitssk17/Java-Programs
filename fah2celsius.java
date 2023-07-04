public class fah2celsius {
    public static void fah2cel(int S, int E, int W){
        int celsiusValue=0;
        for(int i=S;i<=E;i+=W){
            celsiusValue = (5*(i-32))/9;
            System.out.println(i + "\t" + celsiusValue);
        }
        
    }
   public static void main(String args[]){
    fah2cel(0,60,20);
   }
}