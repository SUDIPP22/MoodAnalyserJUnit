package com.bridgelabz;

/**
 * Purpose : Implementing Mood Analyser Program
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-14
 */
public class MoodAnalyser {
    public static void main(String[] args) {
        System.out.println("Welcome To The Program");
    }

    /**
     * This method is created for implementing test cases
     * @param message This is the first parameter used to store the message
     * @return returns actual value
     */
    public String analyseMood(String message) {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
