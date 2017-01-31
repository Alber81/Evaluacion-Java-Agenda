package com.agenda.util;


import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class ModifyFile {

    public static void createFile(String file, List<String> contactsData) throws IOException {
        FileWriter writer = new FileWriter(file);
        int size = contactsData.size();
        for (int i=0;i<size;i++) {
            String str = contactsData.get(i).toString();
            writer.write(str);
            if(i < size-1) {//This prevent creating a blank like at the end of the file**
                writer.write("\n");
            }
        }
        writer.close();
    }

    public static List<String>readFile(String fileName) {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        List<String> lines = new LinkedList<>();
        String line = null;
        try {
            while ((line = bufferedReader.readLine()) != null) {
                lines.add(line);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return lines; }
}
