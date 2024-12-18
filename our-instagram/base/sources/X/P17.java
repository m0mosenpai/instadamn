package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* loaded from: classes9.dex */
public final class P17 implements InterfaceC58169PqZ {
    public C52366NFe A00;
    public final EnumC53380NjV A01;
    public final C81X A02;
    public final AbstractC59962oe A03;
    public final UserSession A04;
    public final InterfaceC58310Pt2 A05;
    public final C52474NJs A06;
    public final InterfaceC11380iw A07;

    @Override // X.InterfaceC58169PqZ
    public final /* synthetic */ void ADu() {
    }

    public static P17 A00(C52366NFe c52366NFe) {
        P17 p17 = c52366NFe.A09.A00;
        AnonymousClass229.A01(p17.A04).A1C(p17.A01, p17.A02);
        return p17;
    }

    @Override // X.InterfaceC58169PqZ
    public final View ANR() {
        InterfaceC43578JMm interfaceC43578JMm;
        Context requireContext = this.A03.requireContext();
        C54399O2f c54399O2f = new C54399O2f(this);
        UserSession userSession = this.A04;
        InterfaceC11380iw interfaceC11380iw = this.A07;
        String str = (String) AbstractC166987dD.A17(this.A06.A02);
        C14360o3.A0B(str, 4);
        C52366NFe c52366NFe = new C52366NFe(requireContext, interfaceC11380iw, userSession, c54399O2f, str);
        AbstractC50522MSa.A0y(c52366NFe);
        c52366NFe.setOrientation(1);
        this.A00 = c52366NFe;
        c52366NFe.A02 = true;
        User A10 = AbstractC166987dD.A10(userSession);
        InterfaceC43578JMm BzX = A10.A03.BzX();
        if (BzX != null && BzX.BB3()) {
            interfaceC43578JMm = A10.A03.BzX();
        } else {
            interfaceC43578JMm = null;
        }
        c52366NFe.setExistingFundraiserInfo(interfaceC43578JMm);
        C52366NFe c52366NFe2 = this.A00;
        if (c52366NFe2 == null) {
            C14360o3.A0F("fundraiserTagRow");
            throw C00O.createAndThrow();
        }
        return c52366NFe2;
    }

    @Override // X.InterfaceC58169PqZ
    public final EnumC53380NjV B2J() {
        return this.A01;
    }

    @Override // X.InterfaceC58169PqZ
    public final C81X BIL() {
        return this.A02;
    }

    @Override // X.InterfaceC58169PqZ
    public final void Ctj() {
        AbstractC59962oe abstractC59962oe = this.A03;
        C07S c07s = C07S.STARTED;
        C07X viewLifecycleOwner = abstractC59962oe.getViewLifecycleOwner();
        AbstractC166987dD.A1Z(C57173PZr.A02(viewLifecycleOwner, c07s, this, null, 38), C07Y.A00(viewLifecycleOwner));
    }

    public P17(AbstractC59962oe abstractC59962oe, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC58310Pt2 interfaceC58310Pt2, C52474NJs c52474NJs) {
        JQ0.A1O(abstractC59962oe, userSession, interfaceC58310Pt2, c52474NJs, interfaceC11380iw);
        this.A03 = abstractC59962oe;
        this.A04 = userSession;
        this.A05 = interfaceC58310Pt2;
        this.A06 = c52474NJs;
        this.A07 = interfaceC11380iw;
        this.A02 = C81X.A02;
        this.A01 = EnumC53380NjV.A02;
    }
}
