package oop.md.office;

import java.util.List;
import java.util.ArrayList;

public class Computers {
        String name;
        List<String> computers = new ArrayList<>();

    public Computers() {
    computers.add("Lenovo");
    computers.add("Dell");
    }
    public List<String> getComputers() {
        return computers;
 }
    public void addComputers(String name){
        computers.add(name);
 }
    public void delComputers(String name){
        computers.remove(name);
}
    @Override
    public String toString() {
        return "Computers{" +
                "name='" + name + '\'' +
                ", computers=" + computers +
                '}';
    }
}

