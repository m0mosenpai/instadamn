package X;

/* loaded from: classes8.dex */
public final class K2R extends C0T6 implements MNI {
    public final String A00;
    public final long A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K2R) {
                K2R k2r = (K2R) obj;
                if (this.A01 != k2r.A01 || !C14360o3.A0K(this.A00, k2r.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A00, AbstractC25235BEs.A03(this.A01));
    }

    public K2R(long j, String str) {
        this.A01 = j;
        this.A00 = str;
    }
}
