
package com.dpoletaev.codeevaltasks.moderate.mthpath;


import java.io.*;

/**
 *
 * @author Митя
 */
public class Main {

    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            process(line);
        }
        
    }
    
    private static void process(String line){
        String[] tokens = line.split(" ");
        int index = Integer.parseInt(tokens[tokens.length-1]);
        if(index < tokens.length + 1){
            System.out.println(tokens[tokens.length - 1 - index]);
        }
    }
    
}
