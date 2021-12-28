public class ifElse {

    public static void main(String[] args) {
/*

If & Else ES.1

*/
        boolean light = true;

        String on = "The ligth is on";
        String off = "the light is off";

        if (light) {
            System.out.println(on);
        } else {
            System.out.println(off);
        }
/*

ElseIf Es.1

*/
        String name = "Mark";

        if(name == "Luke") {
            System.out.println("Is Luke!");
        }else if(name == "Mark") {
            System.out.println("Is Mark");
        }else {
            System.out.println("I don't know his");
        }


    }


}


