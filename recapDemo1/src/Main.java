
public class Main {

    public static void main(String[] args) {
        // En büyük sayıyı bulma örnek

        int a = 70;
        int b = 15;
        int c = 2;

        int max = a;

        if (max > b) {
            max = a;
        } else {
            max = b;
        }
        if (max > c) {
            max = max;
        } else {
            max = c;
        }

        System.out.println("En büyük sayı: " + max);
    }
}