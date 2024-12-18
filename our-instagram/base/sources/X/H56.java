package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H56 extends C0T6 implements C5H7 {
    public final String A00;
    public final String A01;
    public final String A02;

    @Override // X.C5H7
    public final H56 EzM() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H56) {
                H56 h56 = (H56) obj;
                if (!C14360o3.A0K(this.A00, h56.A00) || !C14360o3.A0K(this.A01, h56.A01) || !C14360o3.A0K(this.A02, h56.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.C5H7
    public final String Baa() {
        return this.A00;
    }

    @Override // X.C5H7
    public final String Bac() {
        return this.A01;
    }

    @Override // X.C5H7
    public final String Bae() {
        return this.A02;
    }

    @Override // X.C5H7
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSeeMoreCardDict", AbstractC40228Hsr.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0O(this.A00) * 31) + AbstractC167017dG.A0O(this.A01)) * 31) + AbstractC25227BEk.A07(this.A02);
    }

    public H56(String str, String str2, String str3) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
    }
}
