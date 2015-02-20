
package com.dpoletaev.codeevaltasks.moderate.decodenumbers;

/**
 *
 * @author Митя
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String line = "066616";
        process(line);
    }
    
    private static void process(String line){     
       int result = 0, temp = 0, prev = 0;
       for(int index = 0; index < line.length(); index++){
             if(index < line.length() - 1 && line.charAt(index) != '0' && Integer.valueOf(line.substring(index, index + 2)) <= 26){
                temp = result;
                result = result + 1 + prev;
                prev = temp;
             }
       }      
        System.out.println(++result);
    }
    
}
