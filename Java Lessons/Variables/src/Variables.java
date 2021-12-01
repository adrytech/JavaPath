public class Variables {

    public static void main(String[] args) {
/*

        TYPE OF VARIABLES:

        Primitive:

                        NUMBER

            - byte      --> from -128 to +127
            - short     --> from -32_768 to +32_767
            - int       --> from -2^31 to +2^31-1
            - long      --> from -2^63 to +2^63-1

            - float     --> for number with "." with 6/7 decimal digits
            - double    --> for number with "." with 15 decimal digits

                        CHARACTERS

            - char      --> for the characters as §,€,£,$,%,'\u0163' ...

                        TRUE OR FALSE

            - boolean   --> 0 / 1 = true / false


        Reference

            - String    --> for the text
           ...
*/
        // PRIMITIVE

        // Syntax = varibles nameVariables = object;

        byte b = -12;
        short s = 30_000;
        int i = 2_000_000_000;              // I can use _ to separate number
        long l = 3_000_000_000_000_000L;    // Add L at the end of the number

        float f = 2.238493F;                // Add L at the end of the number
        double d = 2.090182345656712;

        char c = '£';                       // Use '' to contain characters

        boolean light = true;               // Use true or false and not 0 or 1

        // REFERENCE

        // Syntax = Variable nameVariable = "object";

        String welcome = "Hello in to the Java Lessons by AdryTech";

        // Other reference can be created in the future


        // PRINT

        // For print to screen one Variables I can use this Class!

        System.out.println(d);// In brackets I can put the name of one Variables
        // or
        System.out.print(i);
    }

}