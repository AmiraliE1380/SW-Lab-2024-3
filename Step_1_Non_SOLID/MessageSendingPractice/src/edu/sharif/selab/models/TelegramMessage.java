package edu.sharif.selab.models;

public class TelegramMessage extends Message {

    private String sourceId;
    private String targetId;

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourcePhoneNumber) {
        this.sourceId = sourcePhoneNumber;
    }

    public String getTargetId() {
        return targetId;
    }

    public void setTargetId(String targetPhoneNumber) {
        this.targetId = targetPhoneNumber;
    }
}
