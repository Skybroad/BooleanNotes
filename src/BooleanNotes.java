public class BooleanNotes {
    public static void main(String[] args) {
        /*
        if (  ) {

        }
            relational operators
            <
            >
            <=
            >=
            ==  "the same as" Assignment is one equal sign, comparison is two
            !=
            An if statement is a block of code associated with a condition.
            That block of code may or may not execute depending on that condition.
         */
        double fuelLevel = 0.5;

        if (fuelLevel < .25)
            System.out.println("Stop for gas");
        double walmartPrice = 2.95, chevronPrice = 3.15;

        if (walmartPrice<chevronPrice) {
            System.out.println("stop at walmart");
            System.out.println("get groceries");
        }
        else
            System.out.println("stop a Chevron");
        // You need braces when you have more than 1 thing the control. FRQs on the AP test will try to trick you.
        // Braces are a good idea from both the coding and FRQ perspective.

        String craving = "";

        if (craving.equals("mcnuggies")){
            System.out.println("McD");
        }
        else if (craving.equals("real chicken")){
            System.out.println("chick-fil-a");
        }
        else if (craving.equals("whopper")){
            System.out.println("bk");
        }
        else {
            System.out.println("waffle house");
        }
        /*
        end of notes 
         */
    }
}