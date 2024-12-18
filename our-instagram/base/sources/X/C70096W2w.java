package X;

/* renamed from: X.W2w, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70096W2w {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public int A04;
    public long A06 = Long.MIN_VALUE;
    public long A07 = -1;
    public long A05 = 0;

    public static float A00(C70096W2w c70096W2w, long j) {
        long j2 = c70096W2w.A06;
        if (j < j2) {
            return 0.0f;
        }
        long j3 = c70096W2w.A07;
        if (j3 >= 0 && j >= j3) {
            float f = c70096W2w.A00;
            float f2 = 1.0f - f;
            float f3 = ((float) (j - j3)) / c70096W2w.A02;
            int i = WO7.A0G;
            if (f3 > 1.0f) {
                f3 = 1.0f;
            } else if (f3 < 0.0f) {
                f3 = 0.0f;
            }
            return f2 + (f * f3);
        }
        float f4 = ((float) (j - j2)) / c70096W2w.A04;
        int i2 = WO7.A0G;
        if (f4 > 1.0f) {
            f4 = 1.0f;
        } else if (f4 < 0.0f) {
            f4 = 0.0f;
        }
        return f4 * 0.5f;
    }
}
