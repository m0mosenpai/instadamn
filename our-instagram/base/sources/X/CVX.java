package X;

import java.util.List;

/* loaded from: classes5.dex */
public final class CVX {
    public final List A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof CVX) {
                CVX cvx = (CVX) obj;
                if (!C14360o3.A0K(this.A00, cvx.A00) || this.A01 != cvx.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public CVX(List list, boolean z) {
        this.A00 = list;
        this.A01 = z;
    }

    public final String toString() {
        StringBuilder A1C = AbstractC166987dD.A1C();
        A1C.append("NuxBody(sections=");
        A1C.append(this.A00);
        A1C.append(", notNowButtonEnabled=");
        return AbstractC25236BEt.A0a(A1C, this.A01);
    }
}
