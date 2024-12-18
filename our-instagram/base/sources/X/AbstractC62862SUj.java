package X;

/* renamed from: X.SUj, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62862SUj {
    public static final int MAX_FACTORIAL = 170;
    public static final double[] everySixteenthFactorial = {1.0d, 2.0922789888E13d, 2.631308369336935E35d, 1.2413915592536073E61d, 1.2688693218588417E89d, 7.156945704626381E118d, 9.916779348709496E149d, 1.974506857221074E182d, 3.856204823625804E215d, 5.5502938327393044E249d, 4.7147236359920616E284d};

    public static boolean A00(double x) {
        long j;
        int exponent = Math.getExponent(x);
        if (exponent <= 1023) {
            if (x != 0.0d) {
                long doubleToRawLongBits = Double.doubleToRawLongBits(x) & 4503599627370495L;
                if (exponent == -1023) {
                    j = doubleToRawLongBits << 1;
                } else {
                    j = doubleToRawLongBits | 4503599627370496L;
                }
                if (52 - Long.numberOfTrailingZeros(j) <= exponent) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
