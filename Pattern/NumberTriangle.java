/*   1
    2 2
   3 3 3
  4 4 4 4
*/

class NumberTriangle {
   public static void main(String [] args) {
      int n = 4;
     for(int i=1; i<=n; i++) {
       //this loop for space printing
       for(int j=1; j<=n-i; j++){
         System.out.print(" ");
       }
      //inner loop for number printing
      for(int k=1; k<=i; k++) {
        System.out.print(i + " ");
      }
       System.out.println();
     }
   }
}
