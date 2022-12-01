package ua.lviv.lgs14;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {

        CommoditySet product = new CommoditySet();
        System.out.println("Part 1 \n");

        Set<Object> setObject = new HashSet<>();
        setObject.add(new Object("Igor", 25));
        setObject.add(new Object("Ulia", 17));
        setObject.add(new Object("Oleg", 68));
        setObject.add(new Object("Oleg", 28));
        setObject.add(new Object("Oleg", 12));
        setObject.add(new Object("Ivan", 11));
        setObject.add(new Object("Mykola", 45));
        setObject.add(new Object("Sema", 76));
        setObject.add(new Object("Sema", 86));
        setObject.add(new Object("Dima", 43));
        System.out.println("Before sort elements :");
        for (Object object : setObject) {
            System.out.println(object);
        }
        TreeSet<Object> setObject1 = new TreeSet<>(new ObjectAllFieldsComparator());

        setObject1.addAll(setObject);

        System.out.println("\nAfter sort elements :");
        for (Object object : setObject1) {
            System.out.println(object);
        }
        System.out.println("\n Part 2 \n");
        product.addAllProduct();
        while (true) {
            String text = "\nEnter values:"

                    + "\n 1-For add product, " + "\n 2-For remove product, " + "\n 3-For replace the product, "
                    + "\n 4-For sort by name, " + "\n 5-For sort by length, " + "\n 6-For sort by width, "
                    + "\n 7-For sort by weight," + "\n 8-For display the i-th element,"
                    + "\n 9-For exit the program, \n";

            int choice = readText(text);

            switch (choice) {
            case 1:
                product.addProduct();
                break;
            case 2:
                product.removeProduct();
                break;

            case 3:
                product.replaceProduct();
                break;

            case 4:
                product.sortName();
                break;
            case 5:
                product.sortLength();
                break;
            case 6:
                product.sortWidth();
                break;
            case 7:
                product.sortWeight();
                break;
            case 8:
                product.displayElement();
                break;
            case 9:
                product.exit();
                break;

            }
        }

    }

    public static int readText(String text) {
        Scanner scan = new Scanner(System.in);
        System.out.println(text);
        int input = scan.nextInt();
        return input;
    }

}
