package X;

/* renamed from: X.7Og, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C162227Og extends C0T6 {
    public final int A00;
    public final long A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C162227Og) {
                C162227Og c162227Og = (C162227Og) obj;
                if (this.A02 != c162227Og.A02 || this.A00 != c162227Og.A00 || this.A01 != c162227Og.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        long j = this.A02;
        int i = ((((int) (j ^ (j >>> 32))) * 31) + this.A00) * 31;
        long j2 = this.A01;
        return i + ((int) (j2 ^ (j2 >>> 32)));
    }

    public C162227Og(long j, int i, long j2) {
        this.A02 = j;
        this.A00 = i;
        this.A01 = j2;
    }
}
