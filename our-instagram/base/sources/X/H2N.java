package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;
import java.util.List;

/* loaded from: classes7.dex */
public final class H2N extends C0T6 implements InterfaceC43551JLl {
    public final User A00;
    public final String A01;
    public final List A02;

    public H2N(User user, String str, List list) {
        C14360o3.A0B(str, 1);
        this.A01 = str;
        this.A00 = user;
        this.A02 = list;
    }

    @Override // X.InterfaceC43551JLl
    public final H2N ErB(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43551JLl
    public final H2N ErC(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H2N) {
                H2N h2n = (H2N) obj;
                if (!C14360o3.A0K(this.A01, h2n.A01) || !C14360o3.A0K(this.A00, h2n.A00) || !C14360o3.A0K(this.A02, h2n.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43551JLl
    public final User BzF() {
        return this.A00;
    }

    @Override // X.InterfaceC43551JLl
    public final List BzM() {
        return this.A02;
    }

    @Override // X.InterfaceC43551JLl
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTBCAdsBoostPostAccessToken", AbstractC39766Hkc.A00(this));
    }

    @Override // X.InterfaceC43551JLl
    public final String getAccessToken() {
        return this.A01;
    }

    public final int hashCode() {
        return ((AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31) + AbstractC166997dE.A0I(this.A02);
    }

    @Override // X.InterfaceC43551JLl
    public final InterfaceC43551JLl E8i(C1DY c1dy) {
        return this;
    }
}
