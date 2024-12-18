package X;

/* renamed from: X.Tyt, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C66056Tyt extends C0T6 {
    public final int A00;
    public final int A01;
    public final long A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C66056Tyt) {
                C66056Tyt c66056Tyt = (C66056Tyt) obj;
                if (this.A00 != c66056Tyt.A00 || this.A01 != c66056Tyt.A01 || this.A02 != c66056Tyt.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.A00 * 31) + this.A01) * 31;
        long j = this.A02;
        return i + ((int) (j ^ (j >>> 32)));
    }

    public C66056Tyt(int i, int i2, long j) {
        this.A00 = i;
        this.A01 = i2;
        this.A02 = j;
    }
}
