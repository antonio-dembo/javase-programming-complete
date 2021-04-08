package ch03;

import java.util.Locale;

public class StringBasics {

    public static void main(String[] args)
    {
        String a = " Hello ";
        a = a.trim();

        String b = a.concat("World");
        String c = a + "World";
        String d = c.toLowerCase();
        boolean e = b.contains("W");

        System.out.println(e);
    }
}
