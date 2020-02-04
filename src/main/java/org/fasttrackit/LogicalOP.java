package org.fasttrackit;

public class LogicalOP {

    public void printNto100(int n){
        for(int i=n; i<=100; i++){
            System.out.println(i);
        }
    }

    public void printNtoNegative100(int n){
        for (int i = n; i>=-100; i--){
            System.out.println(i);
        }
    }

    public void printXToY(int x, int y){
        for (int i = x; i <= y; i++){
            System.out.println(i);
        }
    }

    public void printSmallToBig(int x, int y) {
        if (x < y) {
            printXToY(x, y);
        } else {
            for (int i = y; i <= x; i++) {
                System.out.println(i);
            }
        }
    }

    public void print1to100(){
        for(int i=1; i<=100; i++){
            System.out.println(i);
        }
    }

    public void printOddNumbersFrom1To100(){
        for(int i=1; i<=100; i++){
            if(i % 2 == 1)
            System.out.println(i);
        }
    }

    public void addNumbersFromNto100(int n){
        int sum = 0;
        for(int i=n; i<=100; i++){
            sum += i;
        }
        System.out.println("The total of the numbers is: " + sum);
    }

    public void averageOfNumbersFromNto100(int n){
        double sum = 0;
        double j = 0;
        for(int i=n; i<=100; i++){
            sum += i;
            j++;
        }
        System.out.println("The average of the numbers is: " + sum/j);
    }

    public void piramid(int n){
        char asterisc = '*';
        for(int i = n; i>=1; i--){
            System.out.println();
            for(int j = i; j>=1; j--){
                System.out.print(asterisc);
            }
        }
    }
}
