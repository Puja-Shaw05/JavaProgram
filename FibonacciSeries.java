// WAP to print fibonacci series from 1 to N 

import java.util.Scanner;

class FbonacciSeries {
  public static void printFibbonacci(int n) {
    int num1 = 0;
    int num2 = 1;

    System.out.print(num1 + " " + num2);
     for(int i=3; i<=n; i++){
       int num3 = num1 + num2;
       System.out.print(" " + num3);
       num1 = num2;
       num2 = num3;
     }
  }
  
  public static void main(String [] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    printFibbonacci(n);
  }
}
    
