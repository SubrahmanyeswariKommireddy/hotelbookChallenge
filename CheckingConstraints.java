package challenge1;

import java.util.Scanner;

public class CostData {

	public static double analysis(double cost, double offer, int days) {
		double wholeMoney = days * cost;
		double off = wholeMoney * offer;
		double data = wholeMoney - off;
		return data;
	}

	static Scanner scan = new Scanner(System.in);

	public static void bookHotel(double money, int days, int ratingStars) {

		if (ratingStars == 1) {
			System.out.println(Rating_1Hotels.rating1(money, days));
		} else if (ratingStars == 3) {

			System.out.println(Rating_3Hotels.rating3(money, days));
		} else {

			System.out.println(Rating_5Hotels.rating5(money, days));
		}
	}
}
