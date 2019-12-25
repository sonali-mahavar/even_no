
package even_no;

import java.util.Scanner;

public class Even_no {

    
    public static void main(String[] args) {
        int n=100;
        System.out.println("Printing even number between 1 and"+n);
        for(int i=1;i<=n;i++){
            if(i%2==0){
                System.out.print(i+" ");
            }
        }
    }
    
}
