package studio2;
import java.util.Scanner;
public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double x=0;
		double y=0;
		int numberOfTrials =0;
		Scanner in = new Scanner(System.in);
		double distance=0;
		System.out.print("Number of Trials: ");
		numberOfTrials = in.nextInt();
		int numberIn =0;
		for(int i=0; i<numberOfTrials; i++) {
			x = Math.random();
			y = Math.random();
			distance = Math.pow(x, 2.0)+ Math.pow(y, 2.0);
			if(distance<1) {
				numberIn++;
			}
		}
		System.out.println("Pi Calculated: "+ (numberIn/(double) numberOfTrials)*4 );		
	}

}
