package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Start Amount: ");
		int startAmount = in.nextInt();
		System.out.print("Win Chance: ");
		double winChance = in.nextDouble();
		System.out.print("Win Limit: ");
		int winLimit = in.nextInt();
		System.out.print("Number of Days to Simulate: ");
		int totalSimulations = in.nextInt();
		String winOrNot;
		double rnd;
		int numberPlays;
		int currentAmount = startAmount;
		int winNumber=0;
		int loseNumber = 0;
		double alpha = (1-winChance)/winChance;
		double expectedRuin;
		if (winChance ==0.5) {
			expectedRuin = 1-startAmount/(double) winLimit;
		}
		else {
			expectedRuin = (Math.pow(alpha, (double) startAmount) - Math.pow(alpha,(double) winLimit))/(1- Math.pow(alpha, (double)winLimit));
		}
		for (int i = 0; i < totalSimulations; i++) {
			numberPlays = 0;
			currentAmount = startAmount;
			while ((currentAmount < winLimit) && (currentAmount > 0)) {
				rnd = Math.random();
				if (winChance >= rnd) {
					currentAmount++;
				} else {
					currentAmount--;
				}
			numberPlays++;
			}
			if (currentAmount >= winLimit) {
				winOrNot = "Win";
				winNumber++;
			} else {
				winOrNot = "Lose";
				loseNumber++;
			}
			System.out.println("Simulation " + (i+1)+": "+numberPlays +" " +winOrNot );
		}
		System.out.println("Losses: "+ loseNumber+" Simulations: "+ totalSimulations);
		System.out.println("Ruin Rate from Simulation: "+(loseNumber/(double) totalSimulations)+" Expected Ruin Rate: "+ expectedRuin);
	}

}
