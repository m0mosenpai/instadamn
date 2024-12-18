package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H5C extends C0T6 implements JLX {
    public final int A00;
    public final int A01;
    public final String A02;
    public final String A03;

    public H5C(int i, String str, String str2, int i2) {
        C14360o3.A0B(str2, 3);
        this.A00 = i;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = i2;
    }

    @Override // X.JLX
    public final H5C EzY() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5C) {
                H5C h5c = (H5C) obj;
                if (this.A00 != h5c.A00 || !C14360o3.A0K(this.A02, h5c.A02) || !C14360o3.A0K(this.A03, h5c.A03) || this.A01 != h5c.A01) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLX
    public final String CBn() {
        return this.A02;
    }

    @Override // X.JLX
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTShowreelNativeImage", AbstractC40244HtA.A00(this));
    }

    @Override // X.JLX
    public final int getHeight() {
        return this.A00;
    }

    @Override // X.JLX
    public final String getUrl() {
        return this.A03;
    }

    @Override // X.JLX
    public final int getWidth() {
        return this.A01;
    }

    public final int hashCode() {
        return AbstractC166997dE.A0K(this.A03, ((this.A00 * 31) + AbstractC167017dG.A0O(this.A02)) * 31) + this.A01;
    }
}
