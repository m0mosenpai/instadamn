package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.H5d, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38763H5d extends C0T6 implements JKV {
    public final int A00;
    public final String A01;

    public C38763H5d(int i, String str) {
        C14360o3.A0B(str, 2);
        this.A00 = i;
        this.A01 = str;
    }

    @Override // X.JKV
    public final C38763H5d F0V() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38763H5d) {
                C38763H5d c38763H5d = (C38763H5d) obj;
                if (this.A00 != c38763H5d.A00 || !C14360o3.A0K(this.A01, c38763H5d.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JKV
    public final int C5G() {
        return this.A00;
    }

    @Override // X.JKV
    public final String C5L() {
        return this.A01;
    }

    @Override // X.JKV
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryFeatureLinkingStickerTapModel", AbstractC40284Hto.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, this.A00 * 31);
    }
}
