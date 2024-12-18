package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HXO extends C17T implements InterfaceC43547JLh {
    public User A00;

    @Override // X.InterfaceC43547JLh
    public final User AnG() {
        User user = this.A00;
        if (user != null) {
            return user;
        }
        throw AbstractC166987dD.A1D("Please call reconciledWithStore() first to access the 'charityUser' field.");
    }

    @Override // X.InterfaceC43547JLh
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5B.A00(this));
    }

    @Override // X.InterfaceC43547JLh
    public final String Bin() {
        return A0h(-871218243);
    }

    @Override // X.InterfaceC43547JLh
    public final InterfaceC43547JLh EC0(C1DY c1dy) {
        this.A00 = AbstractC37302Gc3.A0P(c1dy, this, 1954752018);
        return this;
    }

    @Override // X.InterfaceC43547JLh
    public final C38823H7r F6o(C1DY c1dy) {
        return new C38823H7r((User) AbstractC37303Gc4.A07(c1dy, this, 1954752018), A0h(-871218243));
    }

    @Override // X.InterfaceC43547JLh
    public final C38823H7r F6p(C1DV c1dv) {
        return F6o(AbstractC25235BEs.A0b(c1dv));
    }
}
