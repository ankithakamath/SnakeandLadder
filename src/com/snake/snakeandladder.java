package com.snake;

import java.util.Random;

public class snakeandladder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to the game of Snake and Ladder");
	
	int pos = 0;
	System.out.println("player is at postion "+pos);
	
	Random random = new Random();
	int dieNumber = random.nextInt(7-1)+1;
	System.out.println("the die gives "+dieNumber);
}
}