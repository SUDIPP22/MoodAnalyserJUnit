package com.bridgelabz;

public class MoodAnalysisException extends Exception {
    ExceptionType type;

    // to inform user whether the mood is null or empty
    enum ExceptionType {
        ENTERED_NULL, ENTERED_EMPTY
    }

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
