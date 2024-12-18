package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.EiS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C33069EiS extends AbstractC151906sa {
    @Override // X.AbstractC151906sa
    public final InterfaceC37108GWt A01() {
        InterfaceC37108GWt interfaceC37108GWt;
        UserSession userSession = this.A01.A09;
        C23031Ai A00 = AbstractC23021Ah.A00(userSession);
        if (!AbstractC167017dG.A1b(A00, A00.A5g, C23031Ai.A8c, 215) && C18U.A06(C06090Tz.A05, userSession, 36314871906765695L)) {
            interfaceC37108GWt = C36583GBh.A00;
        } else {
            interfaceC37108GWt = C36584GBi.A00;
        }
        return interfaceC37108GWt;
    }

    @Override // X.AbstractC151906sa
    public final void A02() {
        C23031Ai A00 = AbstractC23021Ah.A00(this.A01.A09);
        AbstractC167007dF.A1L(A00, A00.A5g, C23031Ai.A8c, 215, true);
    }
}
