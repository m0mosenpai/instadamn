package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H57 extends C0T6 implements JKU {
    public final String A00;
    public final String A01;

    @Override // X.JKU
    public final H57 EzN() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H57) {
                H57 h57 = (H57) obj;
                if (!C14360o3.A0K(this.A00, h57.A00) || !C14360o3.A0K(this.A01, h57.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKU
    public final String Bcz() {
        return this.A00;
    }

    @Override // X.JKU
    public final String CFd() {
        return this.A01;
    }

    @Override // X.JKU
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSelfieStickerUrl", AbstractC40230Hst.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public H57(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
