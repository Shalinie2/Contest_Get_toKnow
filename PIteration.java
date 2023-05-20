import java.util.Scanner;
public class PIteration {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);   
			int n=sc.nextInt();
               for(int i=0;i<n;i++) {
                    for(int j=1;j<n-i;j++) {
                        System.out.print(" ");  
                    }
                      int number = 1;
                      for(int k=0;k<=i;k++) { 
                           System.out.print(number +" ");
                            number = number*(i-k)/(k+1);
                     }
                     System.out.println();
              } 
       }
}

