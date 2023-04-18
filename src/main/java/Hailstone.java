public class Hailstone {
    public static String sequence(int n) {
        String str = "";
        while (n != 1) {
            str = str + n + " ";
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
        }
        return str;
    }
}
