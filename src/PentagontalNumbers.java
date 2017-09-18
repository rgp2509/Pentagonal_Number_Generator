/*(Math: pentagonal numbers) A pentagonal number is defined as n(3n–1)/2 for
        n = 1, 2, . . ., and so on. Therefore, the first few numbers are 1, 5, 12, 22, . . . .
        Write a method with the following header that returns a pentagonal number:
public static int getPentagonalNumber(int n)
        Write a test program that uses this method to display the first 100 pentagonal
        numbers with 10 numbers on each line.

@Author Ryan Pletzer
@Csc 201
@ All rights reserved
 */

public class PentagontalNumbers {
    public static void main(String[] args) {
        System.out.println("Welcome ot the Pentagonal Number Display tool; I will print the first 100 \n" +
                "pentagontal numbers with 10 numbers per line.");
        print();
    }

    // created a method to use a given input n, and return a number based off the formula given.
    public static int getPentagonalNumber(int n){
        return (n*((3*n)-1)/2);
    }
    // Created a print loop with a double loop. i holds the 10's place
    // j holds the 1's place. loop goes from 1-100.
    public static void print(){
        int incrementer = 0;
        for (int i = 0; i <= 9; i++ ){

            for (int j = 1; j<=10 ; j++){
                incrementer = i*10 + j ;
                System.out.print(getPentagonalNumber(incrementer)+" ");
            }
            System.out.println("");
        }
    }
}
