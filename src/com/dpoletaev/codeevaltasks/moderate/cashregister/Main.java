package com.dpoletaev.codeevaltasks.moderate.cashregister;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by mitya on 21.02.2015.
 */
public class Main {


    static Map<Integer, String> nominalMap = new HashMap<>();
    static Integer[] nominals = {1, 5, 10, 25, 50, 100, 200, 500, 1000, 2000, 5000, 10000};

    static {
        String[] names = {"PENNY", "NICKEL", "DIME", "QUARTER", "HALF DOLLAR", "ONE", "TWO", "FIVE", "TEN", "TWENTY",
                "FIFTY", "ONE HUNDRED"};
        for (int i = 0; i < nominals.length; i++) {
            nominalMap.put(nominals[i], names[i]);
        }
    }


    public static void main(String[] args) {
        String line = "1.05;2.10";
        String[] tokens = line.split(";");
        System.out.println(calculateRet((int) (Double.parseDouble(tokens[0]) * 100), ((int) (Double.parseDouble(tokens[1]) * 100))));
    }


    private static String calculateRet(int price, int cash) {
        int ret = cash - price;
        if (ret < 0) {
            return "ERROR";
        }
        if (ret == 0) {
            return "ZERO";
        }
        StringBuilder builder = new StringBuilder();

        while (ret > 0) {
            int i = nominals.length - 1;
            while (i >= 0) {
                if (ret < nominals[i]) {
                    i--;
                } else {
                    if (builder.length() > 0) {
                        builder.append(',');
                    }
                    builder.append(nominalMap.get(nominals[i]));
                    ret -= nominals[i];
                }
            }
        }
        return builder.toString();
    }
}
