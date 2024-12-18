package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HXP extends C17T implements InterfaceC43548JLi {
    public User A00;

    @Override // X.InterfaceC43548JLi
    public final User CDj() {
        return this.A00;
    }

    @Override // X.InterfaceC43548JLi
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, I5D.A00(this));
    }

    @Override // X.InterfaceC43548JLi
    public final Long C8e() {
        return A0L(55126294);
    }

    @Override // X.InterfaceC43548JLi
    public final InterfaceC43548JLi EC1(C1DY c1dy) {
        this.A00 = AbstractC31179DnN.A0T(c1dy, this);
        return this;
    }

    @Override // X.InterfaceC43548JLi
    public final C38824H7s F6q(C1DY c1dy) {
        User user;
        User A0N;
        String A0i = A0i(-1413853096);
        Long A0L = A0L(55126294);
        ImmutablePandoUserDict A0R = AbstractC37301Gc2.A0R(this);
        if (A0R != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0R)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38824H7s(user, A0L, A0i);
    }

    @Override // X.InterfaceC43548JLi
    public final String getAmount() {
        return A0i(-1413853096);
    }
}
