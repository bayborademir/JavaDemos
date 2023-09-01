import Matematik.Dortislem;
import Matematik.Logaritma;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	        Scanner data = new Scanner(System.in);
            System.out.println("Adınız:  ");

            String sayi = data.nextLine();

        System.out.println("Mehrraba "+ sayi);

        Dortislem dortislem = new Dortislem();
        dortislem.topla(2,3);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();
    }
}
