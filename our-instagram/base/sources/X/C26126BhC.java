package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.BhC, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26126BhC extends C0T6 implements InterfaceC31133DmG {
    public final ImageUrl A00;
    public final User A01;
    public final String A02;
    public final String A03;

    @Override // X.InterfaceC31133DmG
    public final C26126BhC Es2(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC31133DmG
    public final C26126BhC Es3(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26126BhC) {
                C26126BhC c26126BhC = (C26126BhC) obj;
                if (!C14360o3.A0K(this.A02, c26126BhC.A02) || !C14360o3.A0K(this.A00, c26126BhC.A00) || !C14360o3.A0K(this.A03, c26126BhC.A03) || !C14360o3.A0K(this.A01, c26126BhC.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC31133DmG
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsPivotPageHeader", CDC.A00(this));
    }

    public final int hashCode() {
        return (((((AbstractC167017dG.A0O(this.A02) * 31) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC167017dG.A0O(this.A03)) * 31) + AbstractC166997dE.A0I(this.A01);
    }

    public C26126BhC(ImageUrl imageUrl, User user, String str, String str2) {
        this.A02 = str;
        this.A00 = imageUrl;
        this.A03 = str2;
        this.A01 = user;
    }

    @Override // X.InterfaceC31133DmG
    public final ImageUrl AxF() {
        return this.A00;
    }

    @Override // X.InterfaceC31133DmG
    public final User BhV() {
        return this.A01;
    }

    @Override // X.InterfaceC31133DmG
    public final String getContentUrl() {
        return this.A02;
    }

    @Override // X.InterfaceC31133DmG
    public final String getMediaCount() {
        return this.A03;
    }

    @Override // X.InterfaceC31133DmG
    public final InterfaceC31133DmG E8s(C1DY c1dy) {
        return this;
    }
}
