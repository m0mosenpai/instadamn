package X;

/* renamed from: X.SbM, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC63043SbM {
    public static int A02(float f, int i, int i2) {
        if (i != i2 && f > 0.0f) {
            if (f >= 1.0f) {
                return i2;
            }
            float f2 = ((i >> 24) & 255) / 255.0f;
            float A00 = A00(((i >> 16) & 255) / 255.0f);
            float A002 = A00(((i >> 8) & 255) / 255.0f);
            float A003 = A00((i & 255) / 255.0f);
            float A004 = A00(((i2 >> 16) & 255) / 255.0f);
            float A005 = A002 + ((A00(((i2 >> 8) & 255) / 255.0f) - A002) * f);
            float A006 = A003 + (f * (A00((i2 & 255) / 255.0f) - A003));
            return (Math.round(A01(A00 + ((A004 - A00) * f)) * 255.0f) << 16) | (Math.round((f2 + (((((i2 >> 24) & 255) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(A01(A005) * 255.0f) << 8) | Math.round(A01(A006) * 255.0f);
        }
        return i;
    }

    public static float A00(float f) {
        if (f <= 0.04045f) {
            return f / 12.92f;
        }
        return (float) Math.pow((f + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    public static float A01(float f) {
        if (f <= 0.0031308f) {
            return f * 12.92f;
        }
        return (float) ((Math.pow(f, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
