package com.agenda.util;

import com.agenda.model.Contacts;
import com.agenda.model.ContactsList;

import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Message {

    public static void printHelp() {
        System.out.println("\nIf you write:\n" + "l --> Show the Contact list\n" + "a --> Add Contact to list\n"
                            + "d --> Delete a Contact\n" + "q --> Exit\n"
                            + "h --> Show this command list\n");
    }

    public static void printUnknown() {
        System.out.println("\nInvalid command\nh --> help\n");
    }

    public static void printQuit() {

        LinkedList<Contacts> listContact = ContactsList.getList();

        List<String> dateContacs = new LinkedList<>();

        if (ContactsList.getList().size() == 0){
            File agenda = new File("agenda.txt");
            if(agenda.delete()) {
                System.out.println("Bye!");
            }
        } else {
            for (Contacts contact : listContact) {

                dateContacs.add(contact.getName() + "\n" + contact.getPhone());
                try {
                    ModifyFile.createFile("agenda.txt", dateContacs);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Bye!");
        }
    }

}
