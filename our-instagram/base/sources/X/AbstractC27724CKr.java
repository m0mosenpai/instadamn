package X;

/* renamed from: X.CKr, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC27724CKr {
    public static final float A00(float f, float f2, float f3, long j) {
        float f4 = f - f2;
        if (Math.abs(f4) >= 0.001f) {
            float f5 = (f3 * ((float) j)) / 1.6666667E7f;
            return f2 + Math.max(Math.min(f4, f5), -f5);
        }
        return f;
    }
}
