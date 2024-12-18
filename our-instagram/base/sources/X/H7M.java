package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* loaded from: classes7.dex */
public final class H7M extends C0T6 implements JMF {
    public final String A00;
    public final List A01;
    public final List A02;
    public final List A03;

    @Override // X.JMF
    public final H7M F4b(C1DY c1dy) {
        return this;
    }

    @Override // X.JMF
    public final H7M F4c(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H7M) {
                H7M h7m = (H7M) obj;
                if (!C14360o3.A0K(this.A01, h7m.A01) || !C14360o3.A0K(this.A00, h7m.A00) || !C14360o3.A0K(this.A02, h7m.A02) || !C14360o3.A0K(this.A03, h7m.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JMF
    public final List BGq() {
        return this.A01;
    }

    @Override // X.JMF
    public final List BhB() {
        return this.A02;
    }

    @Override // X.JMF
    public final List BhH() {
        return this.A03;
    }

    @Override // X.JMF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTFeedShowcaseMedia", I05.A00(this));
    }

    @Override // X.JMF
    public final String getMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0M(this.A01) * 31) + AbstractC167017dG.A0O(this.A00)) * 31) + AbstractC167017dG.A0M(this.A02)) * 31) + AbstractC166997dE.A0I(this.A03);
    }

    public H7M(String str, List list, List list2, List list3) {
        this.A01 = list;
        this.A00 = str;
        this.A02 = list2;
        this.A03 = list3;
    }

    @Override // X.JMF
    public final JMF EBN(C1DY c1dy) {
        return this;
    }
}
