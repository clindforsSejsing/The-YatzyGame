package edu.lernia.labb5;

import org.junit.jupiter.api.Test;

import static edu.lernia.labb5.PlayTheGameOfYatzi.youGotYatzi;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatziTest {

   @Test
   void isYatziWhenAllDiceMatches() {

      Die[] dice = PlayTheGameOfYatzi.setUpDice();

      for ( Die die : dice ) {
         die.setValue(6);
      }

      Boolean message = (youGotYatzi(dice));
      Boolean expectedMessage = true;
      assertEquals(expectedMessage, message);

   }


   @Test
   void isNotYatziWhenOneDieIsNotMatchingTheOther() {
      Die[] dice = PlayTheGameOfYatzi.setUpDice();
      dice[0].setValue(1);
      dice[1].setValue(1);
      dice[2].setValue(2);
      dice[3].setValue(1);
      dice[4].setValue(1);


      Boolean message = (youGotYatzi(dice));
      Boolean expectedMessage = false;
      assertEquals(expectedMessage, message);

   }
}


