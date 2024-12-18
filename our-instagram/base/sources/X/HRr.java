package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HRr extends C17T implements InterfaceC106814ri {
    public User A00;

    @Override // X.InterfaceC106814ri
    public final User BSW() {
        return this.A00;
    }

    @Override // X.InterfaceC106814ri
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40155HrP.A00(this));
    }

    @Override // X.InterfaceC106814ri
    public final String AnR() {
        return A0i(1523138936);
    }

    @Override // X.InterfaceC106814ri
    public final InterfaceC106814ri E9d(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -505296440);
        return this;
    }

    @Override // X.InterfaceC106814ri
    public final C106804rh Ey8(C1DY c1dy) {
        User user;
        User A0N;
        String A0i = A0i(1523138936);
        String A0i2 = A0i(-1711795453);
        String A0i3 = A0i(-1385596165);
        String A0i4 = A0i(-450506855);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -505296440);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C106804rh(user, A0i, A0i2, A0i3, A0i4, A0W(), A0j(1753008747));
    }

    @Override // X.InterfaceC106814ri
    public final C106804rh Ey9(C1DV c1dv) {
        return Ey8(AbstractC25235BEs.A0b(c1dv));
    }

    @Override // X.InterfaceC106814ri
    public final String getCurrentPrice() {
        return A0i(-1711795453);
    }

    @Override // X.InterfaceC106814ri
    public final String getExternalUrl() {
        return A0i(-1385596165);
    }

    @Override // X.InterfaceC106814ri
    public final String getFullPrice() {
        return A0i(-450506855);
    }

    @Override // X.InterfaceC106814ri
    public final String getName() {
        return A0W();
    }

    @Override // X.InterfaceC106814ri
    public final String getProductId() {
        return A0j(1753008747);
    }
}
