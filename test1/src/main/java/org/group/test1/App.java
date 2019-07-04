package org.group.test1;

import org.group.model.Constant;

/**
 *@author Neelam,
 *This class is used to Generate Number to word
 * 
 */
public class App 
{
	
	/**
	 * This method is used as Util method
	 * @param number
	 * @return
	 */
	private String convertTowordUtil(int number) {
        String current;
        
        if (number % 100 < 20){
            current = Constant.names1[number % 100];
            number /= 100;
        }
        else {
            current = Constant.names1[number % 10];
            number /= 10;
            
            current = Constant.names2[number % 10] + current;
            number /= 10;
        }
        if (number == 0) return current;
        return Constant.names1[number] + " hundred" + current;
    }
	
	
	/**
	 * This method is used to Convet the Number toword
	 * @param number
	 * @return
	 */
	public String convert(int number) {

        if (number == 0) { return "zero"; }
        
        String prefix = "";
        
        if (number < 0) {
            number = -number;
            prefix = "negative";
        }
        
        String current = "";
        int place = 0;
        
        do {
            int n = number % 1000;
            if (n != 0){
                String s = convertTowordUtil(n);
                current = s + Constant.names3[place] + current;
            }
            place++;
            number /= 1000;
        } while (number > 0);
        
        System.out.println("*** " + (prefix + current).trim());
        return (prefix + current).trim();
    }
    
	
    public static void main( String[] args )
    {
    	
    	        App obj = new App();
    	        System.out.println("*** " + obj.convert(123456789));
    	        System.out.println("*** " + obj.convert(-55));
    	   
    	}
    }