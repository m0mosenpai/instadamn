package X;

/* renamed from: X.5YB, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5YB {
    public static final long A00(float f, float f2) {
        return (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final long A01(long j) {
        if (j == 9205357640488583168L) {
            throw new IllegalStateException("Size is unspecified");
        }
        return AbstractC119395aw.A00(Float.intBitsToFloat((int) (j >> 32)) / 2.0f, Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f);
    }
}
