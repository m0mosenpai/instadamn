package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H5K extends C0T6 implements JLY {
    public final Boolean A00;
    public final Integer A01;
    public final String A02;
    public final String A03;

    @Override // X.JLY
    public final H5K Ezw() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5K) {
                H5K h5k = (H5K) obj;
                if (!C14360o3.A0K(this.A02, h5k.A02) || !C14360o3.A0K(this.A03, h5k.A03) || !C14360o3.A0K(this.A00, h5k.A00) || !C14360o3.A0K(this.A01, h5k.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JLY
    public final String AgO() {
        return this.A02;
    }

    @Override // X.JLY
    public final Boolean BvJ() {
        return this.A00;
    }

    @Override // X.JLY
    public final Integer Bx0() {
        return this.A01;
    }

    @Override // X.JLY
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryAntiBullyStickerTappableData", AbstractC40264HtU.A00(this));
    }

    @Override // X.JLY
    public final String getId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public H5K(Boolean bool, Integer num, String str, String str2) {
        this.A02 = str;
        this.A03 = str2;
        this.A00 = bool;
        this.A01 = num;
    }
}
