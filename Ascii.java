public class Ascii {
    public static void printNumbers()
    {
        // Let user know the valid digits are
        System.out.print("Valid digits are as follows: ");
        for (int i = 48; i <= 57; i++){
            System.out.print((char)i);

        }
        // Blank line now
        System.out.println();
    }

    public static void printLowerCase()
    {
        // TODO: print valid lowercase alphabetic input
        // Let user know the valid lowercase characters are
        System.out.print("Valid lowercase letters are: ");
        for (int i = 97; i <= 122; i++){
            System.out.print((char)i);

        }
        // Blank line now
        System.out.println();

    }

    public static void printUpperCase()
    {
        // TODO: print valid uppercase alphabetic input
        // Let user know the valid Uppercase characters are
        System.out.print("Valid Uppercase letters are: ");
        for (int i = 65; i <= 90; i++){
            System.out.print((char)i);

        }
        // Blank line now
        System.out.println();
    }
}
