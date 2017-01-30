package com.agenda.util;


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
        System.out.println("Bye!");

    }

}
