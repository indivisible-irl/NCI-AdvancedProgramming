/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package t08_Exceptions;

/**
 *
 * @author Mark
 */
public class DivZeroEx {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try
        {
            
        	int num = 10;
        	int denom = 0;
        
        	int answer = num/denom;
        }
        catch(ArithmeticException ae)
        {
            System.out.println(ae.toString());
        }
        
    }
    
}
