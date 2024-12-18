package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ProfileBannerType;

/* loaded from: classes6.dex */
public final class E84 extends C0T6 implements InterfaceC37267GbK {
    public final ProfileBannerType A00;
    public final String A01;

    @Override // X.InterfaceC37267GbK
    public final E84 Eyc() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof E84) {
                E84 e84 = (E84) obj;
                if (!C14360o3.A0K(this.A01, e84.A01) || this.A00 != e84.A00) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC37267GbK
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTProfileBannerInfo", AbstractC33731EvJ.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A00, AbstractC166987dD.A0J(this.A01));
    }

    public E84(ProfileBannerType profileBannerType, String str) {
        AbstractC167017dG.A1P(str, profileBannerType);
        this.A01 = str;
        this.A00 = profileBannerType;
    }

    @Override // X.InterfaceC37267GbK
    public final String AfP() {
        return this.A01;
    }

    @Override // X.InterfaceC37267GbK
    public final ProfileBannerType AfV() {
        return this.A00;
    }
}
