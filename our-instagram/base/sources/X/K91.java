package X;

/* loaded from: classes8.dex */
public final class K91 extends AbstractC46367Kfp {
    public final C5QE A00;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K91) {
                K91 k91 = (K91) obj;
                if (!C14360o3.A0K(this.A01, k91.A01) || !C14360o3.A0K(this.A00, k91.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public K91(C5QE c5qe, C5QE c5qe2) {
        this.A01 = c5qe;
        this.A00 = c5qe2;
    }
}
