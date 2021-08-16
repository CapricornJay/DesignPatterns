package com.company.strategy;

public class AESEncryptionAlgorithm implements EncryptionAlgorithm{
    @Override
    public void encrypt(String input) {
        System.out.println("Encrypting using AES");
    }
}
