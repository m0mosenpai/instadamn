package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes6.dex */
public final class GG2 implements InterfaceC03950Jk {
    @Override // X.InterfaceC03950Jk
    public final /* bridge */ /* synthetic */ void ATX(UserSession userSession, InterfaceC03960Jm interfaceC03960Jm, Object obj) {
        C34623FNg c34623FNg = (C34623FNg) obj;
        String str = C1F8.A00(userSession).A04;
        c34623FNg.getClass();
        C03990Jp c03990Jp = new C03990Jp(c34623FNg.A02, interfaceC03960Jm);
        AbstractC59962oe abstractC59962oe = c34623FNg.A00;
        if (abstractC59962oe.isVisible()) {
            C1ON A00 = AbstractC34291FAl.A00(abstractC59962oe.requireContext(), c34623FNg.A01, c34623FNg.A03, c34623FNg.A04, c34623FNg.A05, str);
            A00.A00 = c03990Jp;
            abstractC59962oe.schedule(A00);
            return;
        }
        C0w9.A03("SecondaryAccountCreationNonLinkingOperation", "IgFragment in SecondaryAccountCreationNonLinkingOperation cannot be null!");
    }
}
