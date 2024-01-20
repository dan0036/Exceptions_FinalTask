package model;

import controller.ParseIncome;

import java.io.FileWriter;
import java.io.IOException;

public class DBWriter {
    public void dBWriter(String[] in) throws IOException {
        try (FileWriter fileWriter = new FileWriter(in[0] + ".txt", true)) {
            fileWriter.write(in.toString());
            System.out.println("New contact is created successfully!");
        } catch (IOException e) {
            throw new IOException("File writing problems/");
        }
    }
}
