/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t08_Exceptions;

import java.util.*;
/**
 *
 * @author Mark
 */
public class OutOfRange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> names = new ArrayList<>();
        names.add("Paul");
        names.add("Peter");
        
        try
        {
        	String name = names.get(3);
        }
        catch(IndexOutOfBoundsException iobe)
        {
            System.out.println(iobe.toString());
        }
        
    }
}
