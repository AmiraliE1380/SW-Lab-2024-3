package edu.sharif.selab.models;

public class TelegramMessage {

    private String sourceId;
    private String targetId;

    public String getSourcePhoneNumber() {
        return sourceId;
    }

    public void setSourcePhoneNumber(String sourcePhoneNumber) {
        this.sourceId = sourcePhoneNumber;
    }

    public String getTargetPhoneNumber() {
        return targetId;
    }

    public void setTargetPhoneNumber(String targetPhoneNumber) {
        this.targetId = targetPhoneNumber;
    }
}
