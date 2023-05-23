public class PositiveNegativeZero {
    public static void checkNumber(int number) {
        if (number > 0) {
            System.out.println("positive");
        } else if (number < 0) {
            System.out.println("negative");
        } else {
            System.out.println("zero");
        }
    }
}
You can now create an instance of this class and call the checkNumber method to test it out. For example:

java
Copy code
public static void main(String[] args) {
    PositiveNegativeZero obj = new PositiveNegativeZero();
    obj.checkNumber(5); // Output: positive
    obj.checkNumber(-5); // Output: negative
    obj.checkNumber(0); // Output: zero
}
Note that the checkNumber method is defined as public static which means you can call it directly on the class without creating an instance of it.





