package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EiT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33070EiT extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        C70D c70d = this.A01;
        if (AbstractC151756sL.A01()) {
            AbstractC151756sL.A00();
            UserSession userSession = c70d.A09;
            if (C18U.A06(C06090Tz.A05, userSession, 36321043774579808L) && C37351oY.A00(userSession) && AbstractC166987dD.A0x(userSession).getInt(MSV.A00(243), 0) < 2) {
                interfaceC37108GWt = C36583GBh.A00;
                return interfaceC37108GWt;
            }
        }
        interfaceC37108GWt = C36584GBi.A00;
        return interfaceC37108GWt;
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C70D c70d = this.A01;
        if (AbstractC151756sL.A01()) {
            C37351oY A00 = AbstractC151756sL.A00();
            UserSession userSession = c70d.A09;
            if (A00.A05(userSession)) {
                InterfaceC19610xo A0w = AbstractC166987dD.A0w(AbstractC23021Ah.A00(userSession));
                A0w.E7D(MSV.A00(243), 2);
                A0w.apply();
                AbstractC31174DnI.A0d().A04(c70d.A06, userSession, null, c70d.A0I, "opal_profile_menu", false, false);
            }
        }
    }
}
