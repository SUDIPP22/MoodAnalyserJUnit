package com.bridgelabz;

/**
 * Purpose : Implementing Mood Analyser Program using constructor
 * @author SUDIP PANJA
 * @version 11.0.11
 * @since 2021-09-14
 */
public class MoodAnalyser {
    private String message;

    // default constructor
    public MoodAnalyser() {
    }

    // parameterized constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public static void main(String[] args) {
        System.out.println("Welcome To The Program");
    }

    /**
     * This method is created for implementing test cases which does not use parameterized constructor
     * @param message This is the first parameter used to store the message
     * @return returns actual value from analyseMood method
     */
    public String analyseMood(String message) {
        this.message = message;
        return analyseMood();
    }

    /**
     * This method is created for implementing test cases which uses parameterized constructor
     * @return returns actual value
     */
    public String analyseMood() {
        if (message.contains("Sad"))
            return "SAD";
        else
            return "HAPPY";
    }
}
