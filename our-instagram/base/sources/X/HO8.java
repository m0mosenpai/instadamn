package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HO8 extends C17T implements InterfaceC43555JLp {
    public User A00;

    @Override // X.InterfaceC43555JLp
    public final User BZm() {
        return this.A00;
    }

    @Override // X.InterfaceC43555JLp
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC39845Hlt.A00(this));
    }

    @Override // X.InterfaceC43555JLp
    public final InterfaceC43555JLp E8t(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, 963379097);
        return this;
    }

    @Override // X.InterfaceC43555JLp
    public final C38708H2u EsT(C1DY c1dy) {
        User user;
        User A0N;
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, 963379097);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38708H2u(user, A0j(-1970527703), A0i(403787451), A0j(-1824429564));
    }

    @Override // X.InterfaceC43555JLp
    public final String getOriginalCommentId() {
        return A0j(-1970527703);
    }

    @Override // X.InterfaceC43555JLp
    public final String getOriginalCommentText() {
        return A0i(403787451);
    }

    @Override // X.InterfaceC43555JLp
    public final String getOriginalMediaId() {
        return A0j(-1824429564);
    }
}
