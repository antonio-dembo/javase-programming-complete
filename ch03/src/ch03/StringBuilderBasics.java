package ch03;

/*
 StringBuilder class another way os handling strings in java.
 StringBuilder objects are mutable, allowing modification of the caracter sequence they store.

 some methods are similar to that of String class:
    indexOf, substring, charAt, etc.

 Extra methods are available:
    append, insert, delete, reverse.

 reduces the number of String objects you need to create.

 */


public class StringBuilderBasics
{
    public static void main(String[] args)
    {
        StringBuilder a = new StringBuilder();
//        StringBuilder sbText = new StringBuilder("Text");
//        StringBuilder sbWith100 = new StringBuilder(100);

        a.append("tea");
        a.append('s');
        a.insert(3,'m');
        a.delete( 2, 4 );
        a.reverse();
        int l = a.length();
        int c = a.capacity();

        //You can not just jump a position. You can insert a space in it.
        //if so it thows an StringIndexOutOfBoundsException.
        //a.insert(4, 's');

        System.out.printf("%s\n%d\n%d", a, l, c);

    }
}
