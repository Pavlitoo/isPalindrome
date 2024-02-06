                                                                                                                                                                                                                    # Перевірка на паліндром

![Паліндром](/img/palindrome.png)

Це завдання полягає у створенні програми, яка перевіряє, чи задане слово є паліндромом.

## Опис завдання

Паліндром - це послідовність символів, яка читається однаково як зліва направо, так і справа наліво. 

## Виконання завдання

- В репозиторії міститься Java-код для перевірки, чи задане слово є паліндромом.
- Код складається з класів `Exercise` та `TestResult`.
- У класі `Exercise` є метод `Calculate`, який перевіряє, чи слово є паліндромом.
- У класі `TestResult` викликається метод `Calculate` з вказаним словом для перевірки.

## Використання

1. Запустіть клас `TestResult`.
2. Після запуску програма запросить ввести слово для перевірки на паліндром.
3. Введіть слово та натисніть Enter.
4. Програма виведе повідомлення про те, чи є введене слово паліндромом.

## Exercise.java

```java
public class Exercise {
    
    /**
     * Метод Calculate перевіряє, чи задане слово є паліндромом.
     * @param word Слово для перевірки.
     * @return true, якщо слово є паліндромом, false в іншому випадку.
     */
    public static boolean Calculate(String word) {
        if (word == null || word.isEmpty())
            return false;

        word = word.replaceAll("\\s+", "").toLowerCase();

        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left++) != word.charAt(right--))
                return false;
        }

        return true;
    }
}
```

## TestResult.java

```java
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
```

## Мій GitHub

![Static Badge](https://img.shields.io/badge/GitHub-181717?style=plastic&logo=GitHub&labelColor=black&color=white&link=https%3A%2F%2Fgithub.com%2FPavlitoo)


*Автор роботи: Луговий Павло 34  PPC NTU "KhPI"*