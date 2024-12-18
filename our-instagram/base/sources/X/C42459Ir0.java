package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ir0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C42459Ir0 implements InterfaceC144646fk {
    public final Fragment A00;
    public final UserSession A01;
    public final InterfaceC686136y A02;
    public final InterfaceC60442pS A03;
    public final C689538g A04;

    public C42459Ir0(Fragment fragment, UserSession userSession, InterfaceC686136y interfaceC686136y, InterfaceC60442pS interfaceC60442pS, C689538g c689538g) {
        C14360o3.A0B(c689538g, 5);
        this.A02 = interfaceC686136y;
        this.A01 = userSession;
        this.A03 = interfaceC60442pS;
        this.A00 = fragment;
        this.A04 = c689538g;
    }

    @Override // X.InterfaceC144646fk
    public final void CkH(C41181vS c41181vS, String str, String str2) {
    }

    @Override // X.InterfaceC144646fk
    public final void DMN(C41181vS c41181vS, String str, String str2) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC144646fk
    public final void DS8(InterfaceC109864xE interfaceC109864xE, C38321qM c38321qM) {
        Fragment fragment;
        FragmentActivity activity;
        String actionUrl = interfaceC109864xE.getActionUrl();
        if (actionUrl != null && (activity = (fragment = this.A00).getActivity()) != null) {
            UserSession userSession = this.A01;
            InterfaceC60442pS interfaceC60442pS = this.A03;
            EnumC39628Hem A00 = EnumC39628Hem.A00(interfaceC109864xE);
            A00.A00 = interfaceC109864xE.getActionUrl();
            AbstractC41647Ibf.A00(A00, EnumC39624Hei.A00(interfaceC109864xE), c38321qM, interfaceC60442pS, userSession, C05F.A00);
            Integer A01 = AbstractC28293Cdf.A01(interfaceC109864xE);
            if (A01 != null) {
                int intValue = A01.intValue();
                if (intValue != 0) {
                    if (intValue == 3) {
                        this.A04.A00((C685836v) this.A02, null, actionUrl, AbstractC41653Ibl.A00(c38321qM, interfaceC60442pS.getModuleName()));
                    }
                } else {
                    C63397SjR c63397SjR = new C63397SjR(activity, userSession, C2Fb.A2R, actionUrl, false);
                    c63397SjR.A0E(userSession.userId);
                    AbstractC31175DnJ.A1M((InterfaceC11380iw) fragment, c63397SjR);
                }
            }
        }
    }

    @Override // X.InterfaceC144646fk
    public final void E5I(C41181vS c41181vS) {
    }
}
