import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите строку: ");

        String stroka = sc.nextLine();

        String[] words = stroka.split(" ");

        System.out.println("Кол-во слов: " + words.length);
    }
}
