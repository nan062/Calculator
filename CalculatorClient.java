/**
* CalculatorClient.java
* 
* In this Program I am making a simple calculator that performs addition, subtraction,
* multiplication, division, factorial, and area of a triangle based on the user input. 
* 
* The program takes the value of both the numbers from integer or double.
* 
* For add, subtract, multiply, divide the program will let the user choose 
* what type of data the number they want to calculate, integer or doule. 
* 
* For factorial the user only can use integers value, and for area of triangle, 
* the user only can use doubles value.
*/
public class CalculatorClient extends ConsoleProgram
{
    public void run()
    {
    // Initialize the counter int variables to 0;
        int int1 = 0;
        int int2 = 0;
        int intResult = 0;
        int userOperationSelect = 0;
        int dataTypeSelect = 0;
        int factNumber = 0;
        int factResult = 0;
     
       // Initialize the counter double variables to 0;
        double double1 = 0;
        double double2 = 0; 
        double angleInDegrees = 0;
        double doubleResult = 0;
        double sideA = 0;
        double sideB = 0;
        double areaOfTriangle = 0;
        
        //code references
        Calculator calculator = new Calculator();
        
      
        
    /* a loop until user choose to exit the program */
  for(int i = 1; i == i; i++){ 
      
    {
        System.out.println();
        System.out.println("Welcome to the Space XYZ Inc. Calculator!!!");
        System.out.println();
        System.out.println();
        
     // print out the menu to let user select
     {
        System.out.println("Please choose one of the following:");
        System.out.println();
        System.out.println("1-Addition");
        System.out.println("2-Subtraction");
        System.out.println("3-Multiplication");
        System.out.println("4-Division");
        System.out.println("5-Factorial Number");
        System.out.println("6-SasArea of Triangle");
        System.out.println("7-Exit Calculator");
        
        System.out.println();
        System.out.println();
     }
    
        System.out.println();
        
        //ask for user to select
        userOperationSelect = readInt("Please enter your selection-->");
        System.out.println();
        
        // if user input 7, this logic will stop calculator)
         if (userOperationSelect == 7 )
         
         {
             System.out.println();
             System.out.println("Thanks for your using This Electronic Calculator!");
             System.exit(0);
         }
        
        // print out reminder message if user input biger then 7 or less then 1 number, then return to the user select )
        if (userOperationSelect > 7 || userOperationSelect < 1)
        
        {
           System.out.println();
           System.out.println("You typed the Worng number, Please Re enter！！！"); 
           System.out.println();
           System.out.println();
           continue;
        }
        
        
        // interger and double vlaue select only for 1 - 4 options, not 5 and 6 options )
        if(userOperationSelect < 5)
        {
            System.out.println("Please choose one of the following:");
            System.out.println();
            //print out data type select to let user choose. 
            System.out.println("1-Integers"); 
            System.out.println("2-Doubles");
            
            dataTypeSelect = readInt("Please enter your selection-->"); // ask for user to select integers or doubles for input.
            System.out.println();
        }
        
        // data type input only for integer value and for add, subtract, multply and divide operations.
        if (dataTypeSelect == 1 && userOperationSelect != 5 && userOperationSelect != 6 )
        {
            // ask the user to enter first int number
            int1 = readInt("Enter your first integer-->");
            System.out.println();
            // ask the user to enter second int number
            int2 = readInt("Enter your second integer-->");
        }
        
        // data type input only for double value and for add, subtract, multply and divide operations.
        else if(dataTypeSelect == 2 && userOperationSelect != 5 && userOperationSelect != 6)
        {   
            // ask the user to enter first double number
            double1 = readDouble("Enter your first double-->");
            System.out.println();
            // ask the user to enter second double number
            double2 = readDouble("Enter your second double-->");
        }
        
        // print out message when user select worng data type then return to the menu.
         else if(userOperationSelect < 5)
        {
           
           System.out.println();
           System.out.println("You Do Not Choose 1 or 2, Go back to The Menu！！！");
           System.out.println();
           
          
        }
        
        
        //logic only for integer addition
        if (dataTypeSelect == 1 && userOperationSelect == 1 )
        {
            //int addition
            System.out.println();
            //Calling add method to get sum of 
            intResult = calculator.add(int1, int2);
            
            // Displays result in TextField
            System.out.println("The result of your addition is:" + intResult);
            System.out.println();
            System.out.println("Return to the Menu!!!");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
        }
        
        //logic only for double addition
        else if (dataTypeSelect == 2 && userOperationSelect == 1 )
        {
            //double addition
            System.out.println();
            //Calling add method to get sum of 
            doubleResult = calculator.add1(double1,double2);
            
            // Displays result in TextField
            System.out.println("The double result of your addition is:" + doubleResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
        }
            
        
        //logic only for int subtract
        else if(dataTypeSelect == 1 && userOperationSelect == 2)
        {
            //int subtraction
            System.out.println();
            
            //Calling add method to get sum of 
            intResult = calculator.subtract(int1,int2);
            
            // Displays result in TextField
            System.out.println("The result of your subtraction is:" + intResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
        }
        
        //logic only for double subtract
        else if(dataTypeSelect == 2 && userOperationSelect == 2)
        {
            //double subtraction
            System.out.println();
            
            //Calling add method to get sum of 
            doubleResult = calculator.subtract1(double1,double2);
            
            // Displays result in TextField
            System.out.println("The double result of your subtraction is:" + doubleResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
         
        }
        
        
         //logic only for int mutiply
        else if(dataTypeSelect == 1 && userOperationSelect == 3)
        {
            //int Multiplication
            System.out.println();
            
            //Calling add method to get sum of 
            intResult = calculator.multiple(int1,int2);
            
            // Displays result in TextField
            System.out.println("The result of your Multiplication is:" + intResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
           
        }
        
        //logic only for double mutiply
         else if(dataTypeSelect == 2 && userOperationSelect == 3)
        {
            //double Multiplication
            System.out.println();
            
            //Calling add method to get sum of 
            doubleResult = calculator.multiple1(double1,double2);
            
            // Displays result in TextField
            System.out.println("The result of your double multiplication is:" + doubleResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
          
        }
        
        //logic only for int division
         else if(dataTypeSelect == 2 && userOperationSelect == 4)
        {
            //double division
            System.out.println();
            
            //Calling add method to get sum of 
            doubleResult = calculator.division1(double1,double2);
            
            // Displays result in TextField
            System.out.println("The result of your double division is:" + doubleResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
       
        }
        
        
        //logic only for double division
        else if(dataTypeSelect == 1 && userOperationSelect == 4)
        {    
            //int division
            System.out.println();
            
            //Calling add method to get sum of 
            intResult = calculator.division(int1,int2);
            
            // Displays result in TextField
            System.out.println("The result of your division is:" + intResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
        }    
        
         //logic only for int value factorial
        if (userOperationSelect == 5 )
        {
            factNumber = readInt("Please enter the number you want Factorial -->");
             // ask the user to enter number
         
            {//Calling factorial method to get sum of 
            factResult = calculator.factorial(factNumber);
            System.out.println();
            
            // Displays result in TextField
            System.out.println("The result of your Factorial number is:" + factResult);
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            }
        }
        
        //logic only for double value sasAreaOfTriangle
        if(userOperationSelect == 6)
        {
            sideA = readInt("Please enter the Side 1 -->");
             // ask the user to enter first side number
            System.out.println();
            sideB = readInt("Please enter the Side 2 -->");
            // ask the user to enter two side number
            System.out.println();
            angleInDegrees = readInt("Please enter the Angle -->");
            // ask the user to enter angle degree number
            
         
            {{//Calling sasAreaOfTriangle method to get sum of 
            areaOfTriangle = calculator.sasAreaOfTriangle(sideA,sideB,angleInDegrees);
            
            System.out.println();
            // Displays result in TextField
            System.out.println("The result of your Area of a triangle is :" + areaOfTriangle);
            
            System.out.println();
            System.out.println("Return to the Menu");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println();
            
            }
            
        }
        
        
       
    }
    }   
        
        
    }    
    }
}
