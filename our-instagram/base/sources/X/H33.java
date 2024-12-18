package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H33 extends C0T6 implements JKF {
    public final String A00;
    public final String A01;

    public H33(String str, String str2) {
        C14360o3.A0B(str, 1);
        this.A00 = str;
        this.A01 = str2;
    }

    @Override // X.JKF
    public final H33 Et4() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H33) {
                H33 h33 = (H33) obj;
                if (!C14360o3.A0K(this.A00, h33.A00) || !C14360o3.A0K(this.A01, h33.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKF
    public final String Byk() {
        return this.A00;
    }

    @Override // X.JKF
    public final String Byp() {
        return this.A01;
    }

    @Override // X.JKF
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTCutoutStickerInfo", AbstractC39894Hmh.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0J(this.A00) + AbstractC167017dG.A0O(this.A01);
    }
}
