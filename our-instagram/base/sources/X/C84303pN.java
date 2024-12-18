package X;

/* renamed from: X.3pN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C84303pN {
    public static final C84303pN A01 = new Object();
    public static final long A00 = System.nanoTime();

    public final String toString() {
        return "TimeSource(System.nanoTime())";
    }

    public final long A00(long j) {
        long j2;
        long nanoTime = System.nanoTime() - A00;
        C36G c36g = C36G.A08;
        if ((1 | (j - 1)) == Long.MAX_VALUE) {
            if (j < 0) {
                j2 = C36J.A02;
            } else {
                j2 = C36J.A01;
            }
            return ((-(j2 >> 1)) << 1) + (((int) j2) & 1);
        }
        return AbstractC84323pP.A00(c36g, nanoTime, j);
    }
}
