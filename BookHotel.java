package bookHotelChallenge;

import java.util.*;
import java.util.Scanner;

public class BookHotel {
	double money;
	int days;
	int rating;

	BookHotel(double money, int days, int rating) {
		this.money = money;
		this.days = days;
		this.rating = rating;
	}

	public String bookHotel(double money, int days, int rating) {
		if (money >= 82 && rating == 5 && (days == 1 || days == 2)) {
			money = 82 * days;
			if (days > 3) {
				double minus = money * 0.12;
				double profit = money - minus;
				return "Hotel Booked for :" + days + " days in " + rating + " star hotel Hyaat for the cost of "
						+ profit;
			}
			return "Hotel Booked for :" + days + " days in " + rating + " star hotel Hyaat for the cost of " + money;
		} else if (money >= 90 && rating == 5) {
			money = 90 * days;
			if (days > 2) {
				double minus = money * 0.2;
				double profit = money - minus;
				return "Hotel Booked for :" + days + " days in " + rating + " star hotel The Park for the cost of "
						+ profit;
			}

			return "Hotel Booked for :" + days + " days in " + rating + " star hotel The Park for the cost of " + money;
		}

		else if (money >= 58 && rating == 3 && (days == 1 || days == 2 || days == 3)) {
			money = 58 * days;
			if (days > 2) {
				double minus = money * 0.15;
				double profit = money - minus;
				return "Hotel Booked for :" + days + " days in " + rating + " star hotel RainTree for the cost of "
						+ profit;
			}
			return "Hotel Booked for :" + days + " days in " + rating + " star hotel RainTree for the cost of " + money;
		} else if (money >= 60 && rating == 3) {
			money = 60 * days;
			if (days > 3) {
				double minus = money * 0.18;
				double profit = money - minus;
				return "Hotel Booked for :" + days + " days in " + rating + " star hotel Raddisson for the cost of "
						+ profit;
			}
			return "Hotel Booked for :" + days + " days in " + rating + " star hotel Raddisson for the cost of "
					+ money;
		}

		else if (money >= 41.55 && rating == 1 && (days == 1 || days == 2 || days == 3 || days == 4)) {
			money = 41.55 * days;
			if (days > 3) {
				double minus = money * 0.118;
				double profit = money - minus;
				return "Hotel Booked for :" + days + " days in " + rating + " star hotel Accord for the cost of "
						+ profit;
			}
			return "Hotel Booked for :" + days + " days in " + rating + " star hotel Accord for the cost of " + money;
		} else if (money >= 43 && rating == 1) {
			money = 43 * days;
			if (days > 4) {
				double minus = money * 0.418;
				double profit = money - minus;
				return "Hotel Booked for :" + days + " days in " + rating + " star hotel Fortune for the cost of "
						+ profit;
			}
			return "Hotel Booked for :" + days + " days in " + rating + " star hotel Fortune for the cost of " + money;
		}

		return "Sorry..! You don't have sufficient amount to book any hotel";
	}

	public static boolean checkConstraint(double money) {
		if (money >= 43) {
			return true;
		}
		return false;
	}

	public static boolean checkConstraint(int days) {
		if (days >= 1 && days <= 31) {
			return true;
		}
		return false;
	}

	public static boolean checkRating(int rating) {
		if (rating == 1 || rating == 3 || rating == 5) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("how much money would you want to spend on booking room");
		try {
			double money = scan.nextDouble();
			boolean constraint1 = checkConstraint(money);
			while (constraint1 == false) {
				System.out.println("Sorry..! You don't have sufficient amount to book any hotel");
				flag = -1;
				break;
			}
			if (flag == 0) {
				System.out.println("for how many days");
				int days = scan.nextInt();
				boolean constraint2 = checkConstraint(days);
				while (constraint2 == false) {
					System.out.println(" enter days , should not exceed a month");
					days = scan.nextInt();
					constraint2 = checkConstraint(days);
				}
				System.out.println("do you either want 1 star or 3 star or 5 star ,just enter a number");
				int rating = scan.nextInt();
				boolean constraint3 = checkRating(rating);
				while (constraint3 == false) {
					System.out.println("please enter among 1 , 3 , 5 as star rating");
					rating = scan.nextInt();
					constraint3 = checkRating(rating);
				}
				scan.close();
				BookHotel booking = new BookHotel(money, days, rating);
				String booked = booking.bookHotel(money, days, rating);
				System.out.println(booked);
			}
		} catch (InputMismatchException e) {
			System.out.println("INVALID..!Please Try Again");

		}
	}
}
