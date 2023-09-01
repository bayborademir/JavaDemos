import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        readFile();
        writeFile();
        readFile();
    }

    public static void createFile() {
        File file = new File("C:\\JavaDemos\\Files\\students.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("Dosya oluşturuldu");
            } else {
                System.out.println("Dosya zaten var");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo() {
        File file = new File("C:\\JavaDemos\\Files\\students.txt");
        if (file.exists()) {
            System.out.println("dosya adı: " + file.getName());
            System.out.println("dosya yolu: " + file.getAbsolutePath());
            System.out.println("dosya  yazılabilir mi: " + file.canWrite());
            System.out.println("dosya okunaiblir mi: " + file.canRead());
            System.out.println("dosya boyutu: " + file.length());

        }
    }

    public static void readFile() {

        File file = new File("C:\\JavaDemos\\Files\\students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\JavaDemos\\Files\\students.txt", true));
            writer.newLine();
            writer.write("ahmet");
            System.out.println("Dosyaya yazıldı");
            writer.close();


        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
