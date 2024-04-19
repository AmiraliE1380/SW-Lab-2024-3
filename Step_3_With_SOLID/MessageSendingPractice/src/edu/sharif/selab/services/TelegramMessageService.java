package edu.sharif.selab.services;

import edu.sharif.selab.models.Message;
import edu.sharif.selab.models.TelegramMessage;

import java.util.regex.Pattern;

public class TelegramMessageService implements MessageService{

    @Override
    public void sendMessage(Message Message, String type) {
        if(type == "Telegram"){
            TelegramMessage telegramMessage = (TelegramMessage) Message;
            if(validateId(telegramMessage.getSourceId()) && validateId(telegramMessage.getTargetId())){
                System.out.println("Sending a TelegramMessage from " + telegramMessage.getSourceId() +
                        " to " + telegramMessage.getTargetId() + " with content : " + telegramMessage.getContent());
            }else{
                throw new IllegalArgumentException("Telegram Id is Not Correct!");
            }
        }
    }

    public boolean validateId(String email) {
        // Regular expression pattern for validating email addresses
        String telegramRegex = "^@\\w+$";

        // Compile the pattern into a regex Pattern object
        Pattern pattern = Pattern.compile(telegramRegex);

        // Check if the email string matches the regex pattern
        return pattern.matcher(email).matches();
    }
}
