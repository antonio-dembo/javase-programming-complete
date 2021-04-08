package ch03;

// String idenxing starts from 0
public class StringIdexing
{
    public static void main(String[] args)
    {
        String a = "Hello World";

        String format = "%s\n%s\n%d\n%d\n%d\n%d\n%c\n%d";

        System.out.printf( format, "Hello World",
                a.substring(0, 5),
                a.indexOf("o"),
                a.indexOf('o', 5),
                a.lastIndexOf('l'),
                a.indexOf('a'),
                a.charAt(3),
                a.length()
        );

        // System.out.println( a.charAt(11) ); // thows an StringIndexOutOfBoundsException

    }
}
