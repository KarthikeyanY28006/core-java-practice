public class Typeconversion {
    public static void main (String[] args) {
    int a = 5;
    double b = a; // implicit type conversion (widening)        

    double d = 5.14;
    int c = (int) d;
    
    System.out.println("Conversion: " + b);
    System.out.println("Casting: " + c);

        }
}

//Type conversion is the automatic conversion of one data type into another by the Java compiler.
//  It is also called implicit conversion and does not cause data loss.

//Type Casting

//Type casting is the manual conversion of one data type into another using the cast operator ( ).
//  It is also called explicit conversion and may cause data loss.