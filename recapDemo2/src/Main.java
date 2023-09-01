public class Main {

    public static void main(String[] args) {

        double[] myList = {1.2, 1.3, 4.3, 5.6};
        double toplam = 0;
        double max = myList[0];


        for (int i = 0; i < myList.length; i++) {
            System.out.println(myList[i]);
            max = myList[0];
            if (max < myList[i]) {
                max = myList[i];
            }

        }
        for (int j = 0; j < myList.length; j++) {
            toplam = toplam + myList[j];

        }
        System.out.println("TOPLAM:" + toplam);
        System.out.println("en büyük: " + max);


    }
}
