package com.agenda.model;

import com.agenda.util.Prompt;

import java.util.LinkedList;

public class ContactsList {

    private static LinkedList<Contacts> list = new LinkedList<>();

    public static LinkedList<Contacts> getList() {
        return list;
    }

    public static void setList(LinkedList<Contacts> list) {
        ContactsList.list = list;
    }

    public static void printList() {
        if (list.size() == 0) {
            System.out.println("No Contacts!");
        } else {
            for (Contacts contacts : list) {
                System.out.println(ContactsList.list.indexOf(contacts) + " = " + contacts.getName() + " = "
                        + contacts.getPhone() );
            }
        }
    }

    public static void add() {
        System.out.print("Name: ");
        String nameContact = Prompt.read();
        System.out.print("Phone: ");
        String phoneContact = Prompt.read();

        Contacts contacts = new Contacts(nameContact, phoneContact);
        list.add(contacts);

        System.out.println("Saved new contact!");
    }

    public static void delete() {
        try {
            System.out.print("Position to delete?: ");
            String position = Prompt.read();

            for (int i = 0; i < position.length(); i++) {
                String digitoCadena = "" + position.charAt(i);
                int digito = Integer.parseInt(digitoCadena);

                if (digito >= list.size()) {
                    System.out.println("Error!");

                } else {
                    ContactsList.list.remove(digito);
                    System.out.println("Delete contact!");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error!");
        }
    }

}
