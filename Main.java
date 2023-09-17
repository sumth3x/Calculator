import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println("Введите два числа:");
        Scanner scanner = new Scanner(System.in);
        System.out.println(calc(scanner.nextLine()));
    }

    public static String calc(String input) throws Exception {
        String str = input.replaceAll(" ", "");
        String[] parts = str.split("[+\\-*/]");

        if (parts.length != 2)
            throw new Exception("Формат математической операции не удовлетворяет заданию - два операнда и один оператор (+, -, /, *)");
        int result = 0;

        int value1 = Integer.parseInt(parts[0]);
        int value2 = Integer.parseInt(parts[1]);

        if (!((value1 > 0 && value1 < 11) && (value2 > 0 && value2 < 11)))
            throw new Exception("Числа должны быть от 1 до 10");
        if (str.contains("+")) result = value1 + value2;
        else if (str.contains("-")) result = value1 - value2;
        else if (str.contains("*")) result = value1 * value2;
        else if (str.contains("/")) result = value1 / value2;

        return String.valueOf(result);
    }
}