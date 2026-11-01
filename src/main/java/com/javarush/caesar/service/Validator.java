package com.javarush.caesar.service;

import com.javarush.caesar.exception.CipherException;

import java.nio.file.Files;
import java.nio.file.Path;

public class Validator {

    public boolean isValidKey(int key, char[] alphabet) {
        // ключ допустим от 0 до alphabet.length - 1
        //  либо любой ключ приводим к этому диапазону остатком от деления
//        try {return (key % alphabet.length >=0 && key % alphabet.length <alphabet.length - 1);
//        } catch (Exception e) {
//            throw new CipherException("Некорретный ключ: " + key + "\n " + e.getMessage());
//        }
        return (key % alphabet.length >= 0 && key % alphabet.length <= alphabet.length - 1);

        //throw new UnsupportedOperationException("Метод isValidKey пока не написан");
    }

    public boolean isFileExists(String filePath) {
        // TODO проверить, что путь существует и ведет к файлу (папка не подходит)
        return (Files.exists(Path.of(filePath)) && !Files.isDirectory(Path.of(filePath)));
        //throw new UnsupportedOperationException("Метод isFileExists пока не написан");
    }
}
