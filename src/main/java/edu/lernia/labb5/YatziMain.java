package edu.lernia.labb5;

import static edu.lernia.labb5.PlayTheGameOfYatzi.messageToUser;
import static edu.lernia.labb5.PlayTheGameOfYatzi.turns;

public class YatziMain {

   public static void main(String[] args) {

      boolean theGameIsOn = true;
      Die[] dice = PlayTheGameOfYatzi.setUpDice();

      messageToUser("Welcome to Yatzi!");
      while (theGameIsOn) {
         theGameIsOn = turns(dice);
      }
   }
}


