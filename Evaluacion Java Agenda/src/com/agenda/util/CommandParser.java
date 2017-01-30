package com.agenda.util;


public class CommandParser {

    public static Command parse(String text) {
        // lista de comandos
        if (text.equalsIgnoreCase("q")) {
            return Command.QUIT;
        }
        if (text.equalsIgnoreCase("h")) {
            return Command.HELP;
        }
        if (text.equalsIgnoreCase("l")) {
            return Command.LIST;
        }
        if (text.equalsIgnoreCase("a")) {
            return Command.ADD;
        }
        if (text.equalsIgnoreCase("d")) {
            return Command.DELETE;
        }
    return Command.UNKNOWN;
    }
}
