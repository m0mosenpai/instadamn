package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;

/* loaded from: classes7.dex */
public final class H5O extends C0T6 implements JLZ {
    public final ImageUrl A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public H5O(ImageUrl imageUrl, String str, String str2, String str3) {
        AbstractC167007dF.A1F(str, 2, str3);
        this.A00 = imageUrl;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    @Override // X.JLZ
    public final H5O F02() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5O) {
                H5O h5o = (H5O) obj;
                if (!C14360o3.A0K(this.A00, h5o.A00) || !C14360o3.A0K(this.A01, h5o.A01) || !C14360o3.A0K(this.A02, h5o.A02) || !C14360o3.A0K(this.A03, h5o.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLZ
    public final ImageUrl AdF() {
        return this.A00;
    }

    @Override // X.JLZ
    public final String AdH() {
        return this.A01;
    }

    @Override // X.JLZ
    public final String AgP() {
        return this.A02;
    }

    @Override // X.JLZ
    public final String AgR() {
        return this.A03;
    }

    @Override // X.JLZ
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryBloksAttributionDict", AbstractC40270Hta.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A03, (AbstractC166997dE.A0K(this.A01, AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A02)) * 31);
    }
}
