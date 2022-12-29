package main.java.org.example;

import java.lang.reflect.Array;
import java.util.*;

public class Notebook {
    public int year;
    public String colour;
    public int screenSize;
    public int procFrequency;
    public int procCores;
    public int ram;
    public int usbQuantity;
    public String operationSystem;
    public double price;

    public Notebook(int year, String colour, int screenSize, int procFrequency, int procCores, int ram, int usbQuantity, String operationSystem, double price){
        this.year = year;
        this.colour = colour;
        this.screenSize = screenSize;
        this.procFrequency = procFrequency;
        this.procCores = procCores;
        this.ram = ram;
        this.usbQuantity = usbQuantity;
        this.operationSystem = operationSystem;
        this.price = price;

    }

    public static void printer(ArrayList<Notebook> setResult){
        System.out.println("The following results were found: ");
        for (Notebook item: setResult) {
            System.out.println(String.format(" Year - %d,\n color - %s,\n display size - %d,\n processor frequency - %d,\n processor cores - %d," +
                            "\n RAM - %d,\n USB-ports - %d,\n OS - %s,\n price - %.2f", item.year, item.colour,
                    item.screenSize, item.procFrequency, item.procCores, item.ram, item.usbQuantity, item.operationSystem, item.price));
            System.out.println();
            System.out.println("===================================================================================");
            System.out.println();

        }
    }

    public static ArrayList<Notebook> getResultIntYear(ArrayList<Notebook> set, int userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.year <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Notebook> getResultIntScreen(ArrayList<Notebook> set, int userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.screenSize <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Notebook> getResultIntFreaquncy(ArrayList<Notebook> set, int userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.procFrequency <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Notebook> getResultIntCore(ArrayList<Notebook> set, int userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.procCores <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Notebook> getResultIntRam(ArrayList<Notebook> set, int userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.ram <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }
    public static ArrayList<Notebook> getResultIntUSB(ArrayList<Notebook> set, int userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.usbQuantity <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }
    public static ArrayList<Notebook> getResultDouble(ArrayList<Notebook> set, double userValue) {
        ArrayList<Notebook> setCollection = new ArrayList<>();
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.price <= userValue) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }

    public static ArrayList<Notebook> getResultStr(ArrayList<Notebook> set, String userValue) {
        ArrayList<Notebook> setResult = new ArrayList<>();
        for (Notebook item: set) {
            if (item.colour.equals(userValue) || item.operationSystem.equals(userValue)) {
                setResult.add(item);
            }
        }
        printer(setResult);
        return setResult;
    }
}
