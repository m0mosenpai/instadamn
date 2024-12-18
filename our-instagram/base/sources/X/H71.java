package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H71 extends C0T6 implements JLC {
    public final Integer A00;
    public final Integer A01;
    public final String A02;

    @Override // X.JLC
    public final H71 F3k() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H71) {
                H71 h71 = (H71) obj;
                if (!C14360o3.A0K(this.A00, h71.A00) || !C14360o3.A0K(this.A02, h71.A02) || !C14360o3.A0K(this.A01, h71.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLC
    public final Integer B2B() {
        return this.A00;
    }

    @Override // X.JLC
    public final String BE7() {
        return this.A02;
    }

    @Override // X.JLC
    public final Integer Bzr() {
        return this.A01;
    }

    @Override // X.JLC
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTIGVideoHighlightsDict", AbstractC40445Hwa.A00(this));
    }

    public final int hashCode() {
        return (((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H71(Integer num, Integer num2, String str) {
        this.A00 = num;
        this.A02 = str;
        this.A01 = num2;
    }
}
