package X;

import com.instagram.common.session.UserSession;

/* loaded from: classes5.dex */
public final class BLY implements InterfaceC31018DkH {
    public final InterfaceC11380iw A00;
    public final UserSession A01;
    public final InterfaceC43589JPu A02;

    @Override // X.InterfaceC31018DkH
    public final void CK5(C50559MTq c50559MTq, int i, boolean z, boolean z2) {
        BQL bql;
        C14360o3.A0B(c50559MTq, 1);
        if (!z) {
            bql = BQL.A0I;
        } else if (z2) {
            bql = BQL.A0G;
        } else {
            bql = BQL.A0H;
        }
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UserSession userSession = this.A01;
        InterfaceC43589JPu interfaceC43589JPu = this.A02;
        long j = c50559MTq.A01;
        AbstractC37670Gi3.A08(EnumC120795dP.A0Y, bql, interfaceC11380iw, userSession, interfaceC43589JPu, null, (Long) c50559MTq.A02, (Long) c50559MTq.A03, c50559MTq.A04, i, j);
    }

    public /* synthetic */ BLY(InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        C37604Ggz A00 = AbstractC37497GfF.A00(userSession);
        C14360o3.A0B(A00, 3);
        this.A01 = userSession;
        this.A00 = interfaceC11380iw;
        this.A02 = A00;
    }

    @Override // X.InterfaceC31018DkH
    public final void Ckq(BLC blc, Integer num, int i, boolean z, boolean z2) {
        BQL bql;
        AbstractC167017dG.A1P(blc, num);
        if (num == C05F.A0C) {
            bql = BQL.A0u;
        } else if (!z) {
            bql = BQL.A0I;
        } else if (z2) {
            bql = BQL.A0G;
        } else {
            bql = BQL.A0H;
        }
        InterfaceC11380iw interfaceC11380iw = this.A00;
        UserSession userSession = this.A01;
        InterfaceC43589JPu interfaceC43589JPu = this.A02;
        long j = blc.A01;
        AbstractC37670Gi3.A05(EnumC120795dP.A0Y, bql, (EnumC37731Gj6) blc.A03, interfaceC11380iw, userSession, interfaceC43589JPu, null, (Long) blc.A02, (Long) blc.A04, i, j);
    }
}
