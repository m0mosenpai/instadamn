package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.FBBioLinkSocialContextType;

/* renamed from: X.4xz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C110284xz extends C0T6 implements InterfaceC110294y0 {
    public final int A00;
    public final FBBioLinkSocialContextType A01;
    public final String A02;

    public C110284xz(FBBioLinkSocialContextType fBBioLinkSocialContextType, String str, int i) {
        C14360o3.A0B(str, 1);
        C14360o3.A0B(fBBioLinkSocialContextType, 3);
        this.A02 = str;
        this.A00 = i;
        this.A01 = fBBioLinkSocialContextType;
    }

    @Override // X.InterfaceC110294y0
    public final C110284xz EtJ() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C110284xz) {
                C110284xz c110284xz = (C110284xz) obj;
                if (!C14360o3.A0K(this.A02, c110284xz.A02) || this.A00 != c110284xz.A00 || this.A01 != c110284xz.A01) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.A02.hashCode() * 31) + this.A00) * 31) + this.A01.hashCode();
    }

    @Override // X.InterfaceC110294y0
    public final String Ayb() {
        return this.A02;
    }

    @Override // X.InterfaceC110294y0
    public final int BPU() {
        return this.A00;
    }

    @Override // X.InterfaceC110294y0
    public final FBBioLinkSocialContextType ByS() {
        return this.A01;
    }

    @Override // X.InterfaceC110294y0
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTFBBioLinkSocialContext", AbstractC33686Eua.A00(this));
    }
}
