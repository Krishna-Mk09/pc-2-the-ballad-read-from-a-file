package com.jap.ballad;

import java.io.*;

public class Ballad {
    public String readInputFromAFile(String fileName) {
        String output = "";
        int lineCount = 0;
        // Write the logic to read from a file
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