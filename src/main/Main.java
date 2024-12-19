package main;


import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		int[][] pepeMatriz = new int [5][5];
		
		Random rand = new Random();
		
		for (int i = 0; i < pepeMatriz.length; i++) {
			for (int j = 0; j < pepeMatriz.length; j++) {
				int peperand = rand.nextInt(101);
				pepeMatriz[i][j] = peperand;
			}
		}
		
	}

}
