import java.util.Scanner;
class Health extends Insurance {

	public Health(String insuranceType) {
		super(insuranceType);
		setCost();
	}

	public void setCost() {
		this.monthlyPrice = 196;
	}

	public void display() {
		System.out.printf("InsuranceType : %s\nMonthly Price : %.2f\n", insuranceType, monthlyPrice);
	}

}
