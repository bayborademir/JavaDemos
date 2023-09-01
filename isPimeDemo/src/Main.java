public class Main {

    public static void main(String[] args) {

        int number = 101;
        boolean isPrime = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }


        }
        if (isPrime == false) {
            System.out.println("Sayı asal değil");
        } else {
            System.out.println("Sayı asal");


        }


    }
}
