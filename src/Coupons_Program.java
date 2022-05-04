public class Coupons_Program {
    public static void main(String[] args) {

        char[] chars = "abcdefghijklmnop125465453".toCharArray();

        int max = 1000000;
        double d = Math.random();
        int random = (int) (d * max);
        String sb = "";
        System.out.println("random double " + d + " random at start " + random);

        while (random > 0) {
            sb = sb + (chars[random % chars.length]);
            random /= chars.length;
            System.out.println(random + "  " + random % chars.length + " sb is " + sb);
        }

        String couponCode = sb.toString();
        System.out.println("Coupon Code: " + couponCode);
    }
}
