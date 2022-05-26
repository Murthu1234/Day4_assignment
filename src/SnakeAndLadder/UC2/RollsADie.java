package SnakeAndLadder.UC2;

import java.util.Random;
public class RollsADie {

    public static void main(String[] args) {

        int position = 0;
        System.out.println("Position of player = " + position);

        System.out.println("PLAYER1 ROLLS A DIE.....");
        System.out.println("@@@@@@@@@@@@@@");

        Random random = new Random();
        int x1 = random.nextInt(5);
        System.out.println("The number on a die = " + x1);
    }


}




