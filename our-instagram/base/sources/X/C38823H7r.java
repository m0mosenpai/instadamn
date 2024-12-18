package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* renamed from: X.H7r, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38823H7r extends C0T6 implements InterfaceC43547JLh {
    public final User A00;
    public final String A01;

    @Override // X.InterfaceC43547JLh
    public final C38823H7r F6o(C1DY c1dy) {
        return this;
    }

    @Override // X.InterfaceC43547JLh
    public final C38823H7r F6p(C1DV c1dv) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38823H7r) {
                C38823H7r c38823H7r = (C38823H7r) obj;
                if (!C14360o3.A0K(this.A00, c38823H7r.A00) || !C14360o3.A0K(this.A01, c38823H7r.A01)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC43547JLh
    public final User AnG() {
        return this.A00;
    }

    @Override // X.InterfaceC43547JLh
    public final String Bin() {
        return this.A01;
    }

    @Override // X.InterfaceC43547JLh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC37300Gc1.A05("XDTDonationsPromptInfoDict", I5B.A00(this));
    }

    public final int hashCode() {
        return AbstractC25226BEj.A03(this.A01, AbstractC166987dD.A0G(this.A00));
    }

    public C38823H7r(User user, String str) {
        AbstractC167017dG.A1P(user, str);
        this.A00 = user;
        this.A01 = str;
    }

    @Override // X.InterfaceC43547JLh
    public final InterfaceC43547JLh EC0(C1DY c1dy) {
        return this;
    }
}
