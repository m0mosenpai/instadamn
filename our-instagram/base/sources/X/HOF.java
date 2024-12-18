package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HOF extends C17T implements JM3 {
    public User A00;

    @Override // X.JM3
    public final User AdJ() {
        return this.A00;
    }

    @Override // X.JM3
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39856Hm4.A00(this));
    }

    @Override // X.JM3
    public final String AdD() {
        return A0i(-1249066087);
    }

    @Override // X.JM3
    public final String AdI() {
        return A0j(1123048935);
    }

    @Override // X.JM3
    public final String AdL() {
        return A0i(-900411602);
    }

    @Override // X.JM3
    public final JM3 E8v(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -927272610);
        return this;
    }

    @Override // X.JM3
    public final C38712H2y Esc(C1DY c1dy) {
        User user;
        User A0N;
        String A0i = A0i(-1249066087);
        String A0j = A0j(1123048935);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -927272610);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38712H2y(user, A0i, A0j, A0i(-900411602));
    }

    @Override // X.JM3
    public final C38712H2y Esd(C1DV c1dv) {
        return Esc(AbstractC25235BEs.A0b(c1dv));
    }
}
