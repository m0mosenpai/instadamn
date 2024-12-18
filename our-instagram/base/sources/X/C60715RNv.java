package X;

/* renamed from: X.RNv, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C60715RNv extends AbstractC61503Roe {
    public final String A01;
    public final boolean A02 = true;
    public final int A00 = 1;

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof AbstractC61503Roe) {
                C60715RNv c60715RNv = (C60715RNv) ((AbstractC61503Roe) obj);
                if (!this.A01.equals(c60715RNv.A01) || this.A02 != c60715RNv.A02 || this.A00 != c60715RNv.A00) {
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
