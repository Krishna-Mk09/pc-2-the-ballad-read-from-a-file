package com.jap.ballad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * It reads the content of a file and returns the content of the file
 */
public class Ballad {
    // Reading the file and returning the content of the file.
    public String readInputFromAFile(String fileName) {
        String output = "";
        int lineCount = 0;
        try (FileReader reader = new FileReader(fileName); BufferedReader bufferedReader = new BufferedReader(reader)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                lineCount++;
                output = output.concat(line + "\n");
            }
        } catch (FileNotFoundException ex) {
            throw new RuntimeException(ex);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return output;
    }
}