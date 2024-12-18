package X;

import java.util.List;

/* loaded from: classes9.dex */
public final class NHA extends AbstractC39700HjW {
    public final List A00;
    public final Integer A01;
    public final boolean A02;

    public NHA(Integer num, List list, boolean z) {
        C14360o3.A0B(num, 3);
        this.A00 = list;
        this.A02 = z;
        this.A01 = num;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof NHA) {
                NHA nha = (NHA) obj;
                if (!C14360o3.A0K(this.A00, nha.A00) || this.A02 != nha.A02 || this.A01 != nha.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.AbstractC39700HjW
    public final Integer A00() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC167007dF.A0D(this.A02, AbstractC166987dD.A0G(this.A00)) + AbstractC53882NsE.A00(this.A01);
    }
}
