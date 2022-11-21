package Lesson2.Task5;

import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("Wrong configuration program. You enter arguments " + args.length);
        }
        String url = args[0];
        FileManager manager = new FileManager();

        try {
            String json = manager.downloadDataFrom(new URL(url));
            Notebook[] notebooks = manager.deserializeJsonFile(json);
            for (Notebook notebook : notebooks) {
                System.out.printf("ID: %s, Production: %s, Model: %s, Serial Number: %s%n",
                        notebook.getID(),
                        notebook.getProduction(),
                        notebook.getModel(),
                        notebook.getSn());
            }
        } catch (URISyntaxException | IOException | InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
