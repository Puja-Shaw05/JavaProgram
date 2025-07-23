// WAP to find prime number

class PrimeNumber {

  static boolean isPrime(int num){
      int count = 0;
    for(int i=1; i<=num; i++){
      if(num % i == 0)
        count++;
    }

    if(count == 2)
      return true;
    else
      return false;

    } 

  // Main Method
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number ");
    int num = sc.nextInt();

    if(isPrime(num))
       System.out.println(num + " is a prime number");
    else
      System.out.println(num + " is a  not prime number");
  }
}
    
