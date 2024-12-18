package X;

/* loaded from: classes6.dex */
public final class E6H extends C0T6 {
    public final int A00;
    public final C5QE A01;
    public final C5QE A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E6H) {
                E6H e6h = (E6H) obj;
                if (!C14360o3.A0K(this.A02, e6h.A02) || !C14360o3.A0K(this.A01, e6h.A01) || this.A00 != e6h.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0J(this.A01, AbstractC166987dD.A0G(this.A02)) + this.A00;
    }

    public E6H(C5QE c5qe, C5QE c5qe2, int i) {
        this.A02 = c5qe;
        this.A01 = c5qe2;
        this.A00 = i;
    }
}
