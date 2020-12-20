package vsu.cs.ru.num16.console;

import java.util.Scanner;
import vsu.cs.ru.num16.common.MaxLengthOfSubsequenceAndPositionOfFirstElement;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfIntegers = readValue(scanner);
        int[] arrayOfIntegers = readArrayOfNumbers(numberOfIntegers, scanner);

        MaxLengthOfSubsequenceAndPositionOfFirstElement result = new MaxLengthOfSubsequenceAndPositionOfFirstElement(arrayOfIntegers);
        printResult("Position of the first element of a monotonically increasing subsequence: ", result.getPositionOfFirstElement(),
                "The number of elements of such a subsequence: ", result.getMaxLength());
    }

    private static int readValue(Scanner scanner) {
        System.out.print("Input number of integers: ");
        return scanner.nextInt();
    }

    private static int[] readArrayOfNumbers(int n, Scanner scanner) {
        int[] arrayOfNumbers = new int[n];
        System.out.println("Input array of integers: ");
        for (int i = 0; i < n; i++) {
            arrayOfNumbers[i] = scanner.nextInt();
        }
        return arrayOfNumbers;
    }

    private static void printResult(String firstPhrase, int positionOfFirstElement, String secondPhrase, int maxLength) {
        System.out.printf(firstPhrase + positionOfFirstElement + "\n" + secondPhrase + maxLength);
    }
}
