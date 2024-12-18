package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HZO extends AbstractC39663His {
    public final List A00;
    public final boolean A01;
    public final Nm1 A02;

    public HZO(Nm1 nm1, List list, boolean z) {
        C14360o3.A0B(nm1, 2);
        this.A00 = list;
        this.A02 = nm1;
        this.A01 = z;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HZO) {
                HZO hzo = (HZO) obj;
                if (!C14360o3.A0K(this.A00, hzo.A00) || !C14360o3.A0K(this.A02, hzo.A02) || this.A01 != hzo.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A01, AbstractC166997dE.A0J(this.A02, AbstractC166987dD.A0G(this.A00)));
    }
}
