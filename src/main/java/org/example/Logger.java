package org.example;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logger {
    protected void startLog() throws IOException {
        File logs = new File("src\\main\\java\\org\\example", "logs.txt");
        do {
            logs.createNewFile();
        } while (!logs.exists());
    }

    protected static void addToLog(String text) throws IOException {
        FileWriter writer = new FileWriter("src\\main\\java\\org\\example\\logs.txt", true);
        BufferedWriter bw = new BufferedWriter(writer);
        bw.write(text);
        bw.close();
    }
}
