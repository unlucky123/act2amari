package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
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
