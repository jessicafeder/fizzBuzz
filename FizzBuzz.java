package com.company;

public class FizzBuzz {
    public static void main(String[] args) {
        for (int x = 1; x <= 100; x++) { /* LOOP -- skapar int variabel = 0, om i är <100 så kör den koden 100x*/

            if(x == 42){
                System.out.println("Answer to the Ultimate Question of Life, the Universe and Everything");
            }
            if ((x % 3 ==0) && (x % 5 == 0)){
                System.out.println("FizzBuzz");


            } else if (x % 5 == 0){
                System.out.println("Buzz");
            } else if (x % 3 ==0) {
                System.out.println("Fizz");

            }else {
                System.out.println(x);
            }

        }
    }
}