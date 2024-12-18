package X;

import java.util.List;

/* loaded from: classes7.dex */
public final class HZP extends AbstractC39663His {
    public final List A00;
    public final List A01;
    public final boolean A02;
    public final Nm1 A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof HZP) {
                HZP hzp = (HZP) obj;
                if (!C14360o3.A0K(this.A01, hzp.A01) || !C14360o3.A0K(this.A00, hzp.A00) || !C14360o3.A0K(this.A03, hzp.A03) || this.A02 != hzp.A02) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AbstractC166987dD.A0K(this.A02, AbstractC166997dE.A0J(this.A03, AbstractC166997dE.A0J(this.A00, AbstractC166987dD.A0G(this.A01))));
    }

    public HZP(Nm1 nm1, List list, List list2, boolean z) {
        AbstractC167017dG.A1R(list2, nm1);
        this.A01 = list;
        this.A00 = list2;
        this.A03 = nm1;
        this.A02 = z;
    }
}
