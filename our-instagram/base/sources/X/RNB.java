package X;

/* loaded from: classes10.dex */
public final class RNB extends AbstractC61298RlI {
    public final String A01 = "common";
    public final boolean A02 = true;
    public final int A00 = 1;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC61298RlI) {
                RNB rnb = (RNB) ((AbstractC61298RlI) obj);
                if (!this.A01.equals(rnb.A01) || this.A02 != rnb.A02 || this.A00 != rnb.A00) {
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
        StringBuilder A1C = AbstractC166987dD.A1C();
        AbstractC58323PtF.A1P(str, A1C, i, z);
        return AbstractC166997dE.A0x("}", A1C);
    }
}
