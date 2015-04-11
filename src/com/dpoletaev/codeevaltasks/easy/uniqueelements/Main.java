package com.dpoletaev.codeevaltasks.easy.uniqueelements;


import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        String line = "7,8,9,10,11,12,13,14";
        String[] tokens = line.split(",");
        Set<Integer> set = new TreeSet<Integer>();
        for (String s : tokens) {
            set.add(Integer.valueOf(s));
        }
        StringBuilder builder = new StringBuilder();
        Iterator<Integer> it = set.iterator();
        while (true) {
            builder.append(it.next());
            if (it.hasNext()) {
                builder.append(",");
            } else {
                break;
            }
        }
        System.out.println(builder.toString());
    }
}
