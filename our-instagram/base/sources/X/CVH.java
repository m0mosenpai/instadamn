package X;

/* loaded from: classes5.dex */
public final class CVH {
    public final int A00;
    public final Object A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVH) {
                CVH cvh = (CVH) obj;
                if (!C14360o3.A0K(this.A01, cvh.A01) || this.A00 != cvh.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0G(this.A01) + this.A00;
    }

    public CVH(Object obj, int i) {
        this.A01 = obj;
        this.A00 = i;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("VerticalAnchor(id=");
        A1C.append(this.A01);
        A1C.append(", index=");
        return AbstractC25236BEt.A0Z(A1C, this.A00);
    }
}
