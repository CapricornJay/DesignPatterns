package com.company.strategy;

public class DESEncryptionAlgorithm implements EncryptionAlgorithm{
    @Override
    public void encrypt(String input) {
        System.out.println("Encrypting using DES");
    }
}
