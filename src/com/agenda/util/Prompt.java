package com.agenda.util;

import com.agenda.model.ContactsList;

import java.io.File;
import java.util.Scanner;

public class Prompt {

    public static void init() {
        File agenda = new File("agenda.txt");
        if (agenda.exists()){
            ModifyFile.readContactTxt();
        }
    }

    public static void print() {
        System.out.print("(" + ContactsList.getList().size() + ") " + "> ");
    }

    public static String read() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

}
