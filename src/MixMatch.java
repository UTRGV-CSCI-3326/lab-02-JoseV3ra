public class MixMatch 
{
    public static void main (String [] args)
    {
        String mString = "Hello Java";
        System.out.println(mString + ", String: stores a collection of characters\n");

        char mChar = 'C';
        System.out.println(mChar + " char: stores a single character\n");

        boolean mBoolean = true;
        System.out.println(mBoolean + ", boolean: stores true or false values\n");

        int mInt = 7;
        System.out.println(mInt + ", Integer: store whole numbers\n");

        short mShort = 32000;
        System.out.println(mShort + ", Short: stores whole numbers from -32,768 to 32,768\n");

        float mFloat = 3.14f;
        System.out.println(mFloat + ", float: stores numbers with decimals up to 7 digit precision\n");

        long mLong = 100000;
        System.out.println(mLong + ", Long: stores very large whole numbers up to 9 quintillion.\n");

        double mDouble = 3.148654;
        System.out.println(mDouble + ", double: stores decimal numbers with up to 15 digits of precision.\n");

        System.out.println("Mixing Types \n" + mString + ", " + mChar + ", " + mBoolean + ", " + mInt + ", " + mShort + ", " + mFloat + ", " + mFloat + ", " + mLong + ", " + mDouble);
    }
}