package X;

/* renamed from: X.3Da, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC70163Da {
    public static double A04(double d, double d2, double d3, double d4, double d5) {
        double d6 = d3 - d2;
        return d4 + ((d6 != 0.0d ? (d - d2) / d6 : 0.0d) * (d5 - d4));
    }

    public static double A00(double d) {
        return A04(d, 0.0d, 1.0d, 0.0d, 255.0d);
    }

    public static double A01(double d, double d2) {
        return A04(d, 0.0d, 1.0d, 0.0d, d2);
    }

    public static double A02(double d, double d2) {
        return A04(d, 0.0d, 1.0d, d2, 0.0d);
    }

    public static double A03(double d, double d2, double d3) {
        return A04(d, 0.0d, 1.0d, d2, d3);
    }
}
