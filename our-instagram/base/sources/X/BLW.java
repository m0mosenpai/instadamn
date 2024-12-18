package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;

/* loaded from: classes5.dex */
public final class BLW implements InterfaceC31060Dl2, InterfaceC31059Dl1 {
    public InterfaceC16660sJ A00;
    public final UserSession A01;
    public final InterfaceC60442pS A02;
    public final SearchContext A03;
    public final IG5 A04;
    public final /* synthetic */ BLN A05;

    @Override // X.InterfaceC31060Dl2
    public final void Cgu(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        InterfaceC16660sJ interfaceC16660sJ = this.A00;
        if (interfaceC16660sJ != null) {
            interfaceC16660sJ.invoke(c38321qM);
        }
    }

    @Override // X.InterfaceC31060Dl2
    public final void CyM(View view, C26053Bfg c26053Bfg, C37644Ghd c37644Ghd, C38321qM c38321qM, User user, C57 c57, Integer num, InterfaceC16620sF interfaceC16620sF) {
        AbstractC167007dF.A1E(c38321qM, 0, c37644Ghd);
        C14360o3.A0B(interfaceC16620sF, 7);
        UserSession userSession = this.A01;
        String str = AbstractC37497GfF.A00(userSession).A00;
        if (c26053Bfg != null && c57 != null && num != null && num.intValue() > 0 && !C14360o3.A0K(AbstractC25226BEj.A14(c38321qM), user) && !C14360o3.A0K(AbstractC166997dE.A0Y(userSession), user)) {
            Context A0F = AbstractC25225BEi.A0F(userSession);
            int A06 = c37644Ghd.A06();
            CLP.A00(A0F, c26053Bfg, userSession, user.Bhu(), c57, str, user.getUsername(), user.getId(), A06);
            return;
        }
        interfaceC16620sF.invoke(user, view);
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXs(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXv(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXw(InterfaceC16610sE interfaceC16610sE) {
        C14360o3.A0B(interfaceC16610sE, 0);
        this.A05.A04 = interfaceC16610sE;
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXx(InterfaceC16620sF interfaceC16620sF) {
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC31059Dl1
    public final void EXy(InterfaceC16660sJ interfaceC16660sJ) {
        throw C00O.createAndThrow();
    }

    public BLW(UserSession userSession, InterfaceC60442pS interfaceC60442pS, SearchContext searchContext, IG5 ig5) {
        this.A05 = new BLN(interfaceC60442pS, userSession, searchContext, AbstractC37497GfF.A00(userSession), ig5);
        this.A02 = interfaceC60442pS;
        this.A01 = userSession;
        this.A03 = searchContext;
        this.A04 = ig5;
    }

    @Override // X.InterfaceC31060Dl2
    public final void Cgv(C37644Ghd c37644Ghd, C38321qM c38321qM) {
        boolean A1a = AbstractC167017dG.A1a(c38321qM, c37644Ghd);
        C75113Zb c75113Zb = c37644Ghd.A0E;
        if (c75113Zb != null) {
            this.A05.A00(c38321qM, c75113Zb, A1a);
        }
    }

    @Override // X.InterfaceC31060Dl2
    public final void EXf(InterfaceC16660sJ interfaceC16660sJ) {
        this.A00 = interfaceC16660sJ;
    }

    @Override // X.InterfaceC31060Dl2
    public final void EXg(InterfaceC16610sE interfaceC16610sE) {
        EXw(interfaceC16610sE);
    }
}
