package com.agenda.util;


import com.agenda.model.ContactsList;

import java.util.Scanner;

public class Prompt {
    public static void print() {

        System.out.print("(" + ContactsList.getList().size() + ") " + "> ");
    }

    public static String read() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextLine();
    }

    public static int readNumber() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }
}
