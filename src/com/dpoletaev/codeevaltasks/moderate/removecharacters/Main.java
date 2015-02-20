/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dpoletaev.codeevaltasks.moderate.removecharacters;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Митя
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line = "hello world, delf";
        process(line);
    }

    private static void process(String line) {
        String[] tokens = line.split(",");
        StringBuilder builder = new StringBuilder();
        String regexp = tokens[1].trim();
        for(int i = 0; i < tokens[0].length(); i++){
            if(!regexp.contains(String.valueOf(tokens[0].charAt(i)))){
               builder.append(tokens[0].charAt(i));
            }
        }        
        System.out.println(builder.toString().trim());
    }

}
