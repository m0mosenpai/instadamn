package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HXY extends C17T implements JM1 {
    public User A00;

    @Override // X.JM1
    public final User C5e() {
        return this.A00;
    }

    @Override // X.JM1
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40776I5e.A00(this));
    }

    @Override // X.JM1
    public final String BGu() {
        return A0h(-877823861);
    }

    @Override // X.JM1
    public final String C5f() {
        return A0k(1769642752);
    }

    @Override // X.JM1
    public final JM1 ECB(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -1741409040);
        return this;
    }

    @Override // X.JM1
    public final C38827H7y F78(C1DY c1dy) {
        User user;
        User A0N;
        String A0h = A0h(-877823861);
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -1741409040);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38827H7y(user, A0h, A0k(1769642752));
    }

    @Override // X.JM1
    public final C38827H7y F79(C1DV c1dv) {
        return F78(AbstractC37304Gc5.A09(c1dv));
    }
}
