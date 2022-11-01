package array;

import java.util.Scanner;

public class classLargestSumAvg {
	class Temp {
		void sumandavg() {

			Scanner Sc = new Scanner(System.in);
			int x[] = new int[5];
			int sum, i;
			for (i = 0, sum = 0; i < x.length; i++) {
				System.out.print("Enter no:");
				x[i] = Sc.nextInt();
				sum += x[i];
			}
			int Avg = sum / x.length;
			System.out.print("Average" + Avg);
		}

	}

	class Largest extends Temp {
		void largest() {
			int n, max;
			Scanner Sc = new Scanner(System.in);
			System.out.println("Enter number of elements in the array: ");
			n = Sc.nextInt();
			int a[] = new int[n];
			System.out.println("Enter elements of array: ");
			for (int i = 0; i < n; i++) {
				a[i] = Sc.nextInt();
			}
			max = a[0];
			for (int i = 0; i < n; i++) {
				if (max < a[i]) {
					max = a[i];
				}
			}
			System.out.println("Maximum value: " + max);
		}
	}

	class Main {
		public static void main(String[] args) {
			Largest obj = new Largest();
			obj.sumandavg();
			obj.largest();
		}
	}
}
