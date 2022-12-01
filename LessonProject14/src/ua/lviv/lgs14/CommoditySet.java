package ua.lviv.lgs14;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.TreeSet;

public class CommoditySet {
    Scanner scan = new Scanner(System.in);

    LinkedHashSet<Commodity> commodity = new LinkedHashSet<>();

    Commodity com = new Commodity();

    public void addAllProduct() {

        commodity.add(new Commodity("toy", 250, 40, 12));
        commodity.add(new Commodity("pillow", 210, 10, 93));
        commodity.add(new Commodity("pen", 76, 15, 34));
        commodity.add(new Commodity("chair", 54, 8, 9));
        commodity.add(new Commodity("armchair", 12, 34, 10));
        commodity.add(new Commodity("table", 32, 5, 22));
        commodity.add(new Commodity("suitcase", 45, 3, 1));
        commodity.add(new Commodity("book", 98, 6, 32));
        System.out.println("Before sort elements in descending order :");
        for (Commodity commo : commodity) {
            System.out.print(commo);
        }

    }

    public void addProduct() {

        int length = getRandomValue(20, 150);
        int wide = getRandomValue(3, 40);
        int weight = getRandomValue(3, 55);

        String text = "Enter name of product (the rest of the data will be generated randomly): ";
        String name = readText(text);

        commodity.add(new Commodity(name, length, wide, weight));
        System.out.println("After the element is added :");
        for (Commodity commo : commodity) {
            System.out.print(commo);
        }
    }

    public void removeProduct() {

        Iterator<Commodity> iterator = commodity.iterator();
        String text = "Enter name of product";

        String name1 = readText(text);

        while (iterator.hasNext()) {
            Commodity line = iterator.next();
            if (line.getName().equals(name1)) {
                iterator.remove();
            }
        }

        System.out.println("After the element is removed :");
        for (Commodity commo : commodity) {
            System.out.print(commo);
        }
    }

    public void replaceProduct() {
        Iterator<Commodity> iterator = commodity.iterator();
        int length = getRandomValue(20, 150);
        int wide = getRandomValue(3, 40);
        int weight = getRandomValue(3, 55);

        String text = "Enter name of product for replacement: ";
        String name1 = readText(text);
        String text1 = "Enter name of product to be inserted (the rest of the data will be generated randomly): ";
        String name2 = readText(text1);
        while (iterator.hasNext()) {
            Commodity line = iterator.next();
            if (line.getName().equals(name1)) {
                iterator.remove();
            }
        }
        commodity.add(new Commodity(name2, length, wide, weight));
        System.out.println("After :");
        for (Commodity commo : commodity) {
            System.out.print(commo);
        }
    }

    public void sortName() {
        TreeSet<Commodity> commodityTree = new TreeSet<>(new CommodityNameComparator());
        commodityTree.addAll(commodity);
        System.out.println("\nAfter sort elements :");
        for (Commodity commo2 : commodityTree) {
            System.out.print(commo2);
        }
    }

    public void sortLength() {
        TreeSet<Commodity> commodityTree = new TreeSet<>(new CommodityLengthComparator());
        commodityTree.addAll(commodity);
        System.out.println("\nAfter sort elements :");
        for (Commodity commo2 : commodityTree) {
            System.out.print(commo2);
        }

    }

    public void sortWidth() {
        TreeSet<Commodity> commodityTree = new TreeSet<>(new CommodityWidthComparator());
        commodityTree.addAll(commodity);
        System.out.println("\nAfter sort elements :");
        for (Commodity commo2 : commodityTree) {
            System.out.print(commo2);
        }

    }

    public void sortWeight() {
        TreeSet<Commodity> commodityTree = new TreeSet<>(new CommodityWeightComparator());
        commodityTree.addAll(commodity);
        System.out.println("\nAfter sort elements :");
        for (Commodity commo2 : commodityTree) {
            System.out.print(commo2);
        }

    }

    public void displayElement() {

        String text = "Enter index: ";
        int index = readText2(text);

        Iterator<Commodity> it = commodity.iterator();

        int currIndex = 0;
        Commodity CurrentElement = null;

        while (it.hasNext()) {

            CurrentElement = it.next();

            if (currIndex == index - 1) {
                System.out.println("Element at index " + index + " is : " + CurrentElement);
                break;
            }

            currIndex++;
        }
    }

    public void exit() {
        System.out.println("exit...");
        System.exit(0);
    }

    public String readText(String text) {
        System.out.println(text);
        String input = scan.next();
        return input;
    }

    public int readText2(String text) {
        System.out.println(text);
        int input = scan.nextInt();
        return input;
    }

    public int getRandomValue(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("min value must be smaller than max value");
        }

        Random r = new Random();
        return r.nextInt(max - min + 1) + min;
    }

}

class CommodityNameComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        }
        return 0;
    }

}

class CommodityLengthComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getLength() > o2.getLength() ? 1 : -1;
    }

}

class CommodityWidthComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getWidth() > o2.getWidth() ? 1 : -1;
    }

}

class CommodityWeightComparator implements Comparator<Commodity> {

    @Override
    public int compare(Commodity o1, Commodity o2) {
        return o1.getWeight() > o2.getWeight() ? 1 : -1;
    }

}
