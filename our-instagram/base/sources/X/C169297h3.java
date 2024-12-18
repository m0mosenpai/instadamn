package X;

/* renamed from: X.7h3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C169297h3 {
    public int A00;
    public long A01;
    public final int A02;

    public static final void A00(C169297h3 c169297h3) {
        long j = c169297h3.A01;
        if (j != 0 && j != -1) {
            long currentTimeMillis = System.currentTimeMillis();
            c169297h3.A01 = currentTimeMillis;
            c169297h3.A00 += (int) (currentTimeMillis - j);
        }
    }

    public C169297h3(int i) {
        this.A02 = i;
    }
}
