public class Assignmentoperator {
    public static void main (String[] args) {
        int a = 16;
        a +=4;
        System.out.println("Addition Assignment: " + a);

        a -= 4;
        System.out.println("Subtraction Assignment: " + a);

        a *= 4;
        System.out.println("Multiplication Assignment: " + a);

        a /= 4;
        System.out.println("Division Assignment: " + a);

        a %= 4;
        System.out.println("Modulus Assignment: " + a);
    }   
}

// Assignment operators are used to assign values to variables. They include the basic assignment operator (=) and compound assignment operators
//  (+=, -=, *=, /=, %=). The compound assignment operators perform an operation and assign the result back to the variable in a single step.