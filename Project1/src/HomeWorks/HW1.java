package HomeWorks;

public class HW1 {
    public static void main(String[] args) {

        // PART 1
        byte a = -128;
        byte b = 127;

        short aa = -32768;
        short bb = 32767;

        int aaa = -2147483648;
        int bbb = 2147483647;

        long aaaa = -9223372036854775808L;
        long bbbb = 9223372036854775807L;

        System.out.println("\nPART 1");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("aa = " + aa);
        System.out.println("bb = " + bb);
        System.out.println("aaa = " + aaa);
        System.out.println("bbb = " + bbb);
        System.out.println("aaaa = " + aaaa);
        System.out.println("bbbb = " + bbbb);

        // PART 2
        float c = 0.5F;
        float d = 1000000.12312412341231F;

        double cc = -1.4;
        double dd = 10000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000D;

        boolean ccc = true;
        boolean ddd = false;

        System.out.println("\nPART 2");
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("cc = " + cc);
        System.out.println("dd = " + dd);
        System.out.println("ccc = " + ccc);
        System.out.println("ddd = " + ddd);

        // PART 3

        System.out.println("\nPART 3");
        char e = 67;
        char ee = 'a';
        char eee = 'Z';
        char eeee = '\u00b6';

        System.out.println("e = " + e);
        System.out.println("ee = " + ee);
        System.out.println("eee = " + eee);
        System.out.println("eeee = " + eeee);
    }
}
