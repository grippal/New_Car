package pkgCar;

public class Car {

	private double totalPrice;
	private double downPayment;
	private int loanLength;
	private double interestRate;
	private double monthlyPayment;
	
	public Car (double totalPrice, double downPayment, int loanLength, double interestRate) {
		this.totalPrice = totalPrice;
		this.downPayment = downPayment;
		this.loanLength = loanLength;
		this.interestRate = interestRate;
	}

	public double monthlyPayment() {
		totalPrice -= downPayment;
		monthlyPayment = (double) (((interestRate / 12) * totalPrice) / 
				(1 - Math.pow((1 + (interestRate / 12)), (loanLength * -1))));
		return monthlyPayment;

	}

	public double totalInterest() {
		totalPrice -= downPayment;
		double interestPerMonth;
		double totalInterest = 0;
		for(int i = 0; i < (loanLength + 1); i++) {
			interestPerMonth = ((interestRate / 12) * totalPrice);
			totalPrice -= (monthlyPayment - interestPerMonth);
			totalInterest += interestPerMonth;
		}
		return totalInterest;
	}

}
