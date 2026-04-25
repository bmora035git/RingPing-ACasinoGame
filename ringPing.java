/**
 * Name: [Benjamin O. Morales]
 * Date: [4/16/2026]
 * Semester Project: [Casino Slot Machine Simulation]
 * Course: [CSCI 1436]
 * TAMUSA Spring 2026
 * 
 * For the semester project, I plan to write a simple text-based casino game, 
 * working with 3 virtual reels, with three virtual outcomes:  Cherries, Bells, and 7's.  
 * The player will start with 9 spins, and the game will end when the spins are exhausted. 
 * The player can win more spins by drawing a cherry, and can win tokens by drawing 3 of a 
 * kind.  The player can win a mini jackpot by drawing 3 bells, and can win the major jackpot 
 * by drawing 3 sevens.
 * I plan on weighting the Different symbols, to make the probabilities of 
 * cherries greater than bells, and the probability of bells greater than sevens.  
 * I plan to make 3 virtual reels, which are displayed in a text dialogue of a win line.  
 * If the three virtual reels are the same, then a weighted token is won.  If there are 2 of a 
 * kind, then no token is won, and if a cherry is in the virtual reel, you get a bonus spin.
 *
 * The weight would work as such.  A random number between 1-100 will be drawn.
 * If the number is between 1 and 50, the symbol chosen is a cherry.  If the number is 
 * between 51 and 85, the symbol Bell is chosen.  If the number is between 86 and 100, 
 * the symbol Seven is chosen.
 * I plan to use random number generators and conditional statements to match the symbols 
 * virtually and create the game from simple code.  I also plan to start the game with 9 
 * total spins. If these games are exhausted, then the game terminates. If a cherry is 
 * drawn, then a spin is added. If there are 3 bells, then the mini jackpot is won.  
 * If there are 3 sevens, then the major jackpot is won.
 * 
 *
 * 
 */

import java.util.Random;
import java.util.Scanner;

public class ringPing {
    public static void main(String args[ ]) {

        // Declare Variables For the Casino Slot Simulation
        // Start with The Variables for the Reels

        // Scanner for user input
        Scanner scanner = new Scanner(System.in);

        String cherryWheel;
        String bellWheel;
        String sevenWheel;

        int spins = 9;
        int weightedTokenThreeCherries = 3;
        int weightedTokenThreeBells = 5;
        int weightedTokenThreeSevens = 7;

        int spin;
        int tokensWon = 0;

        String[] symbols = {"symbol_1", "symbol_2", "symbol_3"};


        do  {
            System.out.println("Spins Remaining: " + spins);
            
            
            spin = scanner.nextInt();

            System.out.println("Spinning the reels...");
            
            
            
            symbols[0] = reel_1();
            symbols[1] = reel_2();
            symbols[2] = reel_3();

            System.out.println("Reel 1: " + symbols[0]);
            System.out.println("Reel 2: " + symbols[1]);
            System.out.println("Reel 3: " + symbols[2]);

            // If all three symbols are the same, then a weighted token is won.  If there are 2 of a kind, then no token is won, 
            // and if a cherry is in the virtual reel, you get a bonus spin.

            // If symbols are three of a kind, then a weighted token is won.  If there are 2 of a kind, then no token is won, and if a cherry is in the virtual reel, you get a bonus spin.
            if(symbols[0].equals("Cherry") && symbols[1].equals("Cherry") && symbols[2].equals("Cherry")) {
                System.out.println("Congratulations! You won " + weightedTokenThreeCherries + " token(s) for 3 cherries!");
                tokensWon += weightedTokenThreeCherries;
            } else if (symbols[0].equals("Bell") && symbols[1].equals("Bell") && symbols[2].equals("Bell")) {
                System.out.println("Congratulations! You won " + weightedTokenThreeBells + " token(s) for 3 bells!");
                tokensWon += weightedTokenThreeBells;
            } else if (symbols[0].equals("Seven") && symbols[1].equals("Seven") && symbols[2].equals("Seven")) {
                System.out.println("Congratulations! You won " + weightedTokenThreeSevens + " token(s) for 3 sevens!");
                tokensWon += weightedTokenThreeSevens;
            } else if (symbols[0].equals("Cherry") || symbols[1].equals("Cherry") || symbols[2].equals("Cherry")) {
                spins++;
                System.out.println("You got a cherry! You win a bonus spin!");
            }
            

            spins--;
            System.out.println("Total Tokens Won This Game are! " + tokensWon);

            display();
        } while (spins > 0);
    }

    public static String reel_1() {
        int virtualSpin_1 = (int)(Math.random() * 100) + 1;
        String symbol_reel_1;

        if (virtualSpin_1 >= 1 && virtualSpin_1 <= 50) {
            symbol_reel_1 = "Cherry";
        } else if (virtualSpin_1 >= 51 && virtualSpin_1 <= 85) {
            symbol_reel_1 = "Bell";
        } else {
            symbol_reel_1 = "Seven";
        }

        return symbol_reel_1;
    }

    public static String reel_2() {
        int virtualSpin_2 = (int)(Math.random() * 100) + 1;
        String symbol_reel_2;

        if (virtualSpin_2 >= 1 && virtualSpin_2 <= 50) {
            symbol_reel_2 = "Cherry";
        } else if (virtualSpin_2 >= 51 && virtualSpin_2 <= 85) {
            symbol_reel_2 = "Bell";
        } else {
            symbol_reel_2 = "Seven";
        }

        return symbol_reel_2;
    }

    public static String reel_3() {
        int virtualSpin_3 = (int)(Math.random() * 100) + 1;
        String symbol_reel_3;

        if (virtualSpin_3 >= 1 && virtualSpin_3 <= 50) {
            symbol_reel_3 = "Cherry";
        } else if (virtualSpin_3 >= 51 && virtualSpin_3 <= 85) {
            symbol_reel_3 = "Bell";
        } else {
            symbol_reel_3 = "Seven";
        }

        return symbol_reel_3;
    }

    public static void display() {
        
    }
}