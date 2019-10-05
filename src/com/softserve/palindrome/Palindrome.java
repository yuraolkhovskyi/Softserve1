package com.softserve.palindrome;

import java.util.Scanner;

public class Palindrome {

    public void start() {
        //some comments
        //hello
        //added new branch olkh
        String enteredString = getString();
        printResults(longestPalindrome(enteredString));
    }

    private String getString() {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your string: ");
        String str = in.nextLine();
        return str;
    }

    private int longestPalindrome(String enteredString) {
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

    private static String checkIfEqual(String enteredString, int start, int end) {
        while ((start >= 0 && end < enteredString.length()) && (enteredString.charAt(start) == enteredString.charAt(end))) {
            start--;
            end++;
        }
        return enteredString.substring(start + 1, end);
    }

    private void printResults(int numberOfSymbols){
        System.out.println("The longest palindrome has " + numberOfSymbols+" symbols");
    }
}

