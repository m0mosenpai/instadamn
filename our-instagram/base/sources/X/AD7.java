package X;

/* loaded from: classes4.dex */
public abstract class AD7 {
    public static C176877tj A01(C176877tj c176877tj, C176877tj c176877tj2) {
        int i = c176877tj.A02;
        int i2 = c176877tj.A01;
        double A00 = A00(i, i2);
        int i3 = c176877tj2.A02;
        int i4 = c176877tj2.A01;
        if (Math.abs(A00 - A00(i3, i4)) <= 0.019999999552965164d) {
            return null;
        }
        if ((i - i2) * (i3 - i4) < 0) {
            c176877tj2 = new C176877tj(i4, i3);
        }
        float f = c176877tj2.A01;
        float f2 = c176877tj2.A02;
        int i5 = (int) (i * (f / f2));
        if (i5 <= i2) {
            return new C176877tj(i, i5);
        }
        return new C176877tj((int) (i2 * (f2 / f)), i2);
    }

    public static double A00(int i, int i2) {
        if (i != 0 && i2 != 0) {
            return Math.max(i, i2) / Math.min(i, i2);
        }
        return 0.0d;
    }
}
