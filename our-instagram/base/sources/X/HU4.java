package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HU4 extends C17T implements InterfaceC43561JLv {
    public User A00;

    @Override // X.InterfaceC43561JLv
    public final Integer CBD() {
        return getOptionalIntValueByHashCode(3711);
    }

    @Override // X.InterfaceC43561JLv
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC43561JLv
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40313HuI.A00(this));
    }

    @Override // X.InterfaceC43561JLv
    public final Integer Ac5() {
        return getOptionalIntValueByHashCode(-1412808770);
    }

    @Override // X.InterfaceC43561JLv
    public final InterfaceC43561JLv EAc(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.InterfaceC43561JLv
    public final C38782H5w F1V(C1DY c1dy) {
        User user;
        User A0N;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1412808770);
        Integer optionalIntValueByHashCode2 = getOptionalIntValueByHashCode(3711);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38782H5w(user, optionalIntValueByHashCode, optionalIntValueByHashCode2);
    }

    @Override // X.InterfaceC43561JLv
    public final C38782H5w F1W(C1DV c1dv) {
        return F1V(AbstractC37304Gc5.A09(c1dv));
    }
}
