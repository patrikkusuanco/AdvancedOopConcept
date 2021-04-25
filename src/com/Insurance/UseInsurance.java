import java.util.Scanner;
public class UseInsurnace {

	public static void main(String[] args) {

		System.out.println("Please select the insurance type \n 1. Health Insurance \n 2. Life Insurance");

		Insurance insurance;
		Scanner input = new Scanner(System.in);
		String str = input.next();
		if(str.equals("1")){
			insurance = new Health("Health Insurance");
			insurance.display();
		} else if(str.equals("2")){
			insurance = new Life("Life Insurance");
			insurance.display();
		} else {
			System.out.println("Invalid insurance");
		}
	}

}
