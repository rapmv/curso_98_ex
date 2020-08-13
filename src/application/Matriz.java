package application;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero de linhas e colunas da matriz: ");
		int l = sc.nextInt();
		int c = sc.nextInt();
		int [][] matriz = new int[l][c];
		
		System.out.println("Digite os valores da matriz: ");
		for(int i=0; i<l; i++) {
			for(int j=0; j<c; j++) {
				matriz[i][j]= sc.nextInt();
			}
			System.out.println();
		}
		
		System.out.print("Digite o numero que deseja saber quais são seus vizinhos: ");
		int busca = sc.nextInt();
		
		//linha
		for(int i=0; i<l; i++) {
			//coluna
			for(int j=0; j<c; j++) {
				if(matriz[i][j]==busca) {
					System.out.println();
					System.out.println("Posição " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + matriz[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Em cima: " + matriz[i-1][j]);
					}
					if (j < c-1) {
						System.out.println("Direita: " + matriz[i][j+1]);
					}
					if (i < l-1) {
						System.out.println("Em baixo: " + matriz[i+1][j]);
					}
				}
			}
		}
		
		
		sc.close();
	}
}
