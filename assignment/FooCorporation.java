package assignment;

public class FooCorporation {

	public static void salary(double base, double hour) {

		double payRoll = 0;
		if (base < 8 || hour > 60) {
			System.out.println("Error!");
		} else if (hour > 40) {
			payRoll = base * 40 + base * (hour - 40);
			System.out.println("The total payroll is " + payRoll);
		} else {
			payRoll = base * hour;
			System.out.println("The total payroll is " + payRoll);
		}

	}

	public static void main(String[] arguments) {
		salary(7.50, 35);
		salary(8.20, 47);
		salary(10.00, 73);
	}
}