package edu.lernia.labb5;

import java.util.Scanner;


public class PlayTheGameOfYatzi {

   static boolean turns(Die[] dice) {
      int iturn;
      iturn = 0;

      while (iturn < 3) {
         messageToUser("Starting turn " + (iturn + 1) + " of 3, rolling dice.");
         rollDices(dice);

         boolean fiveDicesOfSameValue = youGotYatzi(dice);

         if (fiveDicesOfSameValue) {
            messageToUser("You got YATZI! in " + dice[0].getValue() + "'s");
         } else {
            if (iturn != 2) {
               messageToUser("Want to throw again? (y for yes, anything else for no)");
               if (rollAgain()) {
                  ++iturn;
               } else {
                  return false;
               }
            } else {
               messageToUser("Game over! Want to play again?");
               if (playAgain()) {
                  iturn = 0;
               } else {
                  return false;
               }
            }
         }
      }
      return true;
   }


   protected static boolean youGotYatzi(Die[] dice) {
      boolean winGame = true;
      for ( int j = 1; j < 5; j++ ) {
         if (dice[j].getValue() != dice[j - 1].getValue()) {
            winGame = false;
            break;
         }
      }
      return winGame;
   }

   protected static void rollDices(Die[] dice) {
      for ( int i = 0; i < dice.length; i++ ) {
         dice[i].DieRoll();
         messageToUser(i + ": " + dice[i].getString());
      }
   }

   protected static void messageToUser(String x) {
      System.out.println(x);
   }

   protected static Die[] setUpDice() {
      Die[] dice;
      dice = new Die[5];
      for ( int d = 0; d < 5; d++ ) {
         dice[d] = new Die();
      }
      return dice;
   }

   protected static boolean rollAgain() {
      Scanner sc = new Scanner(System.in);
      return (sc.next().equals("y"));
   }

   protected static boolean playAgain() {
      Scanner sc = new Scanner(System.in);
      return (sc.next().equals("y"));
   }

}
