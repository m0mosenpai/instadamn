package X;

/* renamed from: X.S0q, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public abstract class AbstractC62169S0q {
    public static final float A00(float f, float f2) {
        float f3 = 1.0f;
        if (f < Math.abs(f2)) {
            f3 = 1.0f + ((float) Math.pow((f / r1) - 1.0f, 3.0d));
        }
        float f4 = f + (f2 * f3);
        if (f4 < 0.0f) {
            return 0.0f;
        }
        return f4;
    }
}
