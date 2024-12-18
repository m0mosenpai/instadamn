package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H3I extends C0T6 implements JLO {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    @Override // X.JLO
    public final H3I EtS() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3I) {
                H3I h3i = (H3I) obj;
                if (this.A00 != h3i.A00 || this.A01 != h3i.A01 || !C14360o3.A0K(this.A02, h3i.A02) || !C14360o3.A0K(this.A03, h3i.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLO
    public final String Bhi() {
        return this.A02;
    }

    @Override // X.JLO
    public final String BiG() {
        return this.A03;
    }

    @Override // X.JLO
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTFbMentionedUserData", AbstractC39917Hn7.A00(this));
    }

    @Override // X.JLO
    public final int getLength() {
        return this.A00;
    }

    @Override // X.JLO
    public final int getOffset() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, AbstractC166997dE.A0K(this.A02, ((this.A00 * 31) + this.A01) * 31));
    }

    public H3I(int i, int i2, String str, String str2) {
        AbstractC37302Gc3.A1U(str, str2);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
        this.A03 = str2;
    }
}
