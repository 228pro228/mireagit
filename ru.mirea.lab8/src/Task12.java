import java.util.Scanner;
import java.util.ArrayList;
public class Task12 {
    public static void main(String[] args) {
        printOddNumbersInSequence();
    }

    public static void printOddNumbersInSequence() {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();

        // Считываем числа и сохраняем их в списке
        int number;
        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;
            }
            numbers.add(number);
        }

        // Выводим нечетные числа
        for (int num : numbers) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }
}
