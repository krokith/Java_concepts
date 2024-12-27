import java.util.*;
public class ReverseFirstAndLastDigit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Reverse first and last digit
        int result = reverseFirstAndLastDigit(number);

        System.out.println("Number after reversing first and last digit: " + result);
    }

    public static int reverseFirstAndLastDigit(int number) {
        // Handle negative numbers
        boolean isNegative = number < 0;
        if (isNegative) {
            number = -number;
        }

        int lastDigit = number % 10;

        // Find the first digit
        int firstDigit = number;
        int multiplier = 1;
        while (firstDigit >= 10) {
            firstDigit /= 10;
            multiplier *= 10;
        }

        // Replace the first and last digit
        int middlePart = (number % multiplier) / 10;
        int newNumber = lastDigit * multiplier + middlePart * 10 + firstDigit;

        return isNegative ? -newNumber : newNumber;
    }
}



