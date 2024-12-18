package X;

/* renamed from: X.Nyn, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC54267Nyn {
    public static final int A00(float f, float f2) {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        if (f < 0.07f) {
            d = f;
            d2 = 0.0d;
            d3 = 0.07000000029802322d;
            d5 = 255.0d;
            d4 = 0.0d;
        } else {
            if (f < f2) {
                return 255;
            }
            if (f < 0.9f) {
                d = f;
                d2 = f2;
                d3 = 0.8999999761581421d;
                d4 = 255.0d;
                d5 = 0.0d;
            } else {
                return 0;
            }
        }
        return (int) AbstractC70163Da.A04(d, d2, d3, d4, d5);
    }
}
