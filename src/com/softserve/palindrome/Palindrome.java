package com.softserve.palindrome;

import java.util.Scanner;

/**
 * <p>The next class provides functionality for finding the
 * longest palindromic sequence in a string which was
 * entered by a user
 * @author Yuriy Olkhovskyi
 */
public class Palindrome {

    /** point from which the program starts
     */
     public void start() {
        String enteredString = getString();
        printResults(findLengthOfLongestPalindrome(enteredString));
    }

    /**
     * The method read a string from a user
     * @return String which was input by a user
     */
    public String getString() {
        String str = "";
        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Input: ");
            str = in.nextLine();
            if (str.length() > 100) {
                System.out.println("You've entered more than 100 symbols, try again:");
            } else {
                return str;
            }
        }
    }

    /**
     *
     * @param enteredString a string which is entered by a user
     * @return int the length of the longest palindomic sequence
     */
    public int findLengthOfLongestPalindrome(String enteredString) {
        if (enteredString.isEmpty()) {
            return 0;
        }
        enteredString = enteredString.toLowerCase();
        String longestPalindrome = enteredString.substring(0, 1);
        for (int i = 0; i < enteredString.length(); i++) {
            String newPalindrome = checkIfEqual(enteredString, i, i);
            if (newPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = newPalindrome;
            }
            newPalindrome = checkIfEqual(enteredString, i, i + 1);
            if (newPalindrome.length() > longestPalindrome.length()) {
                longestPalindrome = newPalindrome;
            }
        }
        return longestPalindrome.length();
    }

    /**
     *
     * @param enteredString a string which is entered by a user
     * @param start a start symbol from which comparing is started, it goes left
     *              comparing a correspond element from the right
     * @param end an end symbol from which comparing is started, it goes right
     *      *              comparing a correspond element from the left
     * @return substring which is the longest palindrome from the symbol its started comparing
     */
    public String checkIfEqual(String enteredString, int start, int end) {
        while ((start >= 0 && end < enteredString.length()) && (enteredString.charAt(start) == enteredString.charAt(end))) {
            start--;
            end++;
        }
        return enteredString.substring(start + 1, end);
    }

    /**
     * Prints the result of the longest palindromic sequence
     * @param numberOfSymbols of the longest sequence
     *
     */
    private void printResults(int numberOfSymbols) {
        System.out.println("Output:" + numberOfSymbols);
    }
}
