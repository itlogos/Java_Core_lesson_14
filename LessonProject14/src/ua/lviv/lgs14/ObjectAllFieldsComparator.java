package ua.lviv.lgs14;

import java.util.Comparator;

public class ObjectAllFieldsComparator implements Comparator<Object>{
    
    @Override
    public int compare(Object o1, Object o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            if(o1.getQuont()> o2.getQuont()) {
                return 1;
            } else if (o1.getQuont()< o2.getQuont()) {
                return -1;
            }
        }
        
        return 0;
    }


}
