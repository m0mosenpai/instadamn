package X;

/* renamed from: X.3xN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C88623xN {
    public final long A00;
    public final long A01;
    public final String A02;

    public C88623xN(long j, long j2, String str) {
        if (j >= 0) {
            if (j2 >= 0) {
                if (j <= j2) {
                    this.A01 = j;
                    this.A00 = j2;
                    this.A02 = str;
                    return;
                }
                throw new IllegalArgumentException(AnonymousClass001.A0f("minDelay=", "; maxDelay=", j, j2));
            }
            throw new IllegalArgumentException("maxDelayMs < 0");
        }
        throw new IllegalArgumentException("minDelayMs < 0");
    }
}
