/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operators;

/**
 *
 * @author audreykellogg
 */
public class Operators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        integerTest();
//        mathTest();
        incrementAndModulus();
        // TODO code application logic here
        compoundAssignmentTest();
    }

    private static void integerTest() {
        int radius = 2;
        double pi = 3.9141592653;
        double d;
        int i;

        d = pi;
        System.out.println("d = " + d);

        d = radius;
        System.out.println("d = " + d);

        i = (int) pi;
        System.out.println("i = " + i);

    }

    private static void mathTest() {
        double dfive = 5.0;
        int five = 5;
        int two = 2;
        int result;
        double dresult;

        System.out.println("5 x 2 = " + (five * two));
        System.out.println("5 / 2 = " + (five / two));

        result = five / two;
        // dresult = dfive / two;
        dresult = (double) (five / two);

        System.out.println("5 / 2 = " + result);
        System.out.println(" 5 / 5 = " + dresult);

        // result = 1 + 2 * 3;
        result = 2 * (3 + 4);

        System.out.println("result = " + result);
    }
    
    //PART 1
    private static void incrementAndModulus() {
        // I predict that the code will print the answer but the two answers will be different
        // post increment changes after the line of code 
        // pre increment changes before the line of code

        int i = 10;
        System.out.println("i = " + i);
        int n = i++ % 5;
        System.out.println("n = " + n);
        System.out.println("i = " + i);

        i = 10;
        int m = ++i % 5;
        System.out.println("m = " + m);
        System.out.println("i = " + i);
    }
    
    //PART 2
    public static void compoundAssignmentTest() {

        int result = 1 + 2; // result is now 3

        System.out.println(result);

//        result = result - 1; // result is now 2
        result -= 1; // result is now 2

        System.out.println(result);

        // result = result * 2; // result is now 4
        result *= 2;

        System.out.println(result);

       // result = result / 2; // result is now 2
        result/= 2;

        System.out.println(result);

        //result = result + 8; // result is now 10
        result += 8;

        //result = result % 7; // result is now 3
        result %= 7;

        System.out.println(result);

    }
    
    //PART 3
    
    public static void toggleValueTest (){
        
        

         //write your code here

          //declare a boolean variable called "bValue", and assign the value "false" to it

          //print out the value of "bValue"


          //call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue" 

          //print out the value of "bValue" (note: this should now be "true")


          //again call the toggleValue method using "bValue" as the parameter, and assign the result back into "bValue" 

          //print out the value of "bValue" (note: this should now be "false")

     }



    

}
