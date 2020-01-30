package challenge1;

import java.util.Scanner;

public class Rating_5Hotels {

	static Scanner scan = new Scanner(System.in);

	public static String rating5(double money, int days) {
		String hotel_1 = "Hyaat";
		double cost_1 = 82;
		double offer_1 = 0.12;
		String hotel_2 = "The Park";
		double cost_2 = 90;
		double offer_2 = 0.2;
		if (days <= 2 && money >= 82) {

			double cost = cost_1 * days;
			return "Hotel Booked for :" + days + " days in 5  star hotel " + hotel_1 + " for the cost of " + cost;
		}

		double cost = CostData.analysis(cost_2, offer_2, days);
		return "Hotel Booked for :" + days + " days in 5  star hotel " + hotel_2 + " for the cost of " + cost;
	}

}
