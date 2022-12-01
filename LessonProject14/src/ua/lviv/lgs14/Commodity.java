package ua.lviv.lgs14;

public class Commodity implements Comparable<Commodity>{

    private String name;
    private int length;
    private int width;
    private int weight;

    
    public Commodity(String name, int length, int width, int weight) {
        this.name = name;
        this.length = length;
        this.width = width;
        this.weight = weight;
    }

    public Commodity() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "\n name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight;
    }

    @Override
    public int compareTo(Commodity o) {
        return 0;
    }

}
