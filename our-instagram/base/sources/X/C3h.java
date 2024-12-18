package X;

/* loaded from: classes5.dex */
public final class C3h extends AbstractC27455C9x {
    public final int A00;
    public final CVB A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C3h) {
                C3h c3h = (C3h) obj;
                if (!C14360o3.A0K(this.A01, c3h.A01) || this.A00 != c3h.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public C3h(CVB cvb, int i) {
        this.A01 = cvb;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("SpotlightItemClicked(spotlightItem=");
        A1C.append(this.A01);
        A1C.append(", itemIndex=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
