package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H5E extends C0T6 implements JL8 {
    public final int A00;
    public final int A01;
    public final String A02;

    public H5E(int i, int i2, String str) {
        C14360o3.A0B(str, 3);
        this.A00 = i;
        this.A01 = i2;
        this.A02 = str;
    }

    @Override // X.JL8
    public final H5E Eza() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5E) {
                H5E h5e = (H5E) obj;
                if (this.A00 != h5e.A00 || this.A01 != h5e.A01 || !C14360o3.A0K(this.A02, h5e.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JL8
    public final int B1r() {
        return this.A00;
    }

    @Override // X.JL8
    public final int BzY() {
        return this.A01;
    }

    @Override // X.JL8
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTSingleTokenTranscriptionData", AbstractC40249HtF.A00(this));
    }

    @Override // X.JL8
    public final String getText() {
        return this.A02;
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, ((this.A00 * 31) + this.A01) * 31);
    }
}
