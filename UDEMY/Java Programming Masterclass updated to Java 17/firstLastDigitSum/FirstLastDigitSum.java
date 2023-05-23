public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
    if (number < 0) {
        return -1; // negative number is invalid
    }
    
    int lastDigit = number % 10; // get the last digit
    int firstDigit = number; // initialize first digit to number
    while (firstDigit >= 10) {
        firstDigit /= 10; // keep dividing by 10 until first digit is found
    }
    
    return firstDigit + lastDigit; // return the sum of first and last digit
}

}