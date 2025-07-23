// WAP to find sum of digit

import java.util.Scanner;
public class SumOfDigit {
  public static int sumOfDigit(int num){
    int sum = 0;
    while( num > 0){
      sum = sum + ( num % 10);
      num = num / 10;
    }
    return sum;
  }
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter digit here..");
    int digit = sc.nextInt();

    System.out.println(sumOfDigit(digit));
  }
}
   
