package Algoritimos;

import java.lang.ProcessHandle.Info;
import java.util.Random;
import java.util.Scanner;

public class NumerosPares {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		System.out.println("Digite o número");
		int limite = scanner.nextInt();
		
		for (int i = 0; i <= limite; i = i + 2) {
			  System.out.println(i);
			}
	            
	        }
		
		

	}


