package com.dpoletaev.codeevaltasks.moderate.reversegroups;

import java.util.Arrays;

/**
 * Created by mitya on 21.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        String line = "1,2,3,4,5,6;3";
        int sepIndex = line.indexOf(";");
        int portion = Integer.valueOf(line.substring(sepIndex + 1));
        String[] nums = line.substring(0, sepIndex).split(",");
        for (int start = 0, end = start + portion; end <= nums.length; start = start + portion, end = end + portion) {
            String[] temp = new String[portion];
            for (int i = 0; i < portion; i++) {
                temp[temp.length - i - 1] = nums[start + i];
            }
            System.arraycopy(temp, 0, nums, start, portion);
        }
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            if (builder.length() > 0) {
                builder.append(',');
            }
            builder.append(nums[i]);
        }
        System.out.println(builder.toString());
    }
}
