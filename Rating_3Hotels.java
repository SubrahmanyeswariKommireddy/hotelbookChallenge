package challenge1;

import java.util.Scanner;

public class Rating_3Hotels {

	static Scanner scan = new Scanner(System.in);

	public static String rating3(double money, int days) {
		// TODO Auto-generated method stub
		String hotel_1 = "RainTree";
		double cost_1 = 60;
		double offer_1 = 0.18;
		String hotel_2 = "Radisson";
		double cost_2 = 58;
		double offer_2 = 0.15;
		if (days <= 3 && money >= 58) {
			if (days == 3) {

				double cost = CostData.analysis(cost_2, offer_2, days);
				return "Hotel Booked for :" + days + " days in 3  star hotel " + hotel_1 + " for the cost of " + cost;
			}
			double cost = cost_1 * days;
			return "Hotel Booked for :" + days + " days in 3  star hotel " + hotel_1 + " for the cost of " + cost;

		}

		double cost = CostData.analysis(cost_2, offer_2, days);
		return "Hotel Booked for :" + days + " days in 3  star hotel " + hotel_2 + " for the cost of " + cost;
	}

}
