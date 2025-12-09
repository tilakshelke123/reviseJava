package Day2Home;

import java.util.Scanner;

public class CityTemp {

	public static int highestAvg(int[][] temp) {
		int avgHighest = 0;

		// complete colum got
		for (int i = 0; i < 4; i++) {
			int sum = 0;
			for (int j = 0; j < 7; j++) {
				sum += temp[j][i];

			}
			System.out.println("sum :-" + sum);
			int avg = sum / 7; // 7 no of days

			if (avg > avgHighest) {
				avgHighest = avg;
			}

		}
		return avgHighest;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int tempRow = 7;
		int cityCol = 4;
		int[][] temp = new int[tempRow][cityCol];
		String[] city = new String[cityCol];

		// putting data into 2D Array
		for (int i = 0; i < tempRow; i++) {
			for (int j = 0; j < cityCol; j++) {
				System.out.println("Enter the Temp Row:" + i + "and cityCol: " + j + " :- ");
				temp[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < cityCol; i++) {
			System.out.println("Enter the City Row:" + i + " :- ");
			city[i] = sc.next();
		}

		// highest Avg method Call

		int avgResult = highestAvg(temp);
		System.out.println("Average Result :-" + avgResult);

		// print temp of city
		for (int i = 0; i < tempRow; i++) {
			for (int j = 0; j < cityCol; j++) {
				System.out.println(temp[i][j]);
			}
		}

	}

}
