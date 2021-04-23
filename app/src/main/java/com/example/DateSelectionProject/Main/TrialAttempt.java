package com.example.DateSelectionProject.Main;

import java.io.Serializable;

public class TrialAttempt implements Serializable {

    private final long TimeInMillis;
    private final int AttemptNo;
    private final int NoOfTaps;
    private final int ErrorCount;

    //constructor for TrialAttempt class
    public TrialAttempt(int attemptNo, long timeInMillis, int noOfTaps, int errorCount) {
        this.TimeInMillis = timeInMillis;
        this.NoOfTaps = noOfTaps;
        this.ErrorCount = errorCount;
        this.AttemptNo = attemptNo;
    }

    // Getters and Setters for TrialAttempt class fields
    public long getTimeInMillis() {
        return TimeInMillis;
    }

    public int getNoOfTaps() {
        return NoOfTaps;
    }

    public int getErrorCount() {
        return ErrorCount;
    }

}
