package com.bridgelabz;

public class MoodAnalysisException extends Exception {
    ExceptionType type;

    // to inform user whether the mood is null
    enum ExceptionType {
        ENTERED_NULL
    }

    public MoodAnalysisException(ExceptionType type, String message) {
        super(message);
        this.type = type;
    }
}
