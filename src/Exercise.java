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
