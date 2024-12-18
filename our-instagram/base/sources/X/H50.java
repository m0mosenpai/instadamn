package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class H50 extends C0T6 implements JML {
    public final long A00;
    public final User A01;
    public final String A02;
    public final String A03;
    public final String A04;

    @Override // X.JML
    public final H50 Ez9(C1DY c1dy) {
        return this;
    }

    @Override // X.JML
    public final H50 EzA(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof H50) {
                H50 h50 = (H50) obj;
                if (!C14360o3.A0K(this.A02, h50.A02) || !C14360o3.A0K(this.A03, h50.A03) || !C14360o3.A0K(this.A04, h50.A04) || this.A00 != h50.A00 || !C14360o3.A0K(this.A01, h50.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JML
    public final String Bno() {
        return this.A02;
    }

    @Override // X.JML
    public final String Bnq() {
        return this.A03;
    }

    @Override // X.JML
    public final String Bnr() {
        return this.A04;
    }

    @Override // X.JML
    public final long Bnu() {
        return this.A00;
    }

    @Override // X.JML
    public final User Bny() {
        return this.A01;
    }

    @Override // X.JML
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTRepostInfo", AbstractC40210HsZ.A00(this));
    }

    public final int hashCode() {
        return AbstractC166987dD.A0I(this.A01, AbstractC25236BEt.A01(this.A00, AbstractC166997dE.A0K(this.A04, AbstractC166997dE.A0K(this.A03, AbstractC167017dG.A0O(this.A02) * 31))));
    }

    public H50(User user, String str, String str2, String str3, long j) {
        AbstractC167017dG.A1R(str2, str3);
        C14360o3.A0B(user, 5);
        this.A02 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A00 = j;
        this.A01 = user;
    }

    @Override // X.JML
    public final JML E9n(C1DY c1dy) {
        return this;
    }
}
