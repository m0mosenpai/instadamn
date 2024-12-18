package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HXX extends C17T implements InterfaceC43550JLk {
    public User A00;

    @Override // X.InterfaceC43550JLk
    public final Integer CBD() {
        return getOptionalIntValueByHashCode(3711);
    }

    @Override // X.InterfaceC43550JLk
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC43550JLk
    public final C38826H7x F76(C1DY c1dy) {
        User user;
        User A0N;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(3711);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38826H7x(user, A0K(3625706), optionalIntValueByHashCode);
    }

    @Override // X.InterfaceC43550JLk
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40772I5a.A00(this));
    }

    @Override // X.InterfaceC43550JLk
    public final Float CH3() {
        return A0K(3625706);
    }

    @Override // X.InterfaceC43550JLk
    public final InterfaceC43550JLk ECA(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }
}
