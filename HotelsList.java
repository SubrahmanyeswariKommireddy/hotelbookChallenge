package challenge1;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class HotelsList {
	static Scanner scan = new Scanner(System.in);

	public static void main(String args[]) {
		Map<Integer, List<String>> list = new HashMap<Integer, List<String>>();
		int flag = 0;
		List<String> rating_1 = new ArrayList<String>();
		rating_1.add("The Park");
		rating_1.add("Hyaat");
		List<String> rating_2 = new ArrayList<String>();
		rating_2.add("Radissson");
		rating_2.add("RainTree");
		List<String> rating_3 = new ArrayList<String>();
		rating_3.add("Accord");
		rating_3.add("Fortune");

		list.put(1, rating_1);
		list.put(2, rating_2);
		list.put(3, rating_3);
		System.out.println("enter money how much money you want to spend");
		try {
			double money = scan.nextInt();
			boolean constraint_1 = CheckingConstraints.checkConstraint(money);
			while (constraint_1 == false) {
				System.out.println("Sorry..! You don't have sufficient amount to book any hotel");
				flag = -1;
				break;
			}
			if (flag == 0) {
				System.out.println("how many days");
				int days = scan.nextInt();
				boolean constraint2 = CheckingConstraints.checkConstraint(days);
				while (constraint2 == false) {
					System.out.println(" enter days , should not exceed a month");
					days = scan.nextInt();
					constraint2 = CheckingConstraints.checkConstraint(days);
				}
				System.out.println("enter rating");
				int rating = scan.nextInt();
				boolean constraint3 = CheckingConstraints.checkRating(rating);
				while (constraint3 == false) {
					System.out.println("please enter among 1 , 3 , 5 as star rating");
					rating = scan.nextInt();
					constraint3 = CheckingConstraints.checkRating(rating);
				}
				CostData.bookHotel(money, days, rating);
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid..!Try Again");
		}
	}
}
/*

enter money how much money you want to spend
100
how many days
3
enter rating
5
Hotel Booked for :3 days in 5  star hotel The Park for the cost of 216.0
.
.
.
enter money how much money you want to spend
30
Sorry..! You don't have sufficient amount to book any hotel
.
.
.
enter money how much money you want to spend
90
how many days
50
 enter days , should not exceed a month
30
enter rating
3
Hotel Booked for :30 days in 3  star hotel Radisson for the cost of 1479.0
.
.
.
enter money how much money you want to spend
60
how many days
4
enter rating
2
please enter among 1 , 3 , 5 as star rating
1
Hotel Booked for :4 days in 1  star hotel Accord for the cost of 166.2
.
.
.
enter money how much money you want to spend
400
how many days
3
enter rating
3
Hotel Booked for :3 days in 3  star hotel RainTree for the cost of 147.9

*/
