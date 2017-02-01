package com.agenda.util;


import com.agenda.model.Contacts;
import com.agenda.model.ContactsList;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

public class Message {

    public static void printHelp() {


        System.out.println("Si escribes:\n\n" + "l --> Muestra la lista de Contactos de la Agenda\n" + "a --> Añade un Contacto a la Agenda\n"
                            + "d --> Borra un Contacto de la Agenda\n" + "q --> Salir del programa\n"
                            + "h --> Muestra esta lista de commandos\n");
    }

    public static void printUnknown() {
        System.out.println("Invalid command\nh --> help");
    }


    public static void printQuit() {

        LinkedList<Contacts> listContact = ContactsList.getList();

        List<String> dateContacs = new LinkedList<>();

        for (Contacts contact:listContact) {
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
