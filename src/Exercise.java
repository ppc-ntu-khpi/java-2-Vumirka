/**
 * Клас Exercise реалізує методи для перетворення двійкового числа у код Грея та зворотне перетворення.
 */
public class Exercise {

    /**
     * Перетворює десяткове число (розуміємо як двійкове представлення) у код Грея.
     * @param binary десяткове число
     * @return число в коді Грея
     */
    public static int Calculate(int binary) {
        return binToGray(binary);
    }

    /**
     * Перетворення двійкового числа в код Грея
     * @param binary десяткове число
     * @return число в коді Грея
     */
    private static int binToGray(int binary) {
        return binary ^ (binary >> 1);
    }

    /**
     * Зворотного перетворення коду Грея в двійкове число
     * @param gray число в коді Грея
     * @return відповідне двійкове число
     */
    private static int grayToBin(int gray) {
        int binary = 0;
        for (; gray != 0; gray >>= 1) {
            binary ^= gray;
        }
        return binary;
    }
}
