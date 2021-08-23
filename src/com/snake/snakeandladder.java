package com.snake;

import java.util.Random;

public class snakeandladder {

	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Problem");
		

		int pos= 0;
		System.out.println("player is at position "+pos);
		
		Random random = new Random();
		int dieNumber = random.nextInt(7-1)+1;
		System.out.println("Die number : "+dieNumber);
		
		int choice = random.nextInt(4-1)+1;
		
		if(choice == NO_PLAY){
			System.out.println("No Play");
		}else if(choice == LADDER) {
			System.out.println("Player climbed by "+dieNumber);
			pos+=dieNumber;
		}else if(choice == SNAKE) {
			System.out.println("Player dropped by "+dieNumber);
			pos-=dieNumber;
		}
}
}