package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H3P extends C0T6 implements JLP {
    public final Integer A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.JLP
    public final H3P Etl() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3P) {
                H3P h3p = (H3P) obj;
                if (!C14360o3.A0K(this.A00, h3p.A00) || !C14360o3.A0K(this.A02, h3p.A02) || !C14360o3.A0K(this.A01, h3p.A01) || !C14360o3.A0K(this.A03, h3p.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLP
    public final Integer Aey() {
        return this.A00;
    }

    @Override // X.JLP
    public final String Af8() {
        return this.A02;
    }

    @Override // X.JLP
    public final Integer AfA() {
        return this.A01;
    }

    @Override // X.JLP
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTGIFSCreateModeInfo", AbstractC39933HnO.A00(this));
    }

    @Override // X.JLP
    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC167017dG.A0M(this.A01)) * 31) + AbstractC25227BEk.A07(this.A03);
    }

    public H3P(Integer num, Integer num2, String str, String str2) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
        this.A03 = str2;
    }
}
