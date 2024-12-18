package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.TextAppMentionType;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;

/* loaded from: classes7.dex */
public final class HV3 extends C17T implements InterfaceC43542JLc {
    public User A00;

    @Override // X.InterfaceC43542JLc
    public final TextAppMentionType BSO() {
        return (TextAppMentionType) A0N(2009353327, C43306JBz.A00);
    }

    @Override // X.InterfaceC43542JLc
    public final User BSR() {
        return this.A00;
    }

    @Override // X.InterfaceC43542JLc
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return AbstractC25234BEr.A0P(this, AbstractC40392Hvf.A00(this));
    }

    @Override // X.InterfaceC43542JLc
    public final InterfaceC43542JLc EB2(C1DY c1dy) {
        this.A00 = AbstractC37303Gc4.A0J(c1dy, this, -1198593471);
        return this;
    }

    @Override // X.InterfaceC43542JLc
    public final C38789H6e F2v(C1DY c1dy) {
        User user;
        User A0N;
        TextAppMentionType BSO = BSO();
        ImmutablePandoUserDict A0K = AbstractC37300Gc1.A0K(this, -1198593471);
        if (A0K != null && (A0N = AbstractC37300Gc1.A0N(c1dy, A0K)) != null) {
            user = AbstractC37300Gc1.A0M(c1dy, A0N);
        } else {
            user = null;
        }
        return new C38789H6e(BSO, user);
    }

    @Override // X.InterfaceC43542JLc
    public final C38789H6e F2w(C1DV c1dv) {
        return F2v(AbstractC37304Gc5.A09(c1dv));
    }
}
