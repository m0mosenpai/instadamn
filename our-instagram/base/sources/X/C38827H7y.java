package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H7y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38827H7y extends C0T6 implements JM1 {
    public final User A00;
    public final String A01;
    public final String A02;

    @Override // X.JM1
    public final C38827H7y F78(C1DY c1dy) {
        return this;
    }

    @Override // X.JM1
    public final C38827H7y F79(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38827H7y) {
                C38827H7y c38827H7y = (C38827H7y) obj;
                if (!C14360o3.A0K(this.A01, c38827H7y.A01) || !C14360o3.A0K(this.A00, c38827H7y.A00) || !C14360o3.A0K(this.A02, c38827H7y.A02)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.JM1
    public final String BGu() {
        return this.A01;
    }

    @Override // X.JM1
    public final User C5e() {
        return this.A00;
    }

    @Override // X.JM1
    public final String C5f() {
        return this.A02;
    }

    @Override // X.JM1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTTemplateInfo", AbstractC40776I5e.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A02, (AbstractC166987dD.A0J(this.A01) + AbstractC167017dG.A0M(this.A00)) * 31);
    }

    public C38827H7y(User user, String str, String str2) {
        AbstractC167017dG.A1Q(str, str2);
        this.A01 = str;
        this.A00 = user;
        this.A02 = str2;
    }

    @Override // X.JM1
    public final JM1 ECB(C1DY c1dy) {
        return this;
    }
}
