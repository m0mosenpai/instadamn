package X;

import java.util.List;

/* loaded from: classes8.dex */
public final class K9F extends AbstractC46370Kfs {
    public final C45127Jxw A00;
    public final Integer A01;
    public final List A02;
    public final boolean A03;

    public K9F(C45127Jxw c45127Jxw, Integer num, List list, boolean z) {
        C14360o3.A0B(num, 4);
        this.A02 = list;
        this.A03 = z;
        this.A00 = c45127Jxw;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof K9F) {
                K9F k9f = (K9F) obj;
                if (!C14360o3.A0K(this.A02, k9f.A02) || this.A03 != k9f.A03 || !C14360o3.A0K(this.A00, k9f.A00) || this.A01 != k9f.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((AbstractC167007dF.A0D(this.A03, AbstractC166987dD.A0G(this.A02)) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC46609Kjm.A00(this.A01);
    }
}
