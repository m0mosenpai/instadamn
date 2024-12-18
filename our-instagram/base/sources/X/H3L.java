package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ProductCollection;

/* loaded from: classes7.dex */
public final class H3L extends C0T6 implements JMT {
    public final JL0 A00;
    public final ProductCollection A01;
    public final Boolean A02;
    public final String A03;
    public final String A04;
    public final String A05;

    @Override // X.JMT
    public final H3L Etc(C1DY c1dy) {
        return this;
    }

    @Override // X.JMT
    public final H3L Etd(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H3L) {
                H3L h3l = (H3L) obj;
                if (!C14360o3.A0K(this.A01, h3l.A01) || !C14360o3.A0K(this.A03, h3l.A03) || !C14360o3.A0K(this.A00, h3l.A00) || !C14360o3.A0K(this.A04, h3l.A04) || !C14360o3.A0K(this.A05, h3l.A05) || !C14360o3.A0K(this.A02, h3l.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMT
    public final ProductCollection Ap9() {
        return this.A01;
    }

    @Override // X.JMT
    public final String ApG() {
        return this.A03;
    }

    @Override // X.JMT
    public final JL0 AyK() {
        return this.A00;
    }

    @Override // X.JMT
    public final String BE2() {
        return this.A04;
    }

    @Override // X.JMT
    public final String BE3() {
        return this.A05;
    }

    @Override // X.JMT
    public final Boolean CQH() {
        return this.A02;
    }

    @Override // X.JMT
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTFeedProductCollectionTagDict", AbstractC39923HnE.A00(this));
    }

    public final int hashCode() {
        return (((((((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A04)) * 31) + AbstractC167017dG.A0O(this.A05)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    public H3L(JL0 jl0, ProductCollection productCollection, Boolean bool, String str, String str2, String str3) {
        this.A01 = productCollection;
        this.A03 = str;
        this.A00 = jl0;
        this.A04 = str2;
        this.A05 = str3;
        this.A02 = bool;
    }

    @Override // X.JMT
    public final JMT E94(C1DY c1dy) {
        return this;
    }
}
