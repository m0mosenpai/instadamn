package X;

/* loaded from: classes8.dex */
public abstract class LHK {
    public static boolean A02(int i, float f, boolean z) {
        if (i == 90 || i == 270) {
            f = 1.0f / f;
        }
        return f >= (z ? 0.75f : 0.8f) - 0.01f && f <= 1.92f;
    }

    public static float A00(double d, double d2) {
        boolean z = false;
        if (d < 0.0d) {
            z = true;
            d = -d;
        }
        double sqrt = (((Math.sqrt(3.0d) * 2.0d) + 3.0d) * 2.0d) / d2;
        double sqrt2 = d - (((Math.sqrt((d * sqrt) + 1.0d) - 1.0d) * 2.0d) / sqrt);
        if (z) {
            sqrt2 = -sqrt2;
        }
        return (float) sqrt2;
    }

    public static boolean A01(float f, int i) {
        if (i == 90 || i == 270) {
            f = 1.0f / f;
        }
        if (f >= 0.8f - 0.01f && f <= 1.92f) {
            return true;
        }
        return false;
    }
}
