public class Logicaloperator {
    public static void main (String [] args) {
        int a = 6;
        int b = 10;

        // Logical AND operator (&&)
        boolean result = ( a > b) && ( b < a);
        System.out.println("Logical AND: " + result);

        //Logical OR operator (||)
        boolean orresult = ( a > b) || ( b > a);
        System.out.println ("Logical OR: " + orresult);  
        
        //Logical NOT operator (!)
        boolean notresult = !(a > b);
        System.out.println("Logical NOT: " + notresult);
    }
}
