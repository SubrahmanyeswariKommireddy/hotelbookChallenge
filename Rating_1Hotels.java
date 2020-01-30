package challenge1;

import java.util.Scanner;

public class Rating_1Hotels {

	static Scanner scan = new Scanner(System.in);

	public static String rating1(double money, int days) {
		// TODO Auto-generated method stub
		String hotel_1 = "Accord";
		double cost_1 = 41.55;
		double offer_1 = 0.118;
		String hotel_2 = "Fortune";
		double cost_2 = 43;
		double offer_2 = 0.148;

		if (days <= 4 && money >= cost_1) {
			double cost = cost_1 * days;
			return "Hotel Booked for :" + days + " days in 1  star hotel " + hotel_1 + " for the cost of " + cost;
		}
		double cost = CostData.analysis(cost_2, offer_2, days);
		return "Hotel Booked for :" + days + " days in 1  star hotel " + hotel_2 + " for the cost of " + cost;
	}

}
