public class SharedDigit {
    public static boolean hasSharedDigit(int num1, int num2) {
    if (num1 < 10 || num1 > 99 || num2 < 10 || num2 > 99) {
        return false;
    }

    while (num1 != 0) {
        int digit1 = num1 % 10;
        int temp = num2;
        while (temp != 0) {
            int digit2 = temp % 10;
            if (digit1 == digit2) {
                return true;
            }
            temp /= 10;
        }
        num1 /= 10;
    }

    return false;
}

}