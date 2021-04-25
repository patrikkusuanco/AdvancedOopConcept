import java.util.Scanner;
class Life extends Insurance {

	public Life(String insuranceType) {
		super(insuranceType);
		setCost();
	}

	public void setCost() {
		this.monthlyPrice = 36;
	}

	public void display() {
		System.out.printf("InsuranceType :  Monthly Price : ", insuranceType, monthlyPrice);
	}

}
