package X;

/* loaded from: classes10.dex */
public final class RNF extends AbstractC61401Rn0 {
    public final String A01 = "vision-common";
    public final boolean A02 = true;
    public final int A00 = 1;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC61401Rn0) {
                RNF rnf = (RNF) ((AbstractC61401Rn0) obj);
                if (!this.A01.equals(rnf.A01) || this.A02 != rnf.A02 || this.A00 != rnf.A00) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = (this.A01.hashCode() ^ 1000003) * 1000003;
        int i = 1231;
        if (true != this.A02) {
            i = 1237;
        }
        return ((hashCode ^ i) * 1000003) ^ this.A00;
    }

    public final String toString() {
        String str = this.A01;
        boolean z = this.A02;
        int i = this.A00;
        StringBuilder A0q = AbstractC58318PtA.A0q(str.length() + 84);
        AbstractC58323PtF.A1P(str, A0q, i, z);
        return AbstractC166997dE.A0x("}", A0q);
    }
}
