package org.fasttrackit;
public class CozaLozaWoza {

    public static void main(String[] args) {
        int start = 100;
        int finish = 300;

        for (int i = start; i <= finish; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza");
            }
            else if ( i % 3 == 0){
                System.out.print("Coza");
            }
            else if (i % 5 == 0) {
                System.out.print(("Loza"));
            }
            else if (i % 7 == 0) {
                System.out.print("Woza");
            }
            else {
                System.out.print(i);
            }

            if (i % 11 == 0){
                System.out.println(" ");
            } else {
            System.out.print(" ");
            }
        }
    }
}
