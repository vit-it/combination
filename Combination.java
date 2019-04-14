package p;

import java.math.BigInteger;

public class Combination {
    private static final char[] range = new char[]{'0', '1', '2'/*, '3', '4', '5', '6', '7', '8', '9'*/};

    public static void main(String[] args) {
        for (long i = 0; i < 1_406_408_618_241L; i++) {
            System.out.println("print " + print(i) + " " + i);
        }
    }

    private static String print(long i) {
        long devide = i / range.length;
        BigInteger remaining = new BigInteger(String.valueOf(i % range.length));
        //System.out.println(devide + " " + remaining);

        String ch = "";
        if (devide > 0) {
             ch = print(devide);
        }

        return ch + range[remaining.intValueExact()];
    }
}
