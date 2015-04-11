package com.dpoletaev.codeevaltasks.moderate.numberpairs;

/**
 * Created by Митя on 21.02.2015.
 */
public class Main {
    public static void main(String[] args) {
        String line = "1,2,3,4;50";
        int sepIndex = line.indexOf(';');
        int sum = Integer.valueOf(line.substring(sepIndex + 1));
        String[] nums = line.substring(0, sepIndex).split(",");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            int val = Integer.valueOf(nums[i]);
            if (sum / val < 2) {
                continue;
            }
            int currSum = 0;
            for (int j = i + 1; j < nums.length && currSum < sum; j++) {
                int right = Integer.valueOf(nums[j]);
                currSum = val + right;
                if (currSum == sum) {
                    if (builder.length() > 0) {
                        builder.append(';');
                    }
                    builder.append(val).append(',').append(right);
                }

            }

        }
        System.out.println(builder.length() == 0 ? "NULL" : builder.toString());

    }

}
