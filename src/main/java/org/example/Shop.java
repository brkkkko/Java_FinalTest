package main.java.org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Shop {

    public static void fieldRequest(){
        ArrayList<Notebook> set = new ArrayList<>();
        set.add(Storage.noteBook1);
        set.add(Storage.noteBook2);
        set.add(Storage.noteBook3);
        set.add(Storage.noteBook4);
        set.add(Storage.noteBook5);
        set.add(Storage.noteBook6);
        set.add(Storage.noteBook7);
        set.add(Storage.noteBook8);
        set.add(Storage.noteBook9);
        set.add(Storage.noteBook10);
        set.add(Storage.noteBook11);
        String[] fields = {"Year", "Color", "Display size", "Processor frequency", "Processor cores",
                "RAM", "USB-ports", "OS", "Price"};
        int fieldSearch = 0;
        String fieldResearch = """
                1 - Year,
                2 - Color,
                3 - Display size,
                4 - Processor frequency,
                5 - Processor cores,
                6 - OS,
                7 - USB-ports,
                8 - OS,
                9 - Price.
                """;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose category to search: ");
        System.out.println(fieldResearch);
        String field = scan.nextLine();
        if(field.equals("1")){
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultIntYear(set, Integer.parseInt(userValue));
        } else if (field.equals("3")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultIntScreen(set, Integer.parseInt(userValue));
        } else if (field.equals("4")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultIntFreaquncy(set, Integer.parseInt(userValue));
        } else if (field.equals("5")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultIntCore(set, Integer.parseInt(userValue));
        } else if (field.equals("6")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultIntRam(set, Integer.parseInt(userValue));
        } else if (field.equals("7")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultIntUSB(set, Integer.parseInt(userValue));
        } else if (field.equals("2") || field.equals("8")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultStr(set, userValue);
        } else if (field.equals("9")) {
            String userValue;
            System.out.println(String.format("Input %s:", fields[Integer.parseInt(field) - 1]));
            userValue = scan.nextLine();
            Notebook.getResultDouble(set, Double.parseDouble(userValue));
        } else{
            System.out.println("Undefined");
        }
    }
}