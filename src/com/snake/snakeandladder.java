package com.snake;

import java.util.Random;

public class snakeandladder {
	public static final int NO_PLAY = 1;
	public static final int LADDER = 2;
	public static final int SNAKE =3;

	public static void main(String[] args) {
		System.out.println("Welcome to the game of Snake and Ladder ");
		

		int pos = 0;
		System.out.println("Single player is at postion "+pos);
		
		Random random = new Random();
		
		while(pos!= 100) {
				int dieNumber = random.nextInt(7-1)+1;
				System.out.println("Dice number : "+dieNumber);
		
			int choice = random.nextInt(4-1)+1;
		
			if(choice == NO_PLAY){
				System.out.println("No Play");
			}else if(choice == LADDER) {
				System.out.println("Player inclined by "+dieNumber);
				pos+=dieNumber;
			}else if(choice == SNAKE) {
				System.out.println("Player declined by "+dieNumber);
				pos-=dieNumber;
			}
			if(pos<0)
				pos = 0;
		
		}
			
	}

}