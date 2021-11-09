/**
*Calculator.java
*This is a calculator class to perform mathematical operations for getting
* the input from the user called
*  Method for addition int value  (+) called add
*  Method for addition double value (+) called add1
*  Method for subtraction int value (-) called subtract
*  Method for subtraction double value (-) called subtract1
*  Method for multyplyng int value (*) called multiple
*  Method for multyplyng double value (*) called multiple1
*  Method for division int value (/) called division
*  Method for division int value (/) called division1
*  Method for fractorial int value (!) called factorial
*  Method for sasAreaOfTriangle double value (△) called sasAreaOfTriangle
*/

public class Calculator


{
    // This method add passing int values and return sum  method
    public int add(int number1, int number2)
    
    {
        int result = 0;
        
        result = number1 + number2;
        
        return result;
    }
    // This method subtract passing int values and return sum  method
    public int subtract(int number1, int number2)
    {
        int result = 0;
        
        result = number1 - number2;
        
        return result;  
    }
    
    // This method multiply passing int values and return sum method
    public int multiple(int number1, int number2)
    {
        int result=0;
        
        
        result = number1 * number2;
        
        return result;
    }

    // This method divide passing int values and return sum method
    public int division(int number1, int number2)
    {
        int result=0;
        
        result = number1 / number2;
        
        return result;
    }
    
     // This method fractorial passing int values and return sum method
     //Note that this method throws an exception when  is zero.
    public int factorial(int number)
    {
        if(number==0)
            return 0;
        if(number>1){
           number  = number * factorial(--number);
        }
        
        return number;
    }
    
    // This method add passing double values and return sum method
     public double add1(double number1, double number2)
    {
        double result = 0;
        
        result = number1 + number2;
        
        return result;
    }
    
    // This method subtract passing double values and return sum method
     public double subtract1(double number1, double number2)
    {
        double result = 0;
        
        result = number1 - number2;
        
        return result;
    }
    
    
    // This method multiple passing double values and return sum method
    public double multiple1(double number1, double number2)
    {
        double result=0;
        
        result = number1 * number2;
        
        return result;
    }
    
    
    // This method divide passing double values and return sum method
     public double division1(double number1, double number2)
    {
        double result=0;
        
        result = number1 / number2;
        
        return result;
    }
     
     /** This method converts an angle measured in degrees to an approximately 
     equivalent angle measured in radians then multiple input by double values and return sum */
    public double sasAreaOfTriangle(double sideA, double sideB, double degs)
    {
        //convert the angle from degrees to radians
        double radians = Math.toRadians(degs); 
        
        double area=(double)((sideA*sideB)/2)*(Math.sin(radians));
        
        return area;
    }



}
