import java.util.Scanner;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть слово для перевірки на паліндром: ");
        String word = scanner.nextLine();

        if (Exercise.Calculate(word)) {
            System.out.println("Слово '" + word + "' є паліндромом.");
        } else {
            System.out.println("Слово '" + word + "' не є паліндромом.");
        }

        scanner.close();
    }
}
