package X;

/* renamed from: X.5AE, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C5AE {
    public static final long A00(float f, float f2) {
        long floatToRawIntBits = (Float.floatToRawIntBits(f2) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
        long j = C5AD.A01;
        return floatToRawIntBits;
    }
}
