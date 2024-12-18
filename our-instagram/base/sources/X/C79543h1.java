package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.3h1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C79543h1 implements C3h2 {
    public final UserSession A00;
    public final Fragment A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final InterfaceC65282xQ A04;
    public final C689538g A05;
    public final User A06;

    public C79543h1(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, InterfaceC65282xQ interfaceC65282xQ, C689538g c689538g, User user) {
        C14360o3.A0B(c689538g, 6);
        this.A02 = interfaceC686136y;
        this.A00 = userSession;
        this.A03 = interfaceC60442pS;
        this.A01 = fragment;
        this.A04 = interfaceC65282xQ;
        this.A05 = c689538g;
        this.A06 = user;
    }

    @Override // X.C3h2
    public final void D3H(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        C14360o3.A0B(interfaceC38401qU, 0);
        C14360o3.A0B(interfaceC109864xE, 2);
        if (interfaceC38401qU instanceof C38321qM) {
            UserSession userSession = this.A00;
            C38321qM c38321qM = (C38321qM) interfaceC38401qU;
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e == null) {
                A1e = c38321qM;
            }
            AbstractC41653Ibl.A01(A1e, userSession);
            if (this.A01.isVisible()) {
                this.A04.CtR(c38321qM);
            }
            InterfaceC60442pS interfaceC60442pS = this.A03;
            C38321qM A1e2 = c38321qM.A1e(i);
            if (A1e2 == null) {
                A1e2 = c38321qM;
            }
            AbstractC41647Ibf.A00(EnumC39628Hem.CLEAR_MEDIA_COVER, EnumC39624Hei.A00(interfaceC109864xE), A1e2, interfaceC60442pS, userSession, C05F.A00);
        }
    }

    @Override // X.C3h2
    public final void D9l(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        C14360o3.A0B(interfaceC38401qU, 0);
        Fragment fragment = this.A01;
        Context context = fragment.getContext();
        if (context != null) {
            C38321qM c38321qM = (C38321qM) interfaceC38401qU;
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e == null) {
                A1e = c38321qM;
            }
            C42089Ikw.A00(context, null, fragment, new C39007HFj(this, A1e), null, new C39007HFj(this, A1e), null, null, this.A00, A1e);
        }
    }

    @Override // X.C3h2
    public final void DWg(InterfaceC109864xE interfaceC109864xE, InterfaceC38401qU interfaceC38401qU, int i) {
        String actionUrl;
        C14360o3.A0B(interfaceC38401qU, 0);
        C14360o3.A0B(interfaceC109864xE, 2);
        if ((interfaceC38401qU instanceof C38321qM) && (actionUrl = interfaceC109864xE.getActionUrl()) != null) {
            if (actionUrl.equals(AbstractC111324zv.A00(4139))) {
                AbstractC12220kQ.A01(null, this.A00);
            }
            C689538g c689538g = this.A05;
            C38321qM c38321qM = (C38321qM) interfaceC38401qU;
            C38321qM A1e = c38321qM.A1e(i);
            if (A1e == null) {
                A1e = c38321qM;
            }
            InterfaceC60442pS interfaceC60442pS = this.A03;
            c689538g.A00((C685836v) this.A02, null, actionUrl, AbstractC41653Ibl.A00(A1e, interfaceC60442pS.getModuleName()));
            UserSession userSession = this.A00;
            C38321qM A1e2 = c38321qM.A1e(i);
            if (A1e2 == null) {
                A1e2 = c38321qM;
            }
            EnumC39628Hem enumC39628Hem = EnumC39628Hem.OPEN_BLOKS_APP;
            enumC39628Hem.A00 = interfaceC109864xE.getActionUrl();
            AbstractC41647Ibf.A00(enumC39628Hem, EnumC39624Hei.A00(interfaceC109864xE), A1e2, interfaceC60442pS, userSession, C05F.A00);
        }
    }
}
