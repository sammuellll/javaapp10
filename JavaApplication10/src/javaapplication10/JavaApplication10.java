/*
girilen sayilarin en buyugunu bulma 
 */
package javaapplication10;

import java.util.Scanner;

/**
 *
 * @author IBRAHIM SAYHAN
 */
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x1, x2, x3;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Karsilastiracaginiz 3 sayiyi giriniz : ");
            x1 = scanner.nextInt();
            x2 = scanner.nextInt();
            x3 = scanner.nextInt();
        if ((x1<=x2) && (x2<=x3) ){
            System.out.println("En buyuk sayi " + x3);
        } else if ((x1<=x2) && (x3<=x2) ){
            System.out.println("En buyuk sayi " + x2);
        } else{
            System.out.println("En buyuk sayi " + x1);
        }
        
    }
    
}
