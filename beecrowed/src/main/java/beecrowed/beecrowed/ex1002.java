package beecrowed.beecrowed;

import java.util.Scanner;

public class ex1002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double n = 3.14159;
        double raio = input.nextDouble();
        
        double res = (double) (n * Math.pow(raio, 2));
        
        System.out.printf("A=%.4f",res);
        System.out.print("\n");
        input.close();
    }
}
