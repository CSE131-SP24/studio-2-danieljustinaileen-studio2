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
		double rnd;
		while ((startAmount < winLimit) || (startAmount>0)) {
			rnd = Math.random();
			if (winChance>= rnd) {
				System.out.println("Win!");
				startAmount++;
				System.out.println("Amount Left: "+startAmount);
			}
			else {
				System.out.println("Loss!");
				startAmount--;
				System.out.println("Amount Left: "+startAmount);
			}
		}

	}

}
