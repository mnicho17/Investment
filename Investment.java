import java.util.Scanner;

public class Investment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Enter Investment Amount
		System.out.print("Enter investment amount, e.g. 10000: ");
		double investmentAmount = input.nextDouble();
		
		//Enter annual interest rate
		System.out.print("Enter annual interest rate, e.g. 2.25: ");
		double annualInterest = input.nextDouble();
		
		//Enter numbers of years
		System.out.print("Enter number of years, e.g. 10: ");
		int numberOfYears = input.nextInt();
		
		//Calculate monthly interest rate
		double monthlyInterestRate = annualInterest / 1200;
		
		//Calculate Accumulated Value
		double futureInvestmentAmount = investmentAmount * (Math.pow(1 + monthlyInterestRate,numberOfYears*12));
		
		System.out.print("Accumulated value is " + (int)(futureInvestmentAmount *100) / 100.0);
		
	}

}
