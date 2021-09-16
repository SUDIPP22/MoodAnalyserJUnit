package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    @Test
    void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Sad Mood");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenInAnyMood_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Any Mood");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("I am in Happy Mood");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenMessage_WhenSad_ShouldReturnSad_UsingParameterizedConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("SAD", mood);
    }

    @Test
    void givenMessage_WhenNotSad_ShouldReturnHappy_UsingParameterizedConstructor() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Happy Mood");
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assertions.assertEquals("HAPPY", mood);
    }

    @Test
    void givenNullMood_ShouldThrow_MoodAnalysisException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood();
        } catch (MoodAnalysisException e) {
            Assertions.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
}
