package com.dpoletaev.codeevaltasks.moderate.findloop;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Митя
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        File file = new File("findCycle");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            printArr(getCycle(line));
            System.out.println();
        }
    }

    private static void printArr(String[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(" ");
            System.out.print(arr[i]);
        }
    }

    public static String[] getCycle(String line) {
        String[] tokens = line.split(" ");
        Map<String, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < tokens.length; i++) {
            if (map.containsKey(tokens[i])) {
                for (Integer j : map.get(tokens[i])) {
                    int length = getCycleLength(i, j, tokens);
                    if (length > 0) {
                        String[] arr = new String[length];
                        System.arraycopy(tokens, i, arr, 0, length);
                        return arr;
                    }
                }
            } else {
                map.put(tokens[i], Arrays.asList(i));
            }
        }
        return null;
    }

    static int getCycleLength(int currentIndex, int prevIndex, String[] arr) {
        int start = currentIndex;
        currentIndex++;
        prevIndex++;
        while (prevIndex < start && currentIndex < arr.length) {
            if (!arr[prevIndex].equals(arr[currentIndex])) {
                return -1;
            }
            currentIndex++;
            prevIndex++;
        }
        return currentIndex - start;
    }

}
