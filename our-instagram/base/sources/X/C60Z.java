package X;

/* renamed from: X.60Z, reason: invalid class name */
/* loaded from: classes3.dex */
public abstract class C60Z {
    public static final long A00(int i, int i2) {
        if (i >= 0) {
            if (i2 >= 0) {
                return (i2 & 4294967295L) | (i << 32);
            }
            throw new IllegalArgumentException(AnonymousClass001.A0X("end cannot be negative. [start: ", ", end: ", ']', i, i2));
        }
        throw new IllegalArgumentException(AnonymousClass001.A0X("start cannot be negative. [start: ", ", end: ", ']', i, i2));
    }
}
