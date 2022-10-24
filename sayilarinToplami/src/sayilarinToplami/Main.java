package sayilarinToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int sayi, toplam = 0;

		Scanner scan = new Scanner(System.in);

		do {
			System.out.print("Sayý Giriniz: ");
			sayi = scan.nextInt();
			if (sayi % 4 == 0) {
				toplam += sayi;
			}
		} while (sayi % 2 == 0);

		System.out.println("Toplam: " + toplam);
	}

}
