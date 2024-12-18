package X;

/* loaded from: classes8.dex */
public final class K90 extends AbstractC46367Kfp {
    public final C2Fb A00;
    public final String A01;

    public K90(C2Fb c2Fb, String str) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = c2Fb;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K90) {
                K90 k90 = (K90) obj;
                if (!C14360o3.A0K(this.A01, k90.A01) || this.A00 != k90.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }
}
