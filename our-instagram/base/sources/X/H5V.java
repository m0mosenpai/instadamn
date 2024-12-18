package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes7.dex */
public final class H5V extends C0T6 implements InterfaceC104984oD {
    public final Boolean A00;
    public final String A01;

    @Override // X.InterfaceC104984oD
    public final H5V F0I() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H5V) {
                H5V h5v = (H5V) obj;
                if (!C14360o3.A0K(this.A00, h5v.A00) || !C14360o3.A0K(this.A01, h5v.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC104984oD
    public final Boolean AcR() {
        return this.A00;
    }

    @Override // X.InterfaceC104984oD
    public final String Acl() {
        return this.A01;
    }

    @Override // X.InterfaceC104984oD
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTStoryDynamicAdFlexibleTilesInfo", AbstractC40277Hth.A00(this));
    }

    public final int hashCode() {
        return (AbstractC167017dG.A0M(this.A00) * 31) + AbstractC25227BEk.A07(this.A01);
    }

    public H5V(String str, Boolean bool) {
        this.A00 = bool;
        this.A01 = str;
    }
}
