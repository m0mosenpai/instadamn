package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.common.session.UserSession;
import com.instagram.settings.privacy.messages.DirectMessageInteropReachabilityOptions;
import com.instagram.settings.privacy.messages.DirectMessagesInteropOptionsViewModel;

/* loaded from: classes6.dex */
public final class GGC implements InterfaceC58070Pov {
    public final FragmentActivity A00;
    public final UserSession A01;

    @Override // X.InterfaceC58070Pov
    public final void CrL(DirectMessagesInteropOptionsViewModel directMessagesInteropOptionsViewModel, Integer num, String str, DirectMessageInteropReachabilityOptions[] directMessageInteropReachabilityOptionsArr, int i, boolean z) {
        C14360o3.A0B(directMessageInteropReachabilityOptionsArr, 3);
        OQ4.A00(null, this.A00, this.A01, directMessagesInteropOptionsViewModel, num, str, directMessageInteropReachabilityOptionsArr, i, z);
    }

    public final void A00(String str) {
        boolean A1U;
        boolean A1U2;
        C08730cb c08730cb = C17060sy.A01;
        UserSession userSession = this.A01;
        EnumC222416a A0l = AbstractC31174DnI.A0l(userSession, c08730cb);
        if (!C2E7.A03(AbstractC31178DnM.A0T(userSession))) {
            A1U = false;
        } else {
            A1U = AbstractC31177DnL.A1U(C06090Tz.A05, userSession, 36311942737953609L);
        }
        if (!C2E7.A03(AbstractC31178DnM.A0T(userSession))) {
            A1U2 = false;
        } else {
            A1U2 = AbstractC31177DnL.A1U(C06090Tz.A05, userSession, 36311942738019146L);
        }
        OQ4.A01(new DirectMessagesInteropOptionsViewModel(null, null, null, null, null, null, null, null, null, null), this, A0l, str, A1U, A1U2, C196068lw.A02(C196068lw.A00(userSession).A00(CallerContext.A01("DirectMessagesOptionsBloksBridgeNavigatorDelegate"))));
    }

    @Override // X.InterfaceC58070Pov
    public final void Cqa() {
        C140966Yy A0P = AbstractC31173DnH.A0P(this.A00, this.A01);
        A0P.A0D(new EJ1());
        A0P.A04();
    }

    public GGC(FragmentActivity fragmentActivity, UserSession userSession) {
        AbstractC167017dG.A1P(fragmentActivity, userSession);
        this.A00 = fragmentActivity;
        this.A01 = userSession;
    }
}
