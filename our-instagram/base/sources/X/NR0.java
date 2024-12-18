package X;

/* loaded from: classes9.dex */
public final class NR0 extends NlZ {
    public final C2Fb A00;
    public final String A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NR0) {
                NR0 nr0 = (NR0) obj;
                if (!C14360o3.A0K(this.A01, nr0.A01) || this.A00 != nr0.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public NR0(C2Fb c2Fb, String str) {
        this.A01 = str;
        this.A00 = c2Fb;
    }
}
