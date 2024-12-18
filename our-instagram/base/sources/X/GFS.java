package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GFS implements InterfaceC37202GaD {
    public final Fragment A00;
    public final UserSession A01;
    public final AnonymousClass388 A02;

    @Override // X.InterfaceC37202GaD
    public final C193328hC AM3(C193328hC c193328hC) {
        c193328hC.A0m(this.A00, this.A01);
        return c193328hC;
    }

    @Override // X.InterfaceC37202GaD
    public final boolean CNB() {
        return this.A02.CCt().CNB();
    }

    public GFS(Fragment fragment, UserSession userSession, AnonymousClass388 anonymousClass388) {
        this.A01 = userSession;
        this.A00 = fragment;
        this.A02 = anonymousClass388;
    }

    @Override // X.InterfaceC37202GaD
    public final void EFN(C38321qM c38321qM, C75113Zb c75113Zb, int i, int i2) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.CCt().EFN(c38321qM, c75113Zb, i, i2);
    }

    @Override // X.InterfaceC37202GaD
    public final void F9n(C38321qM c38321qM, C75113Zb c75113Zb, int i, int i2) {
        AbstractC167017dG.A1N(c38321qM, c75113Zb);
        this.A02.CCt().F9n(c38321qM, c75113Zb, i, i2);
    }
}
