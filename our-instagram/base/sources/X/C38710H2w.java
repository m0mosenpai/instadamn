package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H2w, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38710H2w extends C0T6 implements JKE {
    public final String A00;
    public final String A01;

    @Override // X.JKE
    public final C38710H2w EsZ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38710H2w) {
                C38710H2w c38710H2w = (C38710H2w) obj;
                if (!C14360o3.A0K(this.A00, c38710H2w.A00) || !C14360o3.A0K(this.A01, c38710H2w.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKE
    public final String Ama() {
        return this.A00;
    }

    @Override // X.JKE
    public final String Amb() {
        return this.A01;
    }

    @Override // X.JKE
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTContextualAdsInfo", AbstractC39852Hm0.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0J(this.A00));
    }

    public C38710H2w(String str, String str2) {
        AbstractC167017dG.A1P(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
