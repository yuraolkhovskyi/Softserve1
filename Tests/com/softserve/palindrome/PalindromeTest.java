package com.softserve.palindrome;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.nio.charset.Charset;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {

    Palindrome palindrome;

    @BeforeEach
    public void init(){
        palindrome = new Palindrome();
    }

    @AfterEach
    public void deleteObj(){
        palindrome = null;
    }

    @Test
    void start() {

    }

    @Test
    void checkIfEqualTest1() {
        String expected = "arra";
        String actual = palindrome.checkIfEqual("arra", 1, 2);
        assertEquals(expected, actual);
    }

    @Test
    void checkIfEqualTest2() {
        String expected = "mm";
        String actual = palindrome.checkIfEqual("immposible", 1, 2);
        assertEquals(expected, actual);
    }

    @Test
    void checkIfEqualTest3() {
        String expected = "mm";
        String actual = palindrome.checkIfEqual("immposible", 1, 2);
        assertEquals(expected, actual);
    }

    @Test
    void checkIfEqualTest4() {
        String expected = "a";
        String actual = palindrome.checkIfEqual("unreal", 4, 4);
        assertEquals(expected, actual);
    }

    @Test
    void checkIfEqualTest5() {
        String expected = "rrrrrr";
        String actual = palindrome.checkIfEqual("rrrrrr", 2, 3);
        assertEquals(expected, actual);
    }

    ///////////////////////////////////////////////////////////
    @Test
    void getString() {
        byte[] array = new byte[100]; // length is bounded by 7
        new Random().nextBytes(array);
        String expected = new String(array, Charset.forName("UTF-8"));
        System.out.println();
        assertEquals(expected, expected);
    }
////////////////////////////////////////////////////////////

    @Test
    void longestPalindromeTest1() {
        int expected = 5;
        int actual = palindrome.findLengthOfLongestPalindrome("bananas");
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest2() {
        int expected = 3;
        int actual = palindrome.findLengthOfLongestPalindrome("mom");
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest3() {
        int expected = 0;
        int actual = palindrome.findLengthOfLongestPalindrome("");
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest4() {
        int expected = 1;
        int actual = palindrome.findLengthOfLongestPalindrome("zxcvbnm");
        assertEquals(expected, actual);
    }

    @Test
    void longestPalindromeTest5() {
        int expected = 7;
        int actual = palindrome.findLengthOfLongestPalindrome("DeiFIeD palindromeD");
        assertEquals(expected, actual);
    }
}