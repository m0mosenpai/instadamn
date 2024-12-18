package X;

/* renamed from: X.5Bo, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC113765Bo {
    public static final long A00(int i, int i2) {
        return (i2 & 4294967295L) | (i << 32);
    }

    public static final long A01(long j) {
        int round = Math.round(C119365at.A01(j));
        return (Math.round(C119365at.A02(j)) & 4294967295L) | (round << 32);
    }
}
