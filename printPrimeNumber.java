//write a program to check the number which is prime number or not.
import java.util.Scanner;
public class printPrimeNumber{
    public static boolean checkPrimeNumber(int num){
       int count = 0;
       for(int i=1; i<=num; i++){
          if(num % i == 0){
             count++;
          }
      }
      if(count == 2)
         return true;
      else
         return false;

    }
    
  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the number here to check number is a prime or not");
       int num =  sc.nextInt();
       System.out.println(checkPrimeNumber(num));
  } 
}
