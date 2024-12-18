package X;

/* loaded from: classes6.dex */
public final class E96 extends C0T6 implements GWX {
    public final C5QE A00;
    public final C5QE A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E96) {
                E96 e96 = (E96) obj;
                if (!C14360o3.A0K(this.A01, e96.A01) || !C14360o3.A0K(this.A00, e96.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0G(this.A01));
    }

    public E96(C5QE c5qe, C5QE c5qe2) {
        this.A01 = c5qe;
        this.A00 = c5qe2;
    }
}
