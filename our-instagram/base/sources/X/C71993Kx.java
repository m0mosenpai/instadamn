package X;

/* renamed from: X.3Kx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C71993Kx extends C0T6 {
    public final int A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C71993Kx) {
                C71993Kx c71993Kx = (C71993Kx) obj;
                if (this.A00 != c71993Kx.A00 || this.A01 != c71993Kx.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00 * 31;
        long j = this.A01;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public C71993Kx(int i, long j) {
        this.A00 = i;
        this.A01 = j;
    }
}
