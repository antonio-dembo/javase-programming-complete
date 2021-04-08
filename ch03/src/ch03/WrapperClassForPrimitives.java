package ch03;

//Wrapper classes apply object-oriented capabilities to primitives
public class WrapperClassForPrimitives
{
    public static void main(String[] args) {

        int a = 42;
        Integer b = Integer.valueOf(a);  // boxing
        int c = b.intValue();            // unboxing

        // avoid too many auto-boxing and auto-unboxing for performance reasons.
        a = b;  // auto-boxing
        b = c;  // auto-unboxing

        // Create Wrapper or primitive out os the String using the parseXXXX() method.
        String d = "12.45";
        float e = Float.valueOf(d);
        float f = Float.parseFloat(d);
        String g = String.valueOf(a);

        System.out.println(Short.MIN_VALUE);
        System.out.println(Short.MAX_VALUE);
    }
}
