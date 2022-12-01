package ua.lviv.lgs14;

public class Object implements Comparable<Object> {
    private String name;
    private int quont;
    
    
    public Object(String name, int quont) {
        this.name = name;
        this.quont = quont;
    }
    public Object() {
        }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getQuont() {
        return quont;
    }


    public void setQuont(int quont) {
        this.quont = quont;
    }


    @Override
    public String toString() {
        return "name=" + name + ", quont=" + quont;
    }
    @Override
    public int compareTo(Object o) {
        return this.name.compareTo(o.getName());
    }

    
}
