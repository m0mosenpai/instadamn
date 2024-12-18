package X;

/* loaded from: classes8.dex */
public final class K2Q extends C0T6 implements MNI {
    public final int A00;
    public final long A01;

    public K2Q(long j, int i) {
        this.A00 = i;
        this.A01 = j;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this != obj) {
                i = 1;
            } else {
                return true;
            }
        } else if (this != obj) {
            i = 0;
        } else {
            return true;
        }
        if (obj instanceof K2Q) {
            K2Q k2q = (K2Q) obj;
            if (k2q.A00 != i || this.A01 != k2q.A01) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC25228BEl.A03(this.A01);
    }
}
