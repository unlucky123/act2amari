package main;



import java.util.Scanner;
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

		Scanner scan = new Scanner(System.in); 
		int pepenum = 0;
		boolean esta = false;
		System.out.println("Que numero quieres encontrar?");
		pepenum = scan.nextInt();
		for (int i = 0; i < pepeMatriz.length; i++) {
			for (int j = 0; j < pepeMatriz[0].length; j++) {
				if(pepeMatriz[i][j] == pepenum) {
					esta = true;
				}
			}
		}
		if(esta) {
			System.out.println("El numero esta");
		}
		else {
			System.out.println("No esta");
		}

	}

}
