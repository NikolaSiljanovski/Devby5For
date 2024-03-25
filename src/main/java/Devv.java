import java.util.Scanner;

public class Devv {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int i, n;

		System.out.println("Do brojot: ");
		n = input.nextInt();

		for (i = 1; i <= n; i++) {

			if (i % 5 != 0) {
				System.out.println(i + " " + "Ne e delliv so 5");
			}

		}
		System.out.println("---------------------");
		for (i = 1; i <= n; i++) {

			if (i % 5 == 0) {
				System.out.println(i + " " + "E delliv so 5 ");
			}

		}

	}

}
