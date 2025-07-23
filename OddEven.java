// Java Program to find Odd Or even number
import java.util.Scanner;

class OddEven {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    
     if(num % 2 == 0){
       System.out.println(num + " is a Even Number");
     }else{
      System.out.println(num + " is a Odd Number");
     }
  }
}
  
