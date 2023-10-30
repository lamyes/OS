
package osProject;
import java.util.Scanner;
import java.util.Random;

public class OSProject {
	public static void main(String[] args) {
		Scanner read = new Scanner (System.in) ; 
		boolean invalid= false ; 
		int n, m ; 
		do {
			//System.out.println("Enter two number n(between 3 - 6) and m (smaller than n^2) (respectively)\n");//The user is asked to input values for n and m within specific ranges
			System.out.println("Enter the number n, it should be between 2 - 7: ");
			n = read.nextInt(); 
			System.out.println("Enter the number m, it should smaller than n^2: ");
			m = read.nextInt(); 
			if (n<3 || n>6 || m>=n*n) {
				System.out.println(" numbers are out of range, please enter another number ");
				invalid = true ; 
			}
			//If the user's input does not meet these criteria, a message is displayed, and invalid is set to true. 
			//Otherwise, invalid is set to false.
			//The loop continues until the user provides valid input (i.e., invalid is false
		} while (invalid); 
		//create a binary integer array called puzzle with dimensions n x n. This array represents the puzzle grid, and all its cells are initialized to 1.
		int [][] puzzle = new int[n][n];
		for (int i =0 ; i<n ; i++){ 
			for (int j = 0 ; j<n ; j++)
				puzzle[i][j] = 1 ; 
		}    

		Random randomNum= new Random() ;//initialize a Random object named random to generate random numbers.

		for (int i =0 ; i < m ; i++){//Randomly select different cells and set their values to zero
			int row = randomNum.nextInt(n);  
			int colmoun = randomNum.nextInt(n);
			puzzle[row][colmoun] = 0  ; 
		}
		System.out.println("The puzzle is:");//drawing the puzzle 
		for (int i =0 ; i<n; i++){
			for (int j = 0; j<n ; j++){
				System.out.print ( puzzle[i][j]+" "); 
			}
			System.out.println();
		}
	}
}