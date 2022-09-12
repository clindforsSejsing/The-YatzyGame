package edu.lernia.labb5;

public class Die extends PlayTheGameOfYatzi {
   public int getValue() {
      return value;
   }

   protected void setValue(int value) {
      this.value = value;
   }

   private int value;

   protected Die() {
      value = DieRoll();
   }

   protected int DieRoll() {
      value = (int)(Math.random()*6+1);
      return value;
   }

   protected String getString() {
      return "Dice shows " + value;
   }
}