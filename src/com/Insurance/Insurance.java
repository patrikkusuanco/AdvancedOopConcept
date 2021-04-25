import java.util.Scanner;
abstract class Insurance {

	public String insuranceType;
	public double monthlyPrice;

	public Insurance(String insuranceType) {
		this.insuranceType = insuranceType;
	}

	public abstract void setCost();

	public abstract void display();

	public String getInsuranceType() {
		return insuranceType;
	}

	public double getMonthlyPrice() {
		return monthlyPrice;
	}

}
