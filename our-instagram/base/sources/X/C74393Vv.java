package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.3Vv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C74393Vv extends C0T6 implements InterfaceC74403Vw {
    public final C38321qM A00;
    public final ExtendedImageUrl A01;

    @Override // X.InterfaceC74403Vw
    public final C74393Vv EwU(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC74403Vw
    public final C74393Vv EwV(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C74393Vv) {
                C74393Vv c74393Vv = (C74393Vv) obj;
                if (!C14360o3.A0K(this.A01, c74393Vv.A01) || !C14360o3.A0K(this.A00, c74393Vv.A00)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        ExtendedImageUrl extendedImageUrl = this.A01;
        int hashCode = (extendedImageUrl == null ? 0 : extendedImageUrl.hashCode()) * 31;
        C38321qM c38321qM = this.A00;
        return hashCode + (c38321qM != null ? c38321qM.hashCode() : 0);
    }

    @Override // X.InterfaceC74403Vw
    public final ExtendedImageUrl BGU() {
        return this.A01;
    }

    @Override // X.InterfaceC74403Vw
    public final C38321qM CEv() {
        return this.A00;
    }

    @Override // X.InterfaceC74403Vw
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaResourceHint", AbstractC40069Hpv.A00(this));
    }

    public C74393Vv(C38321qM c38321qM, ExtendedImageUrl extendedImageUrl) {
        this.A01 = extendedImageUrl;
        this.A00 = c38321qM;
    }
}
