package com.company.strategy;

public class ChatClient {

    public void send(EncryptionAlgorithm encryptionAlgorithm, String message) {
        encryptionAlgorithm.encrypt(message);
        System.out.println("Sending the encrypted message...");
    }
}
