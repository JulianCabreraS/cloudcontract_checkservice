package com.retailbank.creditcheckservice;

import java.util.UUID;

public class CreditCheckResponse {
    private final String uuid ;
    private Score score;

    public CreditCheckResponse(Score high, String uuid) {
        score = high;
        this.uuid = uuid;
    }



    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public String getUuid() {
        return uuid;
    }

    public enum Score {
        HIGH, LOW
    }
}
