package X;

import com.facebook.pando.TreeUpdaterJNI;

/* loaded from: classes11.dex */
public final class UQx extends C0T6 implements InterfaceC72034XFw {
    public final Float A00;
    public final Float A01;
    public final Integer A02;

    @Override // X.InterfaceC72034XFw
    public final UQx EuQ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UQx) {
                UQx uQx = (UQx) obj;
                if (!C14360o3.A0K(this.A00, uQx.A00) || !C14360o3.A0K(this.A02, uQx.A02) || !C14360o3.A0K(this.A01, uQx.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC72034XFw
    public final Float Aep() {
        return this.A00;
    }

    @Override // X.InterfaceC72034XFw
    public final Integer BpC() {
        return this.A02;
    }

    @Override // X.InterfaceC72034XFw
    public final Float BqE() {
        return this.A01;
    }

    @Override // X.InterfaceC72034XFw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsRrCoreRatingInfoDict", VOT.A00(this));
    }

    public final int hashCode() {
        int i = 0;
        int A0M = ((AbstractC167017dG.A0M(this.A00) * 31) + AbstractC167017dG.A0M(this.A02)) * 31;
        Float f = this.A01;
        if (f != null) {
            i = f.hashCode();
        }
        return A0M + i;
    }

    public UQx(Float f, Float f2, Integer num) {
        this.A00 = f;
        this.A02 = num;
        this.A01 = f2;
    }
}
