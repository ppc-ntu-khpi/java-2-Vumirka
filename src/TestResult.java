/**
 * Клас TestResult демонструє роботу методів класу Exercise.
 * Він перетворює число у код Грея та за потреби декодує його назад у двійковий код
 */
public class TestResult {

    public static void main(String[] args) {
        int binaryNumber = 17; // приклад числа

        // Перетворення в код Грея
        int grayCode = Exercise.Calculate(binaryNumber);

        System.out.println("Binary number: " + Integer.toBinaryString(binaryNumber));
        System.out.println("Gray code: " + Integer.toBinaryString(grayCode));

        // Приклад зворотного перетворення
        // int decodedBinary = Exercise.grayToBin(grayCode);
        // System.out.println("Decoded binary: " + Integer.toBinaryString(decodedBinary));
    }
}
