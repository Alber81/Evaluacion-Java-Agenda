package com.agenda;

import com.agenda.model.Contacts;
import com.agenda.model.ContactsList;
import com.agenda.util.Command;
import com.agenda.util.CommandParser;
import com.agenda.util.Message;
import com.agenda.util.Prompt;

public class Main {

    public static void main(String[] args) {

        boolean end = false;

        System.out.println("Welcome to Contacts!" + "\n");

        while (!end) {
            Prompt.print();

            String command = Prompt.read();
            Command com = CommandParser.parse(command);

        switch (com) {

            case HELP:
                Message.printHelp();
                break;
            case LIST:
                ContactsList.printList();
                break;
            case ADD:
                ContactsList.add();
                break;
            case DELETE:
                ContactsList.delete();
                break;
            case QUIT:
                Message.printQuit();
                end = true;
                break;
            case UNKNOWN:
                Message.printUnknown();
                break;

        }
        }
    }
}
